
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args){
        int[] original = new int[]{1,2,3,4,5,6};
        int[] theReversed = arrayReverse(original);
        System.out.println(Arrays.toString(theReversed));
    }
    public static int[] arrayReverse(int[] original) {
        int theLength = original.length;
        int[] reversed = new int[theLength];
        for (int i = 0; i < original.length; i++) {
            reversed[original.length - i - 1] = original[i];

        }
        return reversed;
    }
}