package Unit2ClassNotes.StringAlgorithms;

public class ReversingStrings {
    public static void main(String[] args) {
        System.out.println(reverseString("Coach Dunn"));
    }
    /*
    Problem: Take a string and reverse it
     */
    public static String reverseString(String phrase)
    {
        String reversed = "";
        for(int i = phrase.length() - 1; i >= 0 ; i--)
        {
            reversed += phrase.substring(i, i + 1);
        }
        return reversed;
    }
}
