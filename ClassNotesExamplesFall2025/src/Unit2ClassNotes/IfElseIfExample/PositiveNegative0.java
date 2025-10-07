package IfElseIfExample;
import java.util.Scanner;//scanner
public class PositiveNegative0 {
    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);//scanner object
        System.out.println("Enter a number: ");//asking for user input
        int num = input.nextInt();//storing user input

        if (num > 0) {//condition to check if greater than 0
            System.out.println("The number is positive");
        }
        else if (num < 0) {//condition to check if less than 0
            System.out.println("The number is negative");
        }
        else {//default statement if all other conditions are false
            System.out.println("The number is zero");
        }

    }
}
