package Chapter5;

import java.util.*; // needed to use the Scanner class

public class GolfScoreAverage // Class
{
    public static void main(String[] args)//main method
    {
        String username; //variable for username
        int course1; // variable for course1
        int course2; // variable for course2
        int course3; // variable for course3
        int average; // variable for average

        Scanner input = new Scanner(System.in); //Created Scanner Object

        System.out.print("Type your name and press Enter: ");//ask for user input
        username = input.nextLine(); //stored input into username

        System.out.print("Enter your round 1 score: ");//asked for user input
        course1 = input.nextInt(); //stored input into course1
        System.out.print("Enter your round 2 score: "); //asked for user input
        course2 = input.nextInt(); //stored input into course2
        System.out.print("Enter your round 3 score: ");//asked for user input
        course3 = input.nextInt(); //stored input into course3

        // calculate the average by adding together the 3 numeric inputs and then dividing by 3
        average = (course1 + course2 + course3) / 3;

        System.out.println("");//space
        System.out.println("Hello " + username); //output username
        System.out.println("Score for course 1: " + course1); //output course1 score
        System.out.println("Score for course 2: " + course2);//output course2 score
        System.out.println("Score for course 3: " + course3);//output course3 score
        System.out.println("Average score: " + average);//output average

        input.close(); //close Scanner
    }
}