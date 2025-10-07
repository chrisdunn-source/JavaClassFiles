import java.util.Scanner;//import Scanner Class
public class GraduationCalculator { //Class name
    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);//Scanner Object
        System.out.println("What grade are you in?");//Output Question
        int grade = input.nextInt();//Storing input into int variable
        System.out.print("Years to graduate: ");//Output Statement
        System.out.println(12 - grade);//Output Statement
    }
}
