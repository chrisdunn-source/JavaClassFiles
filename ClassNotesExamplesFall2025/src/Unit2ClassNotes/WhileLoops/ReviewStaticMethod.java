package Unit2ClassNotes.WhileLoops;
import java.util.Scanner;
public class ReviewStaticMethod {

    public static void sum()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        System.out.println("Sum of the two numbers are: " + (num1 + num2));
    }

    public static void main(String[] args) {
        //sum();
        int countdown = 3;//initial Value
        while(countdown > 0)//condition
        {
            System.out.println(countdown);
            countdown --;//change
        }
        System.out.println("Countdown Complete");

        int num = 0;
        int sum = 0;
        while(num <= 5)
        {
            sum += num;
            num++;
        }
        System.out.println("Sum of the numbers are: " + sum);
    }


}
