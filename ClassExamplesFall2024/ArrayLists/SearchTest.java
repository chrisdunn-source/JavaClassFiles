import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {
    public static void main(String[] args) {
        // Example usage
        ArrayList<DCCharacter> dcCharacters = new ArrayList<>();
        dcCharacters.add(new DCCharacter("Superman", "Clark Kent", new String[]{"Flight", "Super Strength"}));
        dcCharacters.add(new DCCharacter("Batman", "Bruce Wayne", new String[]{"Martial Arts", "Detective Skills"}));
        dcCharacters.add(new DCCharacter("Wonder Woman", "Diana Prince", new String[]{"Super Strength", "Lasso of Truth"}));

        String targetCharacter = "BATMAN";
        DCCharacter foundCharacter = DCCharacter.linearSearchCharacterByName(dcCharacters, targetCharacter);

        if (foundCharacter != null) {
            System.out.println("Found: " + foundCharacter);
        } else {
            System.out.println("Character not found.");

        }

        targetCharacter = "FLASH";
        foundCharacter = DCCharacter.binarySearchCharacterByName(dcCharacters, targetCharacter);

        if (foundCharacter != null) {
            System.out.println("Found: " + foundCharacter);
        } else {
            System.out.println("Character not found.");

        }
    }
}
