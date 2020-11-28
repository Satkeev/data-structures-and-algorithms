public class rev {


        // Function to reverse a given string using String Concatenation operator
        public static String reverse(String str)
        {
            // return if string is null or empty
            if (str == null || str.equals(""))
                return str;

            // variable to store the reversed string
            String revo = "";

            // use string concatenation operator to build reversed string by
            // reading character from the end of the original string
            for (int i = str.length() - 1; i >=0 ; i--)
                revo += str.charAt(i);

            return revo;
        }

        public static void main (String[] args)
        {
            String str = "Techie Delight";
            str = reverse(str);

            System.out.println("Reverse of the given string is : " + str);
        }
    }

