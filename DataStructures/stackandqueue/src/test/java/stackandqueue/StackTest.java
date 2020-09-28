package stackandqueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    Stack testStack;

    @Before
    public void setUpStack() {
        this.testStack = new Stack();
    }

    @After
    public void tearDownStack() {
        this.testStack = null;
    }

    @Test
    public void testStackInstantiate() {
        Stack instanceStack = new Stack();
    }

    @Test(expected = IllegalStateException.class)
    public void testStackPopEmptyStack() {
        this.testStack.pop();
    }

    @Test(expected = IllegalAccessError.class)
    public void testStackPeekEmptyStack() {
        this.testStack.peek();
    }

    @Test
    public void testStackBasicPush() {
        this.testStack.push(1);
    }

    @Test
    public void testStackBasicPop() {
        this.testStack.push(2);
        assertEquals("Should return the correct value",
                2,
                this.testStack.pop()
        );
    }

    @Test
    public void testStackBasicPeek() {
        this.testStack.push(3);
        assertEquals("Should return the correct value",
                3,
                this.testStack.peek()
        );
    }

    @Test
    public void testStackMultiPush() {
        this.testStack.push(11);
        this.testStack.push(22);
    }

    @Test
    public void testStackMultiPop() {
        this.testStack.push(44);
        this.testStack.push(55);
        this.testStack.push(66);
        assertEquals("Should return the correct value",
                66,
                this.testStack.pop()
        );
        assertEquals("Should return the correct value",
                55,
                this.testStack.pop()
        );
        assertEquals("Should return the correct value",
                44,
                this.testStack.pop()
        );
    }

    @Test(expected = IllegalStateException.class)
    public void testStackMultiPopFail() {
        this.testStack.push(11);
        this.testStack.push(33);
        this.testStack.pop();
        this.testStack.pop();
        this.testStack.pop();
    }

    @Test
    public void testStackMultiPeek() {
        this.testStack.push(22);
        this.testStack.push(44);
        this.testStack.push(77);
        assertEquals("Should return the correct value",
                77,
                this.testStack.peek()
        );
        assertEquals("Should return the correct value",
                77,
                this.testStack.peek()
        );
        assertEquals("Should return the correct value",
                77,
                this.testStack.peek()
        );
    }

    @Test(expected = IllegalAccessError.class)
    public void testStackMultiPeekFail() {
        this.testStack.push(11);
        this.testStack.push(22);
        this.testStack.pop();
        this.testStack.pop();
        this.testStack.peek();
    }

    @Test
    public void testStackMultipleTests() {
        this.testStack.push(101);
        assertEquals("Should return the correct value",
                101,
                this.testStack.peek()
        );
        assertEquals("Should return the correct value",
                101,
                this.testStack.pop()
        );
        this.testStack.push(202);
        this.testStack.push(303);
        this.testStack.pop();
        assertEquals("Should return the correct value",
                202,
                this.testStack.peek()
        );
        this.testStack.push(404);
        this.testStack.push(505);
        assertEquals("Should return the correct value",
                505,
                this.testStack.pop()
        );
        assertEquals("Should return the correct value",
                404,
                this.testStack.pop()
        );
        assertEquals("Should return the correct value",
                202,
                this.testStack.pop()
        );
    }
}