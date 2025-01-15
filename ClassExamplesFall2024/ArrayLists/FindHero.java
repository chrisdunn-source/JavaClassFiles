import java.util.ArrayList;
public class FindHero {
    //Search for a particular element in an Array
    /*
    Problem:
    You are developing a simple character database for a DC Comics fan website. The website needs to be able to quickly check if a specific hero is included in a list of known heroes.
    Requirements:

    1.Create an ArrayList: Create an ArrayList named heroes to store the names of DC Comics heroes.
    2.Populate the List: Add several hero names to the heroes ArrayList.
    3.Search for Hero:
        a.Implement a method searchHero(ArrayList<String> heroes, String hero) that takes an ArrayList of heroes and the name of the hero to search for as input.
          The method should return true if the hero is found in the list and false otherwise.

     */
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Superman");
        heroes.add("Batman");
        heroes.add("Wonder Woman");
        heroes.add("The Flash");
        heroes.add("Aquaman");
        String heroToFind = "Wonder Woman";
        boolean foundHero = searchHero(heroes, heroToFind);
        if(foundHero)
        {
            System.out.println(heroToFind + " was found in the list!");
        }else {
            System.out.println(heroToFind + " was not found in the list!");
        }
    }

    public static boolean searchHero(ArrayList<String> heroes, String hero)
    {
        for(String currentHero : heroes)
        {
            if(currentHero.equals(hero))
            {
                return true; // hero found
            }
        }
        return false;
    }














}
