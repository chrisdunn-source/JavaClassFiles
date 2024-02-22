public class Topic4_4_nestedIteration {
    public static void main(String[] args) {
        // Outer loop for rows (1 to 9)
        for (int i = 1; i <= 9; i++) {
            // Inner loop for columns (1 to 9)
            for (int j = 1; j <= 9; j++) {
                // Calculate the result for current row and column
                int result = i * j;

                // Convert the result to a string and add leading and trailing spaces
                String resultString = " " + result + " ";

                // Extract the last three characters from the resultString
                String formattedResult = resultString.substring(resultString.length() - 3);

                // Print the formatted result
                System.out.print(formattedResult);
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
