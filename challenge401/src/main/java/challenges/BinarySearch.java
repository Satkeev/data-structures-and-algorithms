package challenges;

public class BinarySearch {

    public static int binarySearch(int[] inputArray, int searchKey) {
        int start = 0;
        int end = inputArray.length;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (inputArray[mid] == searchKey) {
                return mid;
            } else if (inputArray[mid] > searchKey) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (start == inputArray.length) {
            return -1;
        }
        if (inputArray[start] == searchKey) {
            return start;
        } else {
            return -1;
        }
    }
        }
