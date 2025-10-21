package Unit2ClassNotes.StringAlgorithms;

public class TraversingAndProcessingStrings {
    /*
    Problem 1
    Counting VowelsProblem: Count how many vowels (a, e, i, o, u, case-insensitive) are in a given string.Method: Use a for loop to iterate from index 0 to string.length() - 1. Inside the loop, get the character at the current index (using substring(i, i+1) or charAt(i)), convert it to lowercase, and check if it equals 'a', 'e', 'i', 'o', or 'u'. Increment a counter variable each time a match is found.
     */


    public static void main(String[] args) {
        System.out.println(countVowels("Coach Dunn Teaches AP Computer Science A"));
    }
    public static int countVowels(String phrase)
    {
        int vowelCount = 0;//vowel count
        String lowerPhrase = phrase.toLowerCase();//whatever phrase we provide we will make lowercase
        for(int i = 0; i < lowerPhrase.length(); i++)
        {
            char currentChar = lowerPhrase.charAt(i);
            if(currentChar == 'a' || currentChar =='e' || currentChar =='i' || currentChar == 'o' || currentChar == 'u')
            {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    /*
    Problem: Print each character of a string on a separate line. Method: Use a for loop to iterate through the string's indices. Inside the loop, use System.out.println() with substring(i, i+1) to print the single character and a newline.
     */
    public static void printVertical(String phrase)
    {
        for (int i = 0; i < phrase.length(); i++ )
        {
            System.out.println(phrase.substring(i, i +1));
        }
        //.substring()
        // first value is inclusive and if you provide second value it is exclusive
    }
}
