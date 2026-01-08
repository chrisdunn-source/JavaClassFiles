package Unit4ClassNotes;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("HeroName.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (Exception errorMessage)
        {
            System.out.println("File not found: " + errorMessage.getMessage());
        }
    }
}








