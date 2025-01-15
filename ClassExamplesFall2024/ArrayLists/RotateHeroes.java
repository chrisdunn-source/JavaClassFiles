import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
public class RotateHeroes {
    /*
    Problem 5:
    You are developing a feature for a DC Comics fan website that allows users to shuffle or rearrange the order of a list of heroes.

    Requirements:

    1.Create an ArrayList: Create an ArrayList named heroes to store the names of DC Comics heroes.
    2.Populate the List: Add several hero names to the heroes ArrayList.
    3.Rotate the List:
    Implement a method rotateList(ArrayList<String> list, int distance) that takes an ArrayList of heroes and a distance (positive or negative) as input.
       The method should rotate the elements of the list to the left by the specified distance.
     */
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Superman");
        heroes.add("Batman");
        heroes.add("Wonder Woman");
        heroes.add("The Flash");
        heroes.add("Aquaman");

        System.out.println("Original Order: " + heroes);

        rotateList(heroes,2);

        System.out.println("Rotated Order: " + heroes);
    }



    public static void rotateList(ArrayList<String> list, int distance)
    {
        Collections.rotate(list, distance);
    }













}
