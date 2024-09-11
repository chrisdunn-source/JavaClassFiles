//Importing Scanner Class
import java.util.Scanner;

public class MyProgram {//created my main class
    public static void main(String[] args) {//Main method
        Scanner input = new Scanner(System.in);//Created Scanner Object called input
        //Ask User for input
        System.out.println("State your name. (Hit enter after you are done!");
        //Store User input into String variable called name
        String name = input.nextLine();
        //Ask for user input
        System.out.println("State your age. (Hit enter after you are done!");
        //Store user input into int variable called age
        int age = input.nextInt();
        //Print out Name for display
        System.out.println("Name: ");
        //print out name variable
        System.out.println(name);
        //Print out Age for display
        System.out.println("Age: ");
        //print out age variable
        System.out.println(age);
    }
}
