import java.util.ArrayList;
public class ArrayListMethods {
    /*
    Prompt:

Create a Java program that takes an ArrayList of Strings as input.
The program should:
Add the string "Hello" to the beginning of the ArrayList.
Remove the last element from the ArrayList.
Insert the string "World" at index 2 of the ArrayList.
Print the final state of the ArrayList.
Example Input: ["Java", "Programming", "Fun"]

Example Output: ["Hello", "Java", "World", "Programming"]
     */
    public static void main(String[] args) {
        ArrayList <String> myWords = new ArrayList<>();
        myWords.add("Java");
        myWords.add("Programming");
        myWords.add("Fun");
        System.out.println(myWords);
        myWords.add(0,"Hello");
        myWords.remove(myWords.size()-1);
        myWords.add(2,"World");
        System.out.println(myWords);

    }
}
