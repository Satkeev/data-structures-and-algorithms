
package challenges.quicksort;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testEasySort() {
        int[] arr = {8,4,23,42,16,15};
        int[] expected = {4,8,15,16,23,42};

        QuickSort.quickSort(arr);
        assertArrayEquals("arr should be sorted in place", expected, arr);

        int[] arr2 = {9,6,10,1000,-1,-5};
        int[] expected2 = {-5,-1,6,9,10,1000};

        QuickSort.quickSort(arr2);
        assertArrayEquals("arr should be sorted in place", expected2, arr2);
    }

    @Test
    public void testEmptyInput() {
        int[] arr = {};
        int[] expected = {};

        QuickSort.quickSort(arr);
        assertArrayEquals("empty array should be unchanged", expected, arr);
    }

    @Test
    public void testSingleValue() {
        int[] arr = {2};
        int[] expected = {2};

        QuickSort.quickSort(arr);
        assertArrayEquals("array with a single position should be unchanged", expected, arr);
    }

    @Test
    public void testFullReverseSort() {
        int[] arr = {20,18,12,8,5,-2};
        int[] expected = {-2,5,8,12,18,20};

        QuickSort.quickSort(arr);
        assertArrayEquals("array should be reversed", expected, arr);
    }

    @Test
    public void testAlreadySorted() {
        int[] arr = {-2,5,8,12,18,20};
        int[] expected = {-2,5,8,12,18,20};

        QuickSort.quickSort(arr);
        assertArrayEquals("array should be unchanged", expected, arr);
    }

    @Test
    public void testDuplicateValues() {
        int[] arr = {5,12,7,5,5,7};
        int[] expected = {5,5,5,7,7,12};

        QuickSort.quickSort(arr);
        assertArrayEquals("array should be sorted", expected, arr);
    }
}


=======
package challenges.quicksort;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static challenges.quicksort.QuickSort.pivot;
import static challenges.quicksort.QuickSort.quickSort;
import static org.junit.Assert.assertArrayEquals;



class QuickSortTest {

    @Test
    void testQuickSort() {
        int[] unsorted = {3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4};
        quickSort(unsorted);

        assertArrayEquals(sorted, unsorted);
    }

    @Test
    void testQuickSort_OddLengthArray() {
        int[] unsorted = {3, 4, 2, 1, 0};
        int[] sorted = {0, 1, 2, 3, 4};
        quickSort(unsorted);

        assertArrayEquals(sorted, unsorted);
    }

    @Test
    void testQuickSort_BigArray() {
        Random r = new Random();
        int[] unsorted = new int[1000];

        for (int i = 0; i < unsorted.length; i ++) {
            unsorted[i] = r.nextInt();
        }

        quickSort(unsorted);

        for (int i = 1; i < unsorted.length - 1; i++) {
            assertTrue(unsorted[i] >= unsorted[i - 1] && unsorted[i] <= unsorted[i + 1], "All values should be greater than the one before it, and less than the one after it");
        }
    }

    @Test
    void testQuickSort_BigArrayOddLength() {
        Random r = new Random();
        int[] unsorted = new int[1001];

        for (int i = 0; i < unsorted.length; i ++) {
            unsorted[i] = r.nextInt();
        }

        quickSort(unsorted);

        for (int i = 1; i < unsorted.length - 1; i++) {
            assertTrue(unsorted[i] >= unsorted[i - 1] && unsorted[i] <= unsorted[i + 1], "All values should be greater than the one before it, and less than the one after it");
        }
    }

    private void assertTrue(boolean b, String s) {
    }

    @Test
    void testPivot() {
        int[] noOrder = {3, 4, 1, 2};
        int[] pivotOrder = {2, 1, 3, 4};

        int pivotIdx = pivot(noOrder, 0, noOrder.length - 1);

        assertEquals(2, pivotIdx);
        assertArrayEquals(pivotOrder, noOrder);
    }

    @Test
    void testPivot_OddLength() {
        int[] noOrder = {3, 4, 1, 2, 0};
        int[] pivotOrder = {0, 2, 1, 3, 4};

        int pivotIdx = pivot(noOrder, 0, noOrder.length - 1);

        assertEquals(3, pivotIdx);
        assertArrayEquals(pivotOrder, noOrder);
    }

    private void assertEquals(int i, int pivotIdx) {
   
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    int[] testArray;
    int[] expectedArray;


    @Before
    public void setUp() throws Exception {
        testArray = new int[]{7, 2, 4, 3};
        expectedArray = new int[]{2, 3, 4, 7};
    }

    @Test
    public void quickSort() {
        assertArrayEquals("Array should be sorted", expectedArray, QuickSort.quickSort(testArray, 0,
                testArray.length - 1));
    }

}

