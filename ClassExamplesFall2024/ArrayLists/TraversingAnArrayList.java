import java.util.ArrayList;

public class TraversingAnArrayList {
    /*
    Prompt:

Create a Java program that takes an ArrayList of integers as input.
The program should traverse the ArrayList and print the square of each integer in the list.
Example Input: [1, 2, 3, 4, 5]

Example Output: 1 4 9 16 25
     */
    public static void main(String[] args) {
        ArrayList <Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        System.out.println(myNumbers);
        for (int num : myNumbers)
        {
            System.out.print(num * num + " ");
        }
    }
}
