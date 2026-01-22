import java.io.File;  // Importing the File class to work with files
import java.io.FileNotFoundException;  // Importing the FileNotFoundException class for handling file not found errors
import java.util.Scanner;  // Importing the Scanner class to read input from the file

public class TemperatureReader {  // Defining a class named TemperatureReader

    public static void main(String[] args) {  // Main method where the program execution starts
        int minTemp = readMinTemperatureFromFile("temperatures.txt");  // Calling a method to find the minimum temperature
        System.out.println("Minimum temperature: " + minTemp);  // Printing the minimum temperature
    }

    public static int readMinTemperatureFromFile(String fileName) {  // Method to read the minimum temperature from a file
        int minTemp = Integer.MAX_VALUE;  // Initializing the minimum temperature to the maximum integer value

        try {  // Handling potential file-related errors
            File myText = new File(fileName);  // Creating a File object with the specified file name
            Scanner scan = new Scanner(myText);  // Creating a Scanner object to read from the file

            while(scan.hasNextInt()) {  // Looping through each integer value in the file
                int currentTemp = scan.nextInt();  // Reading the next integer value from the file
                if(currentTemp < minTemp) {  // Checking if the current temperature is less than the minimum temperature found so far
                    minTemp = currentTemp;  // Updating the minimum temperature if a smaller temperature is found
                }
            }

            scan.close();  // Closing the Scanner object to release system resources
        } catch (FileNotFoundException e) {  // Catching and handling the file not found exception
            System.out.println("File not found: " + e.getMessage());  // Printing an error message
        }

        return minTemp;  // Returning the minimum temperature found
    }
}
