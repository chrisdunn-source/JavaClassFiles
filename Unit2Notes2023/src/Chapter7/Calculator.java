package Chapter7;

public class Calculator {
    public static void main(String[] args)
    {
        // find the next highest integer for the value 1.5
        double result1 = Math.ceil(1.5);
        System.out.println("Value: " + result1);

        // find the value of 3 raised to the 4th power
        double result2 = Math.pow(3,4);
        System.out.println("3 raised to power 4: " + result2);

        // find the square root of 36
        double result3 = Math.sqrt(36);
        System.out.println("Square root of 36: " + result3);

        // find a random integer between 10 and 20
        int result4 = (int)(Math.random() * 10) + 10;
        System.out.println("Random number: " + result4);
    }
}
