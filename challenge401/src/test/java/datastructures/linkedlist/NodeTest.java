package datastructures.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test public void testNewNode() {
        assertNotNull("a Node should exist", new Node(3));
    }

    @Test public void testValueMethods() {
        Node node = new Node(3);
        assertEquals("getValue() method should return the value field", 3, node.getValue());
        node.setValue(1);
        assertEquals("the value field should be set to 1", 1, node.getValue());
    }

    @Test public void testNextMethods() {
        Node node = new Node(3);
        assertNull("getNext() method should return next field starting value of null", node.getNext());
        node.setNext(new Node(5));
        assertEquals("next field should be set to a new Node with a value of 5", 5, node.getNext().getValue());
    }
}
