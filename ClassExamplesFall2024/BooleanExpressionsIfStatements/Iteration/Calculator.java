import java.util.Scanner;
public class Calculator {
    /*
    Let’s create a Calculator Class with a static method sum() that asks a user for two numbers and prints the sum of those two numbers as a double.

     */
    //Step One: Write method signature
    public static void sum() {
        int count = 1;
        double sum = 0;
        while(count <= 10) {
            //Step Two: Create Scanner
            Scanner input = new Scanner(System.in);

            //Step Three: Ask user for 10 numbers
            System.out.println("Enter a number: ");
            double num = input.nextDouble();
            sum = sum + num;
            count++;
        }
        //Step Four: Print the sum
        System.out.println("The sum of your numbers is: " + sum);
    }

    public static void main(String[] args) {
        sum();
    }

}
