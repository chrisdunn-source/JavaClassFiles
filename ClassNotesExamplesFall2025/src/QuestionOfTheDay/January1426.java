package QuestionOfTheDay;

public class January1426 {
    public static void main(String[] args) {
        int[] values = {5, 12, 11, 3, 1, 112};

        int sum = 0;
        for (int value : values)
        {
            if (value % 2 == 1)
                sum += value;
        }
        System.out.println("Sum: " + sum);
    }
}
