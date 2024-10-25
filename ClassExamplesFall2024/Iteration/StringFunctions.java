import java.util.Scanner;
public class StringFunctions {
    /*
    Important String Methods
        Here are some important methods in the String class:

        .length()

        Returns an int, the number of chars in the string
        a.length() = 6, even though the last index is 5
        .equals(String otherString)

        Tests if data stored in otherString is the same as this one
        Returns true or false
        .indexOf(String str)

        Returns the index of the first occurrence of str in the calling String
        a.indexOf("r") = 2
        Note that indexOf returns -1 if the string isn't found
        .substring(int firstOneYouWant, int firstOneYouDontWant)

        Returns the substring from the first int up to but not including the second
        a.substring(1,4) = "tri"
        Be super careful about the indices, trying to access a letter outside of the range 0 to length -1 will
        result in an index out of bounds error!
        to create a single character substring at position index, we can use .substring(index, index+1)
        .substring(int firstOneYouWant)

        Returns the substring from the specified index to the end
        a.substring(3) = "ing"
        .toUpperCase()

        Transforms the string to uppercase
        Not tested on the AP exam, but very useful
        .toLowerCase()

        Transforms the string to lower case
        Not tested on the AP exam, but very useful
        .compareTo(String otherString)

        Returns 0 if the strings are the same
        Returns a negative value if this string comes before otherString alphabetically
        Returns a positive value if this string comes after otherString alphabetically
     */


    /*
    Guided Practice 1
    Write code to take a String input from the user, then print the first and last letters of the string
    on one line.

    Sample run:

    Enter a string:
    surcharge
    se

    public static void main(String[] args) {
        //Declare a Scanner and input a String.
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = kbReader.nextLine();

        //Print first character
        System.out.print(word.substring(0, 1));
        System.out.println(word.charAt(0));


        //Print last character
        System.out.print(word.substring(word.length() - 1));
        System.out.println(word.charAt(word.length()-1));

      */

    /*
    Guided Practice 2
    Write code to take a String input from the user, then print all except the first and last letters of the
    string on one line.

    Sample run:

    Enter a string:
    glazed
    laze

    public static void main(String[] args)
    {
        //Declare a Scanner and input a String.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.nextLine();

        //Take substring from second letter to last but one.
        String newWord = word.substring(1,word.length() - 1);
        System.out.println(newWord);
    }
*/
    /*
    Write code which takes a sentence as an input from the user and then prints the length of the first
    word in that sentence.

    Sample run 1:

    Enter a sentence:
    Everything in its right place
    10
    Sample run 2:

    Enter a sentence:
    Down is the new up
    4
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String word = scan.nextLine();
        System.out.println(word.indexOf(" "));

        
    }

    }

