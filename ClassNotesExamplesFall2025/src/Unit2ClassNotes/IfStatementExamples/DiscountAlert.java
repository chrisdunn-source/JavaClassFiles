package IfStatementExamples;
import java.util.Scanner;
public class DiscountAlert {
    /*
    Write a Java program that asks the user for their
    total purchase amount (a decimal number). Your program should
    use a one-way if statement to check if the total is greater
    than or equal to $100. If it is, the program should print
    a special message: "Congratulations, you qualify for free shipping!"
    If the total is less than $100, the program should do nothing.
     */
    public static void main(String[] args) {//main method
        Scanner kbReader = new Scanner(System.in); //Scanner Object to get user input
        System.out.println("Enter your total purchase amount: $"); //asking user for input
        double total = kbReader.nextDouble(); //store user input into a variable called total

        if(total >= 100.00)//if statement
        {
            System.out.println("Congratulations, you qualify for free shipping!");//output if condition is true
        }
        kbReader.close();//close your scanner object
    }
}
