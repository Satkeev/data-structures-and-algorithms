package datastructure.linkedList;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
//import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList test = new LinkedList();


    @Test
    public void testLinkedList() {
        assertNull("Should create a list with a head value that is null", test.head);
    }

    @Test
    public void testInsert() {
        test.insert(4);
        assertEquals("Value should now be 4", 4, test.head.value);
        assertNull("Value should now be null", test.head.next);

        test.insert(6);
        assertEquals("Value should now be 6", 6, test.head.value);
        assertEquals("Value should be our previous head value of 6", 6, test.head.next.value);
        assertNull("Call the value at the end should give null", test.head.next.next);
    }

    @Test
    public void testIncludes() {
        assertFalse("includes should return false for a value that is not contained in the linked list", test.includes(8));

        test.insert(10);
        assertTrue("includes should return true for a value that is contained in the linked list", test.includes(10));
    }

    @Test
    public void testIncludesMoreNodes() {
        test.insert(0);
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.insert(4);


        assertTrue("Will return true even in if the value is the first in the list", test.includes(3));
        assertTrue("Will return true even in if the value is the last in the list", test.includes(0));
        assertFalse("should still return false for a value not in the list", test.includes(4));
    }
}