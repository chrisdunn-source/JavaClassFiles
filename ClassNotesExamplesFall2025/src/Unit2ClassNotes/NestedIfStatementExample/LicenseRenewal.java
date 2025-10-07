package NestedIfStatementExample;
import java.util.Scanner;
public class LicenseRenewal {
    /*
License Renewal Eligibility
A state needs to check two separate requirements before approving a driver's license renewal.

First, write an if statement to check if the applicant's age is 25 or older.
Nested inside the first if, write another if statement to check if the applicant has had zero traffic violations in the last year.

If both conditions are true, print: "Your license renewal is approved."

If the applicant is 25 or older but has violations, print: "Renewal requires further review due to violations."
     */
    public static void main(String[] args) {//Main method
        Scanner scanner = new Scanner(System.in);//Scanner Object

        System.out.print("Enter applicant's age: ");//Ask for input
        int age = scanner.nextInt();//Store input

        System.out.print("Enter number of traffic violations in the last year (0 or more): ");//ask for input
        int violations = scanner.nextInt();//store input

        // Outer if: Check the first requirement (Age)
        if (age >= 25) {

            System.out.println("Age requirement met. Checking violations...");

            // Nested if: Check the second requirement (Violations)
            if (violations == 0) {
                System.out.println("Your license renewal is approved.");
            } else {
                // This 'else' belongs to the nested 'if' (violations check)
                System.out.println("Renewal requires further review due to violations.");
            }

        } else {
            // This 'else' belongs to the outer 'if' (age check)
            System.out.println("Renewal denied: Applicant must be 25 or older.");
        }

        scanner.close();
    }
}
