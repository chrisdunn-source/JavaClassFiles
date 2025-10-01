package Chapter7;

public class Lesson1 {
    public static void main(String[] args) {
        /*
        Since the Java language is completely object-oriented,
         each primitive data type is also represented by its own Java class.
         These are called Wrapper Classes
         java.lang package is imported automatically for every Java program, so
         do not need to import
         */

        //What is the difference between a primitive and reference type?

        //Wrapper Class Initialization
        // declare & initialize Integer object with value 4
        Integer myInt1 = new Integer(4);

        // declare & initialize Double object with 4.0
        Double myDouble1 = new Double(4.0);

        System.out.println(myInt1 + " Is an Integer Object");
        System.out.println(myDouble1 + " Is a Double Object");

        //Integer myInt1 = new Integer(4); can also be written as
        //Integer myInt1 = 4;
        //Double myDouble1 = new Double(4.0); can also be written as
        //Integer myDouble1 = 4.0;

        //Java Wrapper classes Example
        //Converting primitive to object and vice versa
        int initialPrimitiveValue = 30;

        //Autoboxing: Converting primitives into objects
        Integer intObject = initialPrimitiveValue;

        //Printing objects
        System.out.println("Integer object: " + intObject );

        //Unboxing: Converting Objects to Primitives
        int intValue = intObject;

        //Printing primitives
        System.out.println("Int value: " + intValue);

        //Manually Extracting a Wrapper Object Value
        Integer objA = 10;
        int intPrimativeA = objA.intValue(); //Long Way to assign value from object to primitive
        int intPrimativeB = objA; //Short way to assign value from object to primative
        System.out.println(intPrimativeA);
        System.out.println(intPrimativeB);

        //Assign int called myInt to value of 42. Next assign a String object called myStr1 to myInt

        //Converting Number to Strings with toString()
        int myInt = 42;
        String myStr1 = Integer.toString(myInt);
        System.out.println("Converted primitive myInt value of " + myInt + " to a String object \"" + myStr1+ "\"");

        //Automatic Use of toString() During Concatenation
        int intVotingAge = 18;
        String strVotingAge = "" + intVotingAge; //combine a string with a number gives you a string
        System.out.println("Voting age in texas is: " + strVotingAge);















        //Converting Strings to Numbers

        String areaCode = "817";
        int myAreaCode = Integer.parseInt(areaCode);
        System.out.println("My area code is " + myAreaCode);

        /*
        Things you NEED to know
        Wrapper Class
        Autoboxing/Unboxing
        toString()
        Converting from Strings to Numbers
        Converting Numbers to Strings
        Primitive Data Types Vs Reference Data Types
         */












    }
}
