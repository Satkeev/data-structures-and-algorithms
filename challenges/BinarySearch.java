import java.util.Arrays;

public class BinarySearch {

   // public static void main(String[] args) {

   //    int inputArray[] = {4,8,15,16,23, 42};
   //    Arrays.sort(inputArray);

   //    System.out.println("The sorted int array is:");

   //    for (int number : inputArray) {
   //      System.out.println("Number = " + number);

   //    }
   //    int searchValue = 15;

   //    int binValue = Arrays.binarySearch(inputArray,searchValue);

   //    System.out.println("The index of element 15 is : " + binValue);

   // }

public int Search(int[] InArray, int biValue) {
   //  int InArray[] = {4,8,15,16,23,42};
    int low = 0;
    int high = InArray.length - 1;
    int middle;
   //  int biValue = 15;


    while (low <= high) {
        middle = (low + high) / 2;

        if (InArray[middle] < biValue) {
            low = middle + 1;
        } else if (InArray[middle] > biValue) {
            high = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}
}
