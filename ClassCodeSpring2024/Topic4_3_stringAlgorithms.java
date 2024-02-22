import java.util.Scanner;

public class Topic4_3_stringAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int vowelCount = 0; // Variable to store the count of vowels
        System.out.print("Vowels: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " "); // Print the vowel
                vowelCount++; // Increment the vowel count
            }
        }
        System.out.println("\nTotal number of vowels: " + vowelCount); // Print the total number of vowels
    }
}
