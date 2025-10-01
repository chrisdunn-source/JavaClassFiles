public class ArrayAlgorithms {
    /*
    Array Algorithms
    When combined with loops and conditionals, certain helpful tasks are possible with arrays.
     */

    public static void main(String[] args) {
        //Searching for a Particular Element
        String[] cars = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
        String Camry = "A Camry is not available."; //default String value

        for (String s : cars) { //enhanced for loop
            if (s.equals("Camry")) { //if "Camry" is in array
                Camry = "A Camry is available."; //variable changes if "Camry" exists
            }
        }

        System.out.println(Camry); //print whether Camry exists or not












        //Try this out
        /*
        Try to modify the code above so that the algorithm will look for
        Prius in the array and will print A Prius is available. if Prius
        is an element and A Prius is not available. if it is not an element.
         */



















        //Solution
        String[] cars2 = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
        String Prius = "A Prius is not available.";

        for (String s : cars2) {
            if (s.equals("Prius")) {
                Prius = "A Prius is available.";
            }
        }

        System.out.println(Prius);













        //Finding a Minimum or Maximum Value
        int[] grades = {72, 84, 63, 55, 98};
        int min = grades[0]; //set min to the first element in the array

        for (int i : grades) { //enhanced for loop
            if (i < min) { //if element is less than min
                min = i; //set min to element that is less
            }
        }
        //elements are not modified so enhanced for loop can be used

        System.out.println("The lowest grade is " + min); //print lowest element












        //Try This Out

        //try to modify the code so that the algorithm will look for the maximum element instead?





















        //Solution
        int[] grades2 = {72, 84, 63, 55, 98};
        int max = grades2[0];

        for (int i : grades2) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The highest grade is " + max);















        //Shifting Elements One Index to the Left
        String[] letters = {"A", "B", "C", "D", "E"};

        String first = letters[0]; //store first element as variable
        for(int i = 1; i < letters.length; i++)
        {
            letters[i - 1] = letters[i];
        }
        letters[letters.length-1] = first;

        for (String s: letters)
        {
            System.out.print(s + " " );
        }
        System.out.println();






















        for (int i = 0; i < letters.length-1; i++) { //iterate through array excluding last index
            letters[i] = letters[i+1]; //copy the element to the right into current index
        }
        letters[letters.length-1] = first; //copy original first element as last element

        for (String i : letters) {
            System.out.print(i + " "); //print array elements
        }
        System.out.println();















        //Try this out
        /*
        try to modify the code so that the algorithm will shift the elements one index to the right?
         */


















        System.out.println();
        //Solution
        String[] letters2 = {"A", "B", "C", "D", "E"};

        String last = letters2[letters2.length-1]; //store last element as variable
        for (int i = letters2.length-1; i > 0; i--) { //iterate array from back to front excluding first index
            letters2[i] = letters2[i-1]; //copy the element to the left into current index
        }
        letters2[0] = last; //copy original last element as first element

        for (String i : letters2) {
            System.out.print(i + " "); //print array elements
        }
        System.out.println();
        last = letters2[letters2.length-1]; //store last element as variable
        for (int i = letters2.length-1; i > 0; i--) { //iterate array from back to front excluding first index
            letters2[i] = letters2[i-1]; //copy the element to the left into current index
        }
        letters2[0] = last; //copy original last element as first element

        for (String i : letters2) {
            System.out.print(i + " "); //print array elements
        }
    }
}














