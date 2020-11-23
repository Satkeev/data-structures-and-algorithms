package datastructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void testNewQueue() {
        Queue queue = new Queue();
        assertNotNull("queue should exist", queue);
        assertNull("front field should instantiate as null", queue.front);
        assertNull("back field should instantiate as null", queue.back);
    }

    @Test public void testEnqueue() {
        Queue queue = new Queue();
        queue.enqueue(3);
        assertEquals("front field should have a new node", 3, queue.front.getValue());
        assertEquals("back field should have the same node", 3, queue.back.getValue());

        queue.enqueue(4);
        assertEquals("front field should retain pointer to the previous node", 3, queue.front.getValue());
        assertEquals("back field should point to the new node", 4, queue.back.getValue());
    }

    @Test public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue("newly instantiated queue should return empty", queue.isEmpty());
        queue.enqueue(3);
        assertFalse("with any node in front, queue should return as not empty", queue.isEmpty());
        queue.enqueue(4);
        assertFalse("with multiple nodes, queue should return as not empty", queue.isEmpty());
    }




    @Test public void testToString() {
        Queue queue = new Queue();
        assertEquals("NULL", queue.toString());

        queue.enqueue(3);
        assertEquals("{3} -> NULL", queue.toString());

        queue.enqueue(4);
        assertEquals("{3} -> {4} -> NULL", queue.toString());
    }
}
