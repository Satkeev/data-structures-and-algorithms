package datastructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test public void testNewStack() {
        Stack stack = new Stack();
        assertNotNull("stack should exist", stack);
        assertNull("top field should instantiate as null", stack.top);
    }

    @Test public void testPush() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("top field should have a node with given value", 3, stack.top.getValue());

        stack.push(4);
        assertEquals("top field should have a node with given value", 4, stack.top.getValue());
        assertEquals("top field should have a node with a next field pointing to the previous top node",
                3,
                stack.top.getNext().getValue());
    }

    @Test public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue("a new stack should return as empty", stack.isEmpty());

        stack.push(3);
        assertFalse("a stack with an existing node should return as not empty", stack.isEmpty());
    }



    @Test public void testToString() {
        Stack stack = new Stack();
        assertEquals("NULL", stack.toString());

        stack.push(3);
        assertEquals("{3} -> NULL", stack.toString());

        stack.push(4);
        assertEquals("{4} -> {3} -> NULL", stack.toString());
    }
}
