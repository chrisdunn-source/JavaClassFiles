import java.util.Scanner;
/*
    Write a program that requires the user to enter exactly 7 letter grades, A, B, C, D, or F. The program should then calculate a grade point average using the following scale.
    A = 4.0
    B = 3.0
    C = 2.0
    D = 1.0
    F = 0.0
    The program should print the grade point average rounded to 2 decimal places. (Hint: You will be using else if statements and (int)(x + 0.5) will round x to a whole number.)
 */
public class Topic4_1_whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeCount = 0; // Keeps track of the number of grades entered
        double totalGradePoints = 0.0; // Accumulates the grade points

        while (gradeCount < 7) { // Repeat the following block of code as long as we have entered less than 7 grades
            System.out.print("Enter a letter grade (A, B, C, D, or F): ");
            String grade = scanner.nextLine(); // Read the grade entered by the user

            // Check the grade and add the corresponding grade point value to totalGradePoints
            if (grade.equalsIgnoreCase("A")) { // If the grade is "A" (ignoring case)
                totalGradePoints += 4.0; // Add 4.0 to the total grade points
            } else if (grade.equalsIgnoreCase("B")) { // If the grade is "B" (ignoring case)
                totalGradePoints += 3.0; // Add 3.0 to the total grade points
            } else if (grade.equalsIgnoreCase("C")) { // If the grade is "C" (ignoring case)
                totalGradePoints += 2.0; // Add 2.0 to the total grade points
            } else if (grade.equalsIgnoreCase("D")) { // If the grade is "D" (ignoring case)
                totalGradePoints += 1.0; // Add 1.0 to the total grade points
            } else if (grade.equalsIgnoreCase("F")) { // If the grade is "F" (ignoring case)
                totalGradePoints += 0.0; // Add 0.0 to the total grade points
            } else {
                System.out.println("Invalid grade entered. Please try again."); // Display an error message for invalid grades
                continue; // Skip incrementing the grade count and repeat the loop
            }

            gradeCount++; // Increment the grade count by 1
        }

        double gpa = totalGradePoints / 7.0; // Calculate the grade point average by dividing the total grade points by 7
        System.out.printf("Grade Point Average: %.2f%n", gpa); // Print the grade point average rounded to 2 decimal places
    }
}
