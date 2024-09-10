package Chapter5;

import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        //System.out.println("What is your name? ");
        //String name = kbReader.nextLine();
        //System.out.println("My name is " + name);
        //System.out.println();

        //System.out.println("What city and state  are you in?");
        //String city = kbReader.next();
        //String state = kbReader.next();
        //System.out.println(name + " lives in " + city + ", " + state);

        //System.out.println("How old are you? ");
        //int age = kbReader.nextInt();
        //double age2 = kbReader.nextDouble();

        System.out.print("Type your full name and press Enter: ");
        String name2 = kbReader.nextLine();  // read an entire line

        System.out.print("Type your age and press Enter: ");
        int age2 = kbReader.nextInt();  // read an integer

        kbReader.nextLine();// CLEARS OUT THE NEWLINE left by nextInt();

        System.out.print("Type your nickname and press Enter: ");
        String nickname = kbReader.nextLine(); // read an entire line

        System.out.println(name2 + "(" + nickname + ") is " + age2 + " years old");

       kbReader.close();
        //Then Print name , nickname and age in that order
    }
}
