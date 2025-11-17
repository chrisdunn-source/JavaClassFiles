package QuestionOfTheDay;

public class PowersOf2 {
    public static void main(String[] args) {
        double total = 2.0;

        for (int i = 0; i < 4; i++)
        {
            total = Math.pow(total, 2);
            System.out.println(total);
        }
    }
}
