import java.util.ArrayList;
import java.util.Collections;
public class DCComicsMode {
    /*
    Problem:

    You are a DC Comics historian analyzing recent comic book issues. You want to determine which character appears most frequently across these issues.

    Requirements:

  1.Create an ArrayList: Create an ArrayList named appearances to store the names of characters that appear in the comic book issues.
  2.Populate the List: Add the names of characters to the appearances list, reflecting their appearances in the issues.
  3.Calculate the Mode:
  Create a function findMode(ArrayList<String> list) that calculates and returns the mode (the character that appears most frequently) within the given list
       */
    public static void main(String[] args) {
        // Create an ArrayList to store character appearances
        ArrayList<String> appearances = new ArrayList<>();
        {
            // Add character appearances
            appearances.add("Superman");
            appearances.add("Batman");
            appearances.add("Superman");
            appearances.add("Wonder Woman");
            appearances.add("Batman");
            appearances.add("Batman");
            appearances.add("The Flash");
            appearances.add("Superman");
        }
    }
    public static String findMode(ArrayList<String> list)
    {
        if (list.isEmpty()) {
            return null; // Handle empty list
        }
        String mode = list.get(0);
        int maxCount = Collections.frequency(list, mode);
        for (String character: list)
        {
            int currentCount = Collections.frequency(list, character);
            if(currentCount > maxCount)
            {
                maxCount = currentCount;
                mode = character;
            }
        }
        return mode;
    }

}
