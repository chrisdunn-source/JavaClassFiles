import java.util.ArrayList; //import java.util.*;
public class IntroArrayLists {
    /*
     ArrayLists are dynamic, meaning you can make changes to them while the program is running.
     ArrayLists are particularly helpful when you don’t know how large your collection of
     elements will become. Since ArrayLists are dynamic, you can add and remove elements later
     on if needed. In order to use ArrayLists, you must import it using
     import java.util.ArrayList; in the header of your program.
     */

    public static void main(String[] args) {
        //Creating an ArrayLists
        /*
        ArrayList Creation
        To create an ArrayList, you need to include the following:
        The keyword ArrayList followed by the data type in angle brackets <>.
        Note that unlike arrays, ArrayList types are labeled slightly differently (e.g. Integer, Double, Boolean,
        and String).
        A variable name that refers to the ArrayList.
        The assignment operator = followed by the keyword new.
        Another ArrayList keyword followed by the data type in angle brackets <> followed by empty parentheses ().
         */

        //Syntax
        //ArrayList<int> numbers = new ArrayList<int>(); This is incorrect because it is a primitive type
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        /*
        ArrayList will output its elements instead of its reference address. When an ArrayList is initialized,
         it is empty by default. This is why printing a new ArrayList results in empty brackets [].
         */
        System.out.println(numbers);








        //This Can be used but is not common practice
        ArrayList numbers2 = new ArrayList();

        System.out.println(numbers2);














        /*
        Determining ArrayList Size
        ArrayLists use the method size() to determine the number of elements that exist instead of length
        which is used for arrays. When an ArrayList is initially created, its size is automatically 0
        since all new ArrayLists are empty by default.
         */

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();

        System.out.println(numbers3.size());














        //Array vs ArrayList Initialization
        String[] array = {"This ","Array ","Has ","Five ","Values "};
        printArray(array);
        // arrays need to be initialized with the total number of values that will be stored
        String[] expandedArray = new String[6];
        //in order to expand arrays, we need to create a new array with a bigger size
        //and copy values from original to the new one:
        for(int i =  0; i < array.length; i++)
        {
            expandedArray[i] = array[i];
        }
        expandedArray[expandedArray.length-1] = "Now it has six!";
        printArray(expandedArray);








        ArrayList<String> arrays = new ArrayList<String>();
        //Add
        arrays.add("First");
        arrays.add("Second");
        arrays.add("Seven");
        arrays.add(2,"Third");
        System.out.println("Arrays PreLoop " + arrays);
        arrays.remove("Seven");
        //for(int i = 0; i <arrays.size(); i++)
        //{
        //  if(arrays.get(i).equals("Seven"))
        // {
        //   arrays.remove(i);
        //}
        //}

        System.out.println("Arrays PostLoop " + arrays);
        //Revmove
        //arrays.remove(0);









        //Get Information
        arrays.get(0);

        //Set Information
        arrays.set(0,"Last");

        //printArray(arrays);
    }













    public static void printArray(String[] array)
    {
        for(String elem: array)
        {
            System.out.print(elem);
        }
        System.out.println();
    }
    public static void printArray(ArrayList<String> arrayList)
    {
        for(String elem: arrayList)
        {
            System.out.print(elem);
        }
        System.out.println();
    }
}