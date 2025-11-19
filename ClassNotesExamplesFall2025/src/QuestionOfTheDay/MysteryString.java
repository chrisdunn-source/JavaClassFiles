package QuestionOfTheDay;

public class MysteryString {
    public static void main(String[] args) {
        String str = "Jake";
        mystery(str);
        System.out.println(str);

    }
    public static void mystery (String str)
    {
        str = str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);
    }
}
