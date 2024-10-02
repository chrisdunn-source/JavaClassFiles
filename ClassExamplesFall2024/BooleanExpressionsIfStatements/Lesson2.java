
package Chapter8;
import java.util.*;
public class Lesson2 {
    /*
    In programming, the term flow control refers to the
    order and selection of statements to execute in your
    program. Normally, program statements within a method
    will execute in order (sequentially) from top to bottom
    as they appear in the source file. You can change the
    natural sequential order by the use of flow control statements.

    The if() conditional statement allows you to run a certain block
    of code based on whether a logical expression evaluates to true or false.
    An if() statement comes in one of these two forms:

    if (<logical expression>)
      // the very next statement executes if the logical expression is true

    if (<logical expression>)
    {
     // all statements inside these curly braces execute
     // if the logical expression is true
    }

    */
    public static void main(String[] args) {
        double moviePrice = 12.00;
        boolean tooMuch = moviePrice > 10.00;

        if (tooMuch)             // most efficient and preferred
        {
            System.out.println("I'll watch it at home instead");
        }

        if (tooMuch == true)     // works, but not necessary
        {
            System.out.println("I'll watch it at home instead");
        }

        if (tooMuch != false)    // works, but not necessary
        {
            System.out.println("I'll watch it at home instead");
        }

        int value = 1;
        //if (value)   // ERROR: 'value' is an integer
        //{
        //}

        if (value == 1) // OK: comparison operator results in Boolean true
        {
        }

        String favoriteColor = "green";

        if (favoriteColor == "green")  // WRONG: using == to compare strings may not work
        {
        }

        if (favoriteColor.equals("green")) // CORRECT: use equals() or equalsIgnoreCase() for string comparisons
        {
        }

        //Guess My Number
        int guess;
        int magicNumber = 7;  // this is the number the user is trying to guess

        // get numeric between 1-10 guess from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        guess = input.nextInt();
        input.close(); // done with Scanner

        if (guess == magicNumber) // if guess is equal to magicNumber
        {
            System.out.println("That's exactly right!");
        }

        if (guess < magicNumber) // if guess is less than magicNumber
        {
            System.out.println("Your guess is too low");
        }

        if (guess > magicNumber) // if guess is greater than magicNumber
        {
            System.out.println("Your guess is too high");
        }
    }
}
