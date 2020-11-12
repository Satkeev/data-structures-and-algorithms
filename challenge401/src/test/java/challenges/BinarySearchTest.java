package challenges;
  import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class BinarySearchTest {
        @Test public void testBinarySearch() {
            BinarySearch search = new BinarySearch();
            int[] testArr = {1,2,3,4,5,6,7};
            assertEquals(0, search.binarySearch(testArr, 1));
            assertEquals(4, search.binarySearch(testArr, 5));
            assertEquals(-1, search.binarySearch(testArr, 9));
        }
    }
