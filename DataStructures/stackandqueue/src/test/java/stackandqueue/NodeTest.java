package stackandqueue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    private Node testNode;

    @Before
    public void setUpTestNode() {
        this.testNode = new Node(1);
    }

    @Test
    public void testNodeInstantiateOne() {
        Node testNode = new Node(1);
    }

    @Test
    public void testNodeInstantiateTwo() {
        Node testNode = new Node(1, null);
    }

    @Test
    public void testGetValue() {
        assertEquals("Should return the right value",
                1,
                this.testNode.getValue()
        );
    }

    @Test
    public void testSetValue() {
        this.testNode.setValue(2);
        assertEquals("Should return the right value",
                2,
                testNode.getValue()
        );
    }

    @Test
    public void testGetNext() {
        assertNull("Should return null",
                testNode.getNext()
        );
    }

    @Test
    public void testSetNext() {
        Node testNode2 = new Node(5);

        this.testNode.setNext(testNode2);
        assertNotNull("Should not be null",
                this.testNode.getNext()
        );
    }
}