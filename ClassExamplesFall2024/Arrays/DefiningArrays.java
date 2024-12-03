public class DefiningArrays {
    //arrays data structure that allows you to organize information of the same data types
    /*
    Primitives
    int
    doubles
    char

    Reference Types
    Strings
    Objects

     */
    int [] intArray1 = new int[5];
    //arrays are FIXED. Size of the array can not change
    //defalut values in an array
    /*
    int = 0
    double = 0.0
    boolean = false
    Objects= null
     */
    public static void main(String[] args) {
        int [] intArray2 = {80, 92,91,68,88};
        //String list with 10 null elements
        String [] stringArray = new String[10];
        //double list with 100 zeros
        double [] doubleArray = new double[100];
        //4 element String list
        String[] greetings = {"Hello", "Hola", "Bonjour", "Ni hao"};
        //List with 5 student items
        String[] stringNames = {"julian", "larisa", "amada", "mikka", "jay"};
        Person [] personArray = new Person[3];
        personArray[0] = new Person("Coach Dunn", 108);
        personArray[1] = new Person("Mark", 25);
        personArray[2] = new Person("Clark", 16);

        Person person1 = new Person("Susan" ,65);
        Person person2 = new Person("Cindy",77);
        Person person3 = new Person("Mya", 15);
        Person [] personArray2 = {person1,person2,person3};
        //Find the size of the array .length
        System.out.println(personArray.length);
        System.out.println(personArray2.length);
        //Finding the last index of an array arrayName.length -1
        System.out.println(personArray[personArray.length-1].name);
        /*
        Key Points
        -Must store same values
        -Arrays are fixed in size
        -Declare or initialize size in declaration
         */

        int[] numbers = {20, 30, 40, 50};
        changer(numbers);
        for(int num : numbers)
        {
            System.out.println(num);
        }
    }
    public static void changer(int[] nums)
    {
        nums[1] += 10;
    }
}
