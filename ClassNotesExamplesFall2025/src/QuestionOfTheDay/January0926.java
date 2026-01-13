package QuestionOfTheDay;

public class January0926 {
    public static void main(String[] args) {
        int[] scores = {72, 31, 45, 68, 35, 42};

        for(int i = 0; i < scores.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(scores[i]);
            }
        }
    }
}
