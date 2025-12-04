package QuestionOfTheDay;

public class BuffaloCount {
    public static void main(String[] args) {

        System.out.println(countLetter("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo", 'b'));
    }
    public static int countLetter(String input, char letter)
    {
        int count = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == letter)
            {
                count++;
            }
        }
        return count;
    }

}
