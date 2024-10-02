public class StringComparisonExample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        // Using equals() method
        System.out.println(str1.equals(str2)); // Output: false
        System.out.println(str1.equals(str3)); // Output: false

        // Using equalsIgnoreCase() method
        System.out.println(str1.equalsIgnoreCase(str3)); // Output: true

        // Using compareTo() method
        System.out.println(str1.compareTo(str2)); // Output: a negative value (str1 comes before str2)
        System.out.println(str1.compareTo(str3)); // Output: a positive value (str1 comes after str3)
        System.out.println(str1.compareTo(str1)); // Output: 0 (str1 is equal to str1)
    }
}
