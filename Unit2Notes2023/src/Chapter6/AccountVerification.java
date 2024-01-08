package Chapter6;
import java.util.*;
public class AccountVerification {
    //Main method
    public static void main(String [] args)
    {
        //Store storedUsername as captainbob and storedPassword as ahoy
        String storedUsername = "captainbob";
        String storedPassword = "ahoy";
        //String storedUsername = new String ("captainbob");
        //String storedPassword = new String ("ahoy");

        // get username and password from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        // store in inputUsername and inputPassword
        String inputUsername = input.nextLine();

        System.out.println("Enter Password: ");
        String inputPassword = input.nextLine();



        //close Scanner
        input.close();

        // Use a case-insensitive search to see if storedUsername equals inputUsername
        boolean userNameMatch = storedUsername.equalsIgnoreCase(inputUsername);

        // Use a case-sensitive search to see if storedPassword and inputPassword are exactly equal
        boolean userPasswordMatch = storedPassword.equals(inputPassword);

        //Output results
        System.out.println("Username Match: " + userNameMatch);
        System.out.println("Password Match: " + userPasswordMatch);
    }
}
