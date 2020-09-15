
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args){
        int[] MyArray = new int[]{1,2,3,4,5,6};
        int[] OutArray = arrayReverse(MyArray);
        System.out.println(Arrays.toString(OutArray));
    }
    public static int[] arrayReverse(int[] MyArray) {
        int theLength = MyArray.length;
        int[] reversed = new int[theLength];
        for (int i = 0; i < MyArray.length; i++) {
            reversed[MyArray.length - i - 1] = MyArray[i];

        }
        return reversed;
    }
}