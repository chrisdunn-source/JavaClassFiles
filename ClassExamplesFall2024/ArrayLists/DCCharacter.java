import java.util.ArrayList;
import java.util.Collections;
public class DCCharacter {
    private String name;
    private String realName;
    private String[] powers;

    public DCCharacter(String name, String realName, String[] powers) {
        this.name = name;
        this.realName = realName;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "DCCharacter{" +
                "name=' " + name + '\'' +
                ", realName=' " + realName + '\'' +
                '}';
    }
    public static DCCharacter linearSearchCharacterByName(ArrayList<DCCharacter> characters, String targetName) {
        for (DCCharacter character : characters) {
            if (character.getName().equalsIgnoreCase(targetName)) {
                return character;
            }
        }
        return null;
    }

    public static DCCharacter binarySearchCharacterByName(ArrayList<DCCharacter> characters, String targetName) {
        int left = 0;
        int right = characters.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = characters.get(mid).getName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return characters.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}






