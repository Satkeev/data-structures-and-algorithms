package datastructures.hashtable;

import static org.junit.Assert.*;

public class HashTableTest {
    HashTable<String, Integer> ht = new HashTable<>(6);

    void testConstructor() {
        assertEquals(6, ht.size());
    }


    void testAdd() {
        ht.add("Value 1", 1);
        ht.add("Value 2", 2);
        ht.add("Value 3", 3);
        ht.add("Value 4", 4);
        ht.add("Value 5", 5);
        ht.add("Value 6", 6);
        ht.add("Value 7", 7);
    }

    void testContains() {
        ht.add("Value 1", 1);
        ht.add("Value 2", 2);
        ht.add("Value 3", 3);
        ht.add("Value 4", 4);

        assertTrue(ht.contains("Value 1"));
        assertTrue(ht.contains("Value 4"));
        assertFalse(ht.contains("Value 8"));
    }

    void testFind() {
        ht.add("Value 1", 1);
        ht.add("Value 2", 2);
        ht.add("Value 3", 3);
        ht.add("Value 4", 4);

        //This is a hack that allows for comparison. Currently the find method has some issues returning values of the proper class.
        //Most likely an issue with generics/the way key + value pairs are stored at the moment
        String ans1 = ht.find("Value 1") + "";
        String ans2 = ht.find("Value 3") + "";
        String ans3 = ht.find("Value 4") + "";
        assertEquals( 1, Integer.parseInt(ans1));
        assertEquals( 3, Integer.parseInt(ans2));
        assertEquals( 4, Integer.parseInt(ans3));
    }
}
