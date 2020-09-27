package stackandqueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    Queue testQueue;

    @Before
    public void setUpQueue() {
        this.testQueue = new Queue();
    }

    @After
    public void tearDownQueue() {
        this.testQueue = null;
    }

    @Test
    public void testQueueInstance() {
        new Queue();
    }

    @Test(expected = IllegalStateException.class)
    public void testQueueDequeueEmptyQ() {
        this.testQueue.dequeue();
    }

    @Test(expected = IllegalAccessError.class)
    public void testQueuePeekEmptyQ() {
        this.testQueue.peek();
    }

    @Test
    public void testQueueBasicEnqueue() {
        this.testQueue.enqueue(1);
    }

    @Test
    public void testQueueBasicDequeue() {
        this.testQueue.enqueue(2);
        assertEquals("Should return the correct value",
                2,
                this.testQueue.dequeue()
        );
    }

    @Test
    public void testQueueBasicPeek() {
        this.testQueue.enqueue(3);
        assertEquals("Should return the correct value",
                3,
                this.testQueue.peek()
        );
    }

    @Test
    public void testQueueMultiEnqueue() {
        this.testQueue.enqueue(5);
        this.testQueue.enqueue(3);
        this.testQueue.enqueue(1);
    }

    @Test
    public void testQueueMultiDequeue() {
        this.testQueue.enqueue(2);
        this.testQueue.enqueue(5);
        this.testQueue.enqueue(8);
        assertEquals("Should return the correct value",
                2,
                this.testQueue.dequeue()
        );
        assertEquals("Should return the correct value",
                5,
                this.testQueue.dequeue()
        );
        assertEquals("Should return the correct value",
                8,
                this.testQueue.dequeue()
        );
    }

    @Test
    public void testQueueMultiPeek() {
        this.testQueue.enqueue(31);
        this.testQueue.enqueue(21);
        this.testQueue.enqueue(11);
        assertEquals("Should return the correct value",
                31,
                this.testQueue.peek()
        );
        assertEquals("Should return the correct value",
                31,
                this.testQueue.peek()
        );
        assertEquals("Should return the correct value",
                31,
                this.testQueue.peek()
        );
    }

    @Test(expected = IllegalStateException.class)
    public void testQueueMultiDequeueFail() {
        this.testQueue.enqueue(103);
        this.testQueue.enqueue(202);
        this.testQueue.enqueue(301);
        this.testQueue.dequeue();
        this.testQueue.dequeue();
        this.testQueue.dequeue();
        this.testQueue.dequeue();
    }

    @Test(expected = IllegalAccessError.class)
    public void testQueueMultiPeekFail() {
        this.testQueue.enqueue(77);
        this.testQueue.enqueue(88);
        this.testQueue.enqueue(99);
        this.testQueue.dequeue();
        this.testQueue.dequeue();
        this.testQueue.dequeue();
        this.testQueue.peek();
    }

    @Test
    public void testQueueMultiTest() {
        this.testQueue.enqueue(6);
        assertEquals("Should return the correct value",
                6,
                this.testQueue.peek()
        );
        assertEquals("Should return the correct value",
                6,
                this.testQueue.dequeue()
        );
        this.testQueue.enqueue(9);
        this.testQueue.enqueue(-8);
        assertEquals("Should return the correct value",
                9,
                this.testQueue.dequeue()
        );
        assertEquals("Should return the correct value",
                -8,
                this.testQueue.peek()
        );
        assertEquals("Should return the correct value",
                -8,
                this.testQueue.dequeue()
        );
    }
}