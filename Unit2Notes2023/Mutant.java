package Chapter5;

public class Mutant {

    String name;
    String teacherName;
    String type;
    int level;

    public Mutant()//Constructor
    {

    }
    public Mutant(String newName)
    {
        name = newName;
    }

    public Mutant(String omega, String god)
    {
    }

    public static void mutantGreeting()
    {
        System.out.println("I love Mutants");
    }
    public static String guessLevel(String gLevel)
    {
        return gLevel;
    }

    public void goodBye()
    {
        System.out.println("Bye Bye Mutants!");
    }
}
