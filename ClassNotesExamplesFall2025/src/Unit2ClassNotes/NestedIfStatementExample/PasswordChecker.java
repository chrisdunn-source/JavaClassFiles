package NestedIfStatementExample;
import java.util.Scanner;//import scanner
public class PasswordChecker {//main class
    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);//create scanner object
        System.out.println("Enter Password: ");//Ask for user input
        String userPassword = input.nextLine();//Store user input in variable
        if (userPassword.length() >= 8)//Check to see if value is > 8
        {
            if (userPassword.startsWith("#"))//if true check to see if starts with "#"
            {
                System.out.println("User Password Accepted");//all true
            }
            else
            {
                System.out.println("Password must start with a #");//if 2nd condition is false
            }
        }
        else
        {
            System.out.println("Password needs 8 or more characters!");//if 1st conditional is false
        }
    }
}
