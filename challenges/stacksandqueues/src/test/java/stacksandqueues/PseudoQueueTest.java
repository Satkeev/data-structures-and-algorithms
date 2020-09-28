package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue<Integer> test = new PseudoQueue<>();

    @Test
    public void testConstructor() {
        assertNotNull(test);
        assertNull(test.front);
        
    }

    @Test
    public void testEnqueue() {

        assertEquals("The front should now point to this new Node", (Integer) 1, test.front.getNodeValue());
        test.enqueue(2);

        assertEquals("The front should still hold the value of 1", (Integer) 1, test.front.getNodeValue());
        
    }



    @Test
    public void testPeek() {
        assertNull("Peeking an empty list should return null", test.peek());

        test.enqueue(1);

        assertEquals("Peeking should now give back the Node with value 1", (Integer) 1, test.peek().getNodeValue());

        test.enqueue(2);

        assertEquals("Peeking should still give back the same Node", (Integer) 1, test.peek().getNodeValue());
    }

}
