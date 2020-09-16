//ArrayShift

public class ArrayShift {
    public static void main(String[] args) {

    }
        public static int[] ShiftArray ( int[] InArray, int newValue){

            int InArray = [2, 4, 6, 8];
            //input Array
            int newValue = 5;
            //new index

            int[] OutArray = new int[InArray.length + 1];
            for (int i = 0; i < InArray.length / 2; i++) {
                OutArray[i] = InArray[i];
            }
            OutArray[InArray.length / 2] = newValue;
                    for (int i = InArray.length / 2 + 1; i < outArray.length; i++) {
        OutArray[i] = InArray[i - 1];
        }
        return OutArray;
        //output shiftArray
        }
    }
