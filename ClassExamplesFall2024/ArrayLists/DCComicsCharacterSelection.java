import java.util.ArrayList;
public class DCComicsCharacterSelection {
    /*
    Problem:
    You are developing a simple character selection system for a DC Comics-themed video game. The game allows players to choose from a roster of available heroes

    Requirements:
    1.Create an ArrayList: Create an ArrayList named availableHeroes to store the names of playable DC Comics characters.

    2.Initialize Hero Roster: Initially, populate the availableHeroes ArrayList with a list of available heroes (e.g., "Superman", "Batman", "Wonder Woman", "The Flash").

    3.Character Selection:
    When a player selects a character, the system should "remove" that character from the availableHeroes list.
    Implement two methods:
    removeHeroByIndex(int index): Removes the hero at the specified index from the list.
    removeHeroByName(String name): Removes the first occurrence of the specified hero name from the list.

    4.Print Remaining List with a method
     */

    public static void main(String[] args) {
        // Create an ArrayList to store available heroes
        ArrayList<String> availableHeroes = new ArrayList<>();
        availableHeroes.add("Superman");
        availableHeroes.add("Batman");
        availableHeroes.add("Wonder Womon");
        availableHeroes.add("Flash");
        printCharacterList(availableHeroes);
        removeHeroByName(availableHeroes,"Batman");
        printCharacterList(availableHeroes);
    }
    public static void removeHeroByName(ArrayList<String> heroes, String name)
    {
        for(int i = 0 ; i < heroes.size(); i++)
        {
            if(heroes.get(i) == name)
            {
                heroes.remove(i);
            }
        }
    }
    public static void printCharacterList(ArrayList<String> list)
    {
        System.out.println("Available Characters: ");
        for (String item: list)
        {
            System.out.println("- " + item);
        }
    }
}
