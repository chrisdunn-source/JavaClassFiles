package QuestionOfTheDay;

public class ExpressionPractice {
    public static void main(String[] args) {
        System.out.println((int) (12 + 1 / 4 - 3));
        int count = 0;
        int num = 2;
        count++;
        count--;
        count++;
        count = count % num;
        System.out.println(count);
        int count2 = 5;
        int num2 = 2;
        count2++;
        count2++;
        count2 *= num2;
        System.out.println(count2);
        int apples = 10;
        int bananas = 12;
        int oranges = 5;

//apples -= 5;
        bananas += 4;
        oranges += 6;

/*
After eating some of the oranges
oranges -= 10;
*/

        System.out.println("apples: " + apples);
        System.out.println("bananas: " + bananas);
        System.out.println("oranges: " + oranges);

    }
}
