package Chapter8;
import java.util.*;
public class Lesson4 {
    public static void main(String[] args) {
    //If you have multiple conditions that test differen
    // variables or expressions, you need to use a series
    // of if() / else if() / else statements. If you want
    // to test one expression to see if it matches a series of
    //possible results, you can choose to use a switch() statement instead.
     Scanner input = new Scanner(System.in);
     System.out.println("Pick a number 1 - 12: ");
     int userNum = input.nextInt();

     if (userNum == 1)
     {
         System.out.println("You picked January");
     } else if (userNum == 2)
     {

         System.out.println("You picked Feburary");
     }else if (userNum == 3)
     {

         System.out.println("You picked March");
     }else if (userNum == 4)
     {

         System.out.println("You picked April");
     }
     else if (userNum == 5)
     {

         System.out.println("You picked May");
     }
     else if (userNum == 6)
     {

         System.out.println("You picked June");
     }
     else
     {
         System.out.println("You did not pick a number 1-12");
     }

        System.out.println("Pick a number 1 - 12: ");
        int userNum2 = input.nextInt();

        String message = "";
        switch(userNum2)
        {
            case 1:
                message = "You picked January";
                break;
            case 2:
                message = "You picked Feb";
                break;
            case 3:
                message = "You picked Mar";
                break;
            case 4:
                message = "You picked April";
                break;
            default:
                message = "You didnt pick a number 1-12";
                break;
        }
        System.out.println(message);
        System.out.println();


        System.out.print("Type your favorite color and press Enter: ");
        String userColor = input.nextLine();
        input.close();

        switch (userColor)
        {
            case "blue":
                System.out.println("You chose my favorite color!");
                break;
            case "red":
                System.out.println("You chose my second favorite color!");
                break;
            case "green":
                System.out.println("You chose my third favorite color!");
                break;
            default:
                System.out.println("I don't like that color!");
                break;
        }





        // generate a random integer between 1 and 6
            int rand = 1 + (int)(Math.random() * 6);
            System.out.println("What do you think about " + rand + "?");

            String message2 = "";
            switch(rand)
            {
                case 1:
                    message2 = "One represents unity";
                    break;
                case 2:
                    message2 = "Two reminds me of binary";
                    break;
                case 3:
                    message2 = "Three is a little odd";
                    break;
                case 4:
                    message2 = "Four leaves you wanting more";
                    break;
                default:
                    message2 = "I can't count that high!";
                    break;
            }
            System.out.println(message);

    }
}
