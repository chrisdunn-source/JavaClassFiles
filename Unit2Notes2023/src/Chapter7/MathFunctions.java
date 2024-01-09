package Chapter7;

public class MathFunctions {
    public static void main(String[] args) {
        //Math.abs Returns the absolute value of X.
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(2));
        System.out.println();

        //Math.ceil Returns the smallest integer value greater than or equal to X.
        System.out.println(Math.ceil(8.6));
        System.out.println();

        //Math.floor Returns the greatest integer value less than or equal to X.
        System.out.println(Math.floor(6.8));
        System.out.println();

        //Math.PI Returns pi
        System.out.println(Math.PI);
        System.out.println();

        //Math.log Returns the natural logarithm (base "e") of X
        System.out.println(Math.log(4.4));
        System.out.println();

        //Math.min  Returns min value of two parameters
        System.out.println(Math.min(7,47));
        System.out.println();

        //Math.max() Returns max value of two parameters
        System.out.println(Math.max(46,167));
        System.out.println();

        //Math.sqrt Returns the square root of the double X.
        System.out.println(Math.sqrt(16.0));
        System.out.println();

        //Math.round Returns Rounded number
        System.out.println(Math.round(5.7));
        System.out.println();

        //*******Generating Random Values********
        double result1 = Math.random();
        double result2 = Math.random();
        double result3 = Math.random();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        double result4 = Math.random() * 5;
        double result5 = Math.random() * 100;
        double result6 = Math.random() * 1000;

        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        int result7 = (int)(Math.random() * 5) + 5;     // result1 between 5 and 10 (excluding 10)
        int result8 = (int)(Math.random() * 100) - 50;  // result2 between -50 and +50 (excluding 50)
        int result9 = (int)(Math.random() * 10) + 20;   // result3 between 20 and 30 (excluding 30)



    }



}
