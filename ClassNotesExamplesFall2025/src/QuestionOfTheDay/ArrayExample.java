public class ArrayExample {
    public static void main(String[] args) {
        // Initialize the original array
        String[] arr = {"a", "b", "c", "d", "e"};
        
        // Create a separate copy of the array
        String[] copy = {"a", "b", "c", "d", "e"};
        
        // Modify the copy's second element
        copy[1] = "e";
        
        // Print values of both arrays
        System.out.println("arr[1]: " + arr[1]); // Should print "b"
        System.out.println("copy[1]: " + copy[1]); // Should print "e"
    }
}
