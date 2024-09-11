import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperClass {
    /*
    int  - Integer
    double - Double
    char - Character
    boolean - Boolean
     */
    public static void main(String[] args) {
        Integer num1 = new Integer(35);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer num2 = new Integer(68);//reference
        //method intValue returns the value of the Integer to an int
        int i = num2.intValue();//converts to int primitive type
        System.out.println("The value of num2 is " + i);

        /*
        Autoboxing
        -This is when you convert a primitive value into an object
         */


        ArrayList<Integer> newList = new ArrayList<Integer>();
        int primitive = 14;
        System.out.println(newList);
        newList.add(primitive);
        System.out.println(newList);

        //Integer myInt = new Integer(53);
        Integer myInt = 53;

        //Double myDouble = new Double(9.54);
        Double myDouble = 9.54;

        //Unboxing
        //Converting an object into corresponding primitive value
        int myInt2 = myInt;
        double myDouble2 = myDouble;
    }
}
