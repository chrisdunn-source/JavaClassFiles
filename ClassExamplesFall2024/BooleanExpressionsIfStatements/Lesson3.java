package Chapter8;

public class Lesson3 {
    /*
    The else if() condition will only be tested if the prior logical expression
    in the chain is false. If the prior expression is true, the else if() statement
    and block of code are skipped entirely. You can add zero, one, or more else if()
    statements after the initial if(). Using a plain if() statement will begin a new
    chain of logic that is independent of any prior conditions.
     */

    public static void main(String[] args)
    {









        //Example of an Else If Statement
        System.out.println("Example 1: Using an Else if ");
        double moviePrice = 8.00;// initial variable

        if (moviePrice > 12.00)  // 1st logical expression
        {
            // this code executes if the first logical expression is true
            System.out.println("I can't afford to see this expensive movie");
        }
        else if (moviePrice < 4.00)  // 2nd logical expression
        {
            // this code executes if the first logical expression is false
            // AND if the second logical expression is true
            System.out.println("I probably don't want to see this cheap movie");
        }
        else if (moviePrice <= 10.00)
        {
            // this code executes if the first two logical expression are false
            // AND if the third logical expression is true
            System.out.println("I can afford this and it might be worth watching");
        }
        // this is next line in the program, independent of the ifs above
        System.out.println("All Done");



        System.out.println();
        System.out.println("Example 2 Using a Else Statement");
        //Example of else statement
        double moviePrice2 = 11.00;

        if (moviePrice2 > 12.00)  // 1st logical expression
        {
            // this code executes if the first logical expression is true
            System.out.println("I can't afford to see this expensive movie");
        }
        else if (moviePrice2 < 4.00)  // 2nd logical expression
        {
            // this code executes if the first logical expression is false
            // AND if the second logical expression is true
            System.out.println("I probably don't want to see this cheap movie");
        }
        else if (moviePrice2 <= 10.00)
        {
            // this code executes if the first two logical expression are false
            // AND if the third logical expression is true
            System.out.println("I can afford this and it might be worth watching");
        }
        else
        {
            // this code executes if none of the above conditions are true
            System.out.println("Maybe I'll see this after I earn some more money");
        }

        // this is next line in the program, independent of the ifs above
        System.out.println("All Done");




        System.out.println();
        System.out.println("Example 3 Using Nested if Statement");
        double moviePrice3 = 13.50;

        if (moviePrice3 > 10.00)
        {
            System.out.println("I'll watch it at home instead");
            if (moviePrice3 > 14.00)
            {
                System.out.println("It must really be good for that price");
            }
        }

    }
}







