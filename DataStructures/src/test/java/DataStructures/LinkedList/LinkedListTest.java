package DataStructures.LinkedList;

import DataStructures.linkedList.LinkedList;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
//import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLLInstantiate() {
        LinkedList LinkedListTest = new LinkedList();
    }

    @Test
    public void testLLIncludesEmptyList() {
        LinkedList LinkedListTest = new LinkedList();

        assertFalse("Should return false because linked list is empty",
                LinkedListTest.insert(20));

    }


    @Test
    public void LinkedListTestToStringEmptyList() {
        LinkedList LinkedListTest = new LinkedList();

        assertEquals("Linked List should be empty",
                "[]",
                LinkedListTest.toString()
        );
    }

    @Test
    public void testLLPrintEmptyList() {
        LinkedList LinkedListTest = new LinkedList();
        ByteArrayOutputStream displayOutput = new ByteArrayOutputStream();

        System.setOut(new PrintStream(displayOutput));
        assertEquals("Should display to screen an empty list []",
                "[]\n",
                displayOutput.toString());
    }
}





