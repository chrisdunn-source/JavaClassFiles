package IfElseExamples;
import java.util.Scanner;//import Scanner Object
public class EvenOrOdd {
    /*
    Determine if a user input integer is even or odd. Use an if else statement to output if the number is even or odd.
     */
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.print("Enter an integer: ");//asking for user input
        int number = scanner.nextInt();//storing user input

        if (number % 2 == 0) {//checking to see if number is even or odd
            System.out.println("The number is even.");//if even print this
        } else {
            System.out.println("The number is odd.");//if odd print this
        }
        scanner.close();
    }
}
