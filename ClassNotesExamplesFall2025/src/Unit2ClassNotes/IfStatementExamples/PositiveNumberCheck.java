package IfStatementExamples;
import java.util.Scanner;
public class PositiveNumberCheck {
    /*
    Create a Java program that prompts the user to enter an integer.
    The program should use a single if statement to determine if the number is
    positive (greater than 0).
    If the number is positive, print "This is a positive number."
    If the number is zero or negative, the program should not print anything.
     */
    public static void main(String[] args) {//main method

        Scanner kbReader = new Scanner(System.in);//Scanner object to take user input
        System.out.print("Enter an integer: ");//Ask for user input
        int number = kbReader.nextInt();//store user input in variable

        // One-way if statement: This block is executed only if the number is greater than 0.
        if (number > 0) {
            System.out.println("This is a positive number.");//output if condition is true
        }

        kbReader.close();//Close scanner object
    }
}
