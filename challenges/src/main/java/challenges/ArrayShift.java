package challenges;

public class ArrayShift {

    public static int[] ShiftArray ( int[] InArray, int newValue){


        int[] OutArray = new int[InArray.length + 1];
        for (int i = 0; i < InArray.length + 1; i++) {
            if (i < InArray.length - 1) {
                OutArray[i] = InArray[i];
            } else if (i == newValue) {
                OutArray[i] = newValue;
            } else {
                OutArray[i] = InArray[i - 1];
            }
        }
        return OutArray;

        //output shiftArray
    }
}
