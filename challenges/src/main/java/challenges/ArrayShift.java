package challenges;

public class ArrayShift {

    public static int[] ShiftArray ( int[] InArray, int newValue){



        int[] OutArray = new int[InArray.length + 1];
        int middle = InArray.length / 2 + 1;
        for (int i = 0; i < middle; i++) {
            OutArray[i] = InArray[i];
        }
        OutArray[middle] = newValue;
        for (int i = middle + 1; i < OutArray.length; i++) {
            OutArray[i] = InArray[i - 1];
        }
        return OutArray;

        //output shiftArray
    }
}
