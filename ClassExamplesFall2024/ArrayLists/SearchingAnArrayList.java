import java.util.ArrayList;

public class SearchingAnArrayList {
    /*
    Prompt:

Create a Java program that takes an ArrayList of Strings as input and a target String as input.
The program should search the ArrayList for the target String.
If the target String is found in the ArrayList, the program should return the index of the first occurrence of the target String.
If the target String is not found, the program should return -1.
Example Input:

ArrayList: ["apple", "banana", "orange", "apple"]
Target String: "banana"
Example Output: 1
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("apple");

        System.out.println(findTarget(myList,"juice"));

    }
    public static int findTarget(ArrayList al, String target)
    {
        for(Object name: al)
        {
            if(name.equals(target))
            {
                return 1;
            }
        }
        return -1;
    }
}
