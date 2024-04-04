import java.util.ArrayList;
public class IteratingArrayLists {
    public static void main(String[] args) {

        //iterating through an ArrayList
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(85);
        grades.add(95);
        grades.add(48);
        grades.add(100);
        grades.add(92);

        /*
        Iterating through an ArrayList is very similar to iterating through an array.
        The main difference is that in an ArrayList, we use get() to access the elements
        instead of brackets []. Both of the code blocks below use a regular for to produce
         the exact same results.
         */

        for (int i = 0; i < grades.size(); i++)
        {
            System.out.println(grades.get(i));
        }
        System.out.println();







        /*
        Difference Between .length, length(), and size()

        .length is a field, containing the capacity (NOT the number of elements the array contains at the moment)
        of arrays.

        length() is a method used by Strings (amongst others), it returns the number of chars in the String;
         with Strings, capacity and number of containing elements (chars) have the same value.

        size() is a method implemented by all members of Collection (lists, sets, stacks,...).
        It returns the number of elements (NOT the capacity; some collections even don´t have a defined capacity)
         the collection contains.
         */



        //iterating an ArrayList with Enhanced For Loop
        ArrayList<Integer> grades2 = new ArrayList<Integer>();
        grades2.add(85);
        grades2.add(95);
        grades2.add(48);
        grades2.add(100);
        grades2.add(92);

        for (Integer i : grades2) { //Integer is required instead of int!
            System.out.println(i);

        }
        System.out.println();













        //Another Example of Iterating through an ArrayList
        ArrayList<Double> BMI = new ArrayList<Double>();
        BMI.add(18.5);
        BMI.add(25.0);
        BMI.add(30.0);

        for (Double d : BMI) {
            System.out.println(d);
        }
        System.out.println();















        //iterating through an ArrayList with while loop
        ArrayList<Integer> grades3 = new ArrayList<Integer>();
        grades3.add(85);
        grades3.add(95);
        grades3.add(48);
        grades3.add(100);
        grades3.add(92);

        int i = 0;
        while (i < grades3.size()) {
            System.out.println(grades3.get(i));
            i++;
        }
        System.out.println();

















        //Modifying Elements During Traversal
        //Explain what is going on with with code segment
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(12.34);
        prices.add(45.67);
        prices.add(89.01);
        prices.add(10.01);
        prices.add(21.12);

        int j = 0;
        while (j < prices.size()) {
            if (j == 2) {
                prices.remove(j);
            }
            else {
                System.out.println(prices.get(j));
                j++;
            }

            /*
            Answer
            The code above skips 89.01, 10.01, and 21.12 due to the way the loop is written. if (i == 2)
            {prices.remove(i)} causes the system to constantly remove the element at index 2. This in turn
            causes the element in the next index to become the new element at index 2. The cycle continues
            until there are no more elements at index 2 or after.
             */

        }

    }


}
