package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testArrayShift() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] array = {2,5,7,8,9};
        //declare random array
        int n = 10;
        //define random n
        int[] outputArray = classUnderTest.ShiftArray(array, n);
        int middle = outputArray.length/2;
        assertEquals(n, outputArray[middle]);

    }
}

