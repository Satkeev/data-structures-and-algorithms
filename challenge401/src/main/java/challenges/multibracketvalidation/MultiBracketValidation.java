package challenges.multibracketvalidation;


import java.util.Stack;

public class MultiBracketValidation {

//Create a class that takes in a string and checks to see that the brackets
// within it are properly balanced.
// If they aren't then it will return false
    public static boolean multiBracketValidation(String Br) {
        Stack<Character> brackets = new Stack<>();
//Create a stack that contains Character objects
        for (int i = 0; i < Br.length(); i++) {
//Iterate throw String Br
            if (Br.charAt(i) == '(' || Br.charAt(i) == '[' || Br.charAt(i) == '{') {
                brackets.push(Br.charAt(i));
// Use String charAt() Method
//The charAt() method returns the character at the specified index in a string.
// The index of the first character is 0
            }
            if (Br.charAt(i) == ')' || Br.charAt(i) == ']' || Br.charAt(i) == '}') {
                char toExpect = ' ';
//check all cases
                switch (brackets.pop()) {
                    case '(': toExpect = ')';
                        break;
                    case '[': toExpect = ']';
                        break;
                    case '{': toExpect = '}';
                        break;
                }
//result no balanced
                if (toExpect != Br.charAt(i)) {
                    return false;
                }
            }
        }

        if (brackets.pop() != null) {
            return false;
        }
        return true;
    }
}