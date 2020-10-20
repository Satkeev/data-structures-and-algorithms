package insertionsort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestinsertSort {
    @Test
    public void testInsertSorter(){
        int[] lostNumber = {8,4,23,42,16,15};
        insertSort insertSort = new insertSort();
        int[] correctNumber =  {4, 8, 15, 16, 23, 42};
        assertEquals(correctNumber.toString(), lostNumber.toString());
    }
}



