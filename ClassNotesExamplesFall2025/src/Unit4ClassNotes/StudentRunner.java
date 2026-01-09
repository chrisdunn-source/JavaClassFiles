package Unit4ClassNotes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StudentRunner
{
    public static void main(String[] args)
    {
        String[] students = new String[10];

        try
        {
            File file = new File("src/Unit4ClassNotes/StudentNames.txt");
            Scanner input = new Scanner(file);
            int index = 0;

            while (input.hasNext())
            {
                String name = input.nextLine();
                students[index] = name;
                index++;
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }

        int numBellStudents = schoolNumStudents(students, "Bell");
        int numTrinityStudents = schoolNumStudents(students, "Trinity");
        System.out.println("Number of Students from Bell High School: " + numBellStudents);
        System.out.println("Number of Students from Trinity High School: " + numTrinityStudents);

    }

    public static int schoolNumStudents(String[] arr, String school)
    {
        int num = 0;
        for (String student : arr)
        {
            if (student.contains(school))
            {
                System.out.println(student);
                num++;
            }
        }
        return num;
    }
}