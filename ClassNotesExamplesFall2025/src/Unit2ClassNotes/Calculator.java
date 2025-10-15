package Unit2ClassNotes.WhileLoops;
import java.util.Scanner;
public class Calculator {
    /*
    Let’s create a Calculator Class with a static method sum()
    that asks a user for 10 numbers and prints the sum of those
     10 numbers as a double. Use a while loop
     */

    public static void main(String[] args) {
sum();

    }

   public static void sum()
   {
       Scanner input = new Scanner(System.in);
       int i = 0;//starting point
       double num = 0;
       while(i != 10)//condition
       {
           System.out.println("Enter a number: ");
           num += input.nextDouble();

           i++;//update
       }
       input.close();

       System.out.println("The sum of your numbers is: " + num);

   }

}
