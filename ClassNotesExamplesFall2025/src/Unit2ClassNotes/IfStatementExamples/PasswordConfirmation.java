package IfStatementExamples;
import java.util.Scanner;
public class PasswordConfirmation {
    /*
    Write a Java program that asks the user to enter a password (as a string). The program should use a one-way if statement to check if the entered password is exactly "JavaRocks". If the password is correct, the program should print "Login successful!" If the password is not correct, the program should simply end without printing any message.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.print("Enter the password: ");//Output statement for input
        String password = scanner.nextLine();//storing input into variable

        // One-way if statement: The "equals" method is used for string comparison.
        // The action is taken only if the password is a perfect match.
        if (password.equals("JavaRocks")) {//using string method to check equality
            System.out.println("Login successful!");//output if true
        }

        scanner.close();//close scanner object
    }
}
