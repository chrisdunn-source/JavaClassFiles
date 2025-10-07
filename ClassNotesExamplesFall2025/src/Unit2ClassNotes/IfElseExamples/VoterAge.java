package IfElseExamples;
import java.util.Scanner;//import scanner object
public class VoterAge {
    /*
    This program checks a user's age to see if they're old enough to vote.
    Voter Age is 18. Use If-Else to determine if age of user is old enough to vote
     */
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//create scanner object
        System.out.print("Enter your age: ");//output question for user input
        int age = scanner.nextInt();//storing input into a variable

        if (age >= 18) {//conditional to check if age is = or greater than 18
            System.out.println("You are old enough to vote.");//output for true
        } else {
            System.out.println("You are not old enough to vote yet.");//output for false
        }
        scanner.close();//close scanner object
    }
}
