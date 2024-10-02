package Chapter8;

public class Lesson1 {
    /*
    Logical expressions are parts of a statement that evaluate
    to a boolean true or false.  Logical expressions are very
    important because they allow your program to make decisions
    about what code to run.

    less than (<) operator
    less than or equal to (<=) operator
    greater than (>) operator
    greater than or equal to (>=) operator.
    equal to (==) operator.
    not equal to (!=) operator.
     */
    public static void main(String[] args) {
        boolean result1 = 42 < 42;      // logical expression stored in a boolean variable
        System.out.println(result1);    // boolean variable printed to the screen

        System.out.println(42 < 42);     // print false result directly to the screen
        System.out.println(42 <= 42);    // true
        System.out.println(100 > 1);     // true
        System.out.println(100 >= 101);  // false
        System.out.println(7 == 7);      // true
        System.out.println(7 != 7);      // false

        //Mathematical Expression Vs Logical Expressions
        //Mathematical expressions always result in a number. Example 1 + 2
        //Logical expressions always result in either "true" or "false". Example 1 < 2

        int age = 21;
        boolean newResult1 = age >  18;
        boolean newResult2 = age == 18;
        boolean newResult3 = age != 18;

        int age2 = 21;
        int cutoff = 18;

        boolean r1 = age2 > cutoff;        // compare two variables
        boolean r2 = age2 == cutoff + 3;    // compare variable to result of math expression
        boolean r3 = age2 - 1 != cutoff + 2;  // compare two math expression results

        String person1 = "Billy";
        String person2 = "billy";
        boolean twoPeople = person1.equals(person2);
        boolean twopeople = person1 == person2;



    }

}
