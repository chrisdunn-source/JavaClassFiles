package Chapter6;

public class StringMethods {


    public static void main(String[] args) {
        String myString1 = "goofy";
        String myString2 = "moon";
        String myString3 = "MOON";

        //contains()
        /*
        This method will accept an input string and search the target
        string for any match.  If a match is found it will return true,
        otherwise, it will return false.
         */
        boolean result3 = myString2.contains("n");   // result3 = true
        boolean result4 = myString2.contains("oo");  // result4 = true
        boolean result5 = myString2.contains("ooo"); // result5 = false



        //indexOf() and lastIndexOf()
        /*
        indexOf(), is used to determine the first place a character or
        substring is located within a larger string. It will return the
        numeric value of the starting index where the input is first
        found within the larger string.
         */
        int result6 = myString3.indexOf("O");         // result6 = 1
        int result7 = myString3.indexOf("MO");        // result7 = 0

        /*
        The lastIndexOf() function is used to find the last location of
        a character or substring in a string
         */
        int result8 = myString3.lastIndexOf("O");    // result8 = 2


        //length()
        //the number of characters in a String
        int result9 = myString1.length();            // result9 = 5

        //substring()
        /*
        Is used to pull out a piece of a string.
        This function is given either a starting index or a starting
        and ending index.  Characters will be copied out starting at
        the first index and continuing to the end of the string or,
        if provided, to the ending index minus one.
         */

       // String myString2 = "moon";
       // String myString3 = "MOON";
        String result11 = myString2.substring(1);       // result11 = "oon"
        String result12 = myString2.substring(1, 3);    // result12 = "oo"

        //toUpperCase and toLowerCase()
        String result14 = myString2.toUpperCase();      // result14 = "MOON"
        String result15 = myString3.toLowerCase();      // result15 = "moon"

    }
}
