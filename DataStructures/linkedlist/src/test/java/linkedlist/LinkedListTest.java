package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {


    @Test public void testZipLists() {
        LinkedList testOne = new LinkedList();
        LinkedList testTwo = new LinkedList();
        testOne.append(2);
        testOne.append(3);
        testOne.append(1);
        testTwo.append(4);
        testTwo.append(9);
        testTwo.append(5);
        System.out.println(testOne);
        System.out.println(testTwo);
        LinkedList output = LinkedList.zipLists(testOne, testTwo);
        assertEquals(output.head.value, 4);
        assertEquals(output.head.next.value, 2);
        assertEquals(output.head.next.next.value, 9);
    }


}
