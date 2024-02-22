import java.util.Scanner;

public class Topic4_2_forLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String highestGradeStudentName = ""; // Variable to store the name of the student with the highest grade
        int highestGrade = -1; // Variable to store the highest grade, initialized to a lower value

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            int studentGrade = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (studentGrade > highestGrade) {
                highestGrade = studentGrade;
                highestGradeStudentName = studentName;
            }
        }

        System.out.println("The student with the highest grade is:");
        System.out.println("Name: " + highestGradeStudentName);
        System.out.println("Grade: " + highestGrade);

        scanner.close();
    }
}
