public class DeMorgansLaw {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // First law
        boolean result1 = !(a && b);
        boolean result2 = !a || !b;

        System.out.println("First law: " + (result1 == result2)); // Output: First law: true

        // Second law
        boolean result3 = !(a || b);
        boolean result4 = !a && !b;

        System.out.println("Second law: " + (result3 == result4)); // Output: Second law: true
    }
}
