package Unit4ClassNotes;

public class ArrayTraversals {
    /*
    An array is an object that can store multiple values of the same type in a single variable. Once created, it's length and data type are FIXED


     */
    public static void main(String[] args) {
        int[] scores = {80, 92, 91, 68, 88};
//using while loops
        int num = 0;//initial value
        while(num < scores.length)//condition
        {
            System.out.println(scores[num]);//output if condition is true
            num++;//change variable
        }
        //using for loop
        for(int i =0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        //using enhanced for lop
        for(int score: scores)
        {
            System.out.println(score);
        }
        String[] mutants = {"Logan", "Jean Grey", "Iceman", "Kitty Pride", "Professor X"};
        //using while loops with reference types
        int num2 = 0;//initial value
        while(num2 < mutants.length)//condition
        {
            System.out.println(mutants[num2]);//output if condition is true
            num2++;//change variable
        }
        //using for loop with reference types
        for(int i =0; i < mutants.length; i++)
        {
            System.out.println(mutants[i]);
        }
        //using enhanced for lop with reference types
        for(String mutant: mutants)
        {
            System.out.println(mutant);
        }

        String[] heroSlogans = {"Avengers, Assemble","In brightest day, in blackest night, no evil shall escape my sight. Let those who worship evil's might, beware my power—Green Lantern's light!",  "Im Batman"};
        Heroes hero1 = new Heroes("Captain America");
        Heroes hero2 = new Heroes("John Stewart");
        Heroes hero3 = new Heroes("Batman");
        Heroes[] favoriteHeroes = {hero1,hero2,hero3 };

        //using loops with objects
        for(int i = 0; i < favoriteHeroes.length; i++) {

            // Access the hero object at index 'i'
            Heroes currentHero = favoriteHeroes[i];

            // Access the slogan string at the SAME index 'i'
            String currentSlogan = heroSlogans[i];

            System.out.println(currentHero.getName() + " always says " + currentSlogan);
        }
    }
}
