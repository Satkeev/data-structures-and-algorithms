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

    @Test public void testAppend() {
        LinkedList testList = new LinkedList();
        testList.append(2);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        assertEquals("should return string representing all nodes", "{5} -> {5} -> {5} -> {2} -> NULL", testList.toString());
        testList.append(-4);
        assertEquals("should now end with -4", "{5} -> {5} -> {5} -> {2} -> {-4} -> NULL", testList.toString());
    }

    @Test public void testInsertBefore() throws Exception {
        LinkedList testList = new LinkedList();
        testList.append(2);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        assertEquals("should return string representing all nodes", "{5} -> {5} -> {5} -> {2} -> NULL", testList.toString());
        testList.insertBefore(2, 6);
        assertEquals("should now start include 6 before 2", "{5} -> {5} -> {5} -> {6} -> {2} -> NULL", testList.toString());
    }

    @Test public void testInsertAfter() throws Exception {
        LinkedList testList = new LinkedList();
        testList.append(2);
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        assertEquals("should return string representing all nodes", "{5} -> {5} -> {5} -> {2} -> NULL", testList.toString());
        testList.insertAfter(5, 6);
        assertEquals("should now start include 6 after the first 5", "{5} -> {6} -> {5} -> {5} -> {2} -> NULL", testList.toString());
        testList.insertAfter(6, 0);
        assertEquals("should now start include 6 after the first 5", "{5} -> {6} -> {0} -> {5} -> {5} -> {2} -> NULL", testList.toString());
    }
    }


