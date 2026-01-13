package QuestionOfTheDay;

public class January1226 {
    public static void main(String[] args) {
        int[] scores = {12, 81, 35, 73, 64, 55};

        for(int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i-1]);
        }
        //This will be an error because the first iteration of the loop will print try to print out scores[-1] which does not exist and will cause an index out of bounds exception
    }
}
