package datastructures.linkedlist;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testNewLinkedList() {
        LinkedList testList = new LinkedList();
        assertEquals("an empty linked list is instantiated", "NULL", testList.toString());
    }

    @Test public void testInsert() {
        LinkedList testList = new LinkedList();
        testList.insert(2);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        assertEquals("should return string representing all nodes", "{5} -> {5} -> {5} -> {2} -> NULL", testList.toString());
        testList.insert(-4);
        assertEquals("should now start with -4", "{-4} -> {5} -> {5} -> {5} -> {2} -> NULL", testList.toString());
    }

    @Test public void testIncludes() {
        LinkedList testList = new LinkedList();
        testList.insert(2);
        testList.insert(5);
        testList.insert(5);
        assertTrue("Should return true", testList.includes(5));
        assertFalse("Should return false", testList.includes(3));
    }

  
    }


