package Chapter19_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAlgorithms {
    public static void main(String[] args) {
        /*
        ArrayLists can be used to search for a particular element and to find a minimum or maximum element
        . Additionally, ArrayLists can reverse the order of elements rather than just simply printing the
        elements in reverse order.
         */
        //Searching for a Particular Element
        //Create an ArrayList of strings called cars
        /*ArrayList<String> cars = new ArrayList<String>();
        //Add these items to the ArrayList Corolla, Camry, Prius, RAV4 and Highlander
        String camry = "A Camry is not available."; //default String value
        cars.add("Corolla");
        cars.add("Camry");
        cars.add("Prius");
        cars.add("RAV4");
        cars.add("Highlander");

        //use a forEach loop to see if camry is in our list
        for (String searchIndex : cars) { //enhanced for loop
            if (searchIndex.equals("Camry")) { //if "Camry" is in ArrayList
                camry = "A Camry is available."; //variable changes if "Camry" exists
            }
        }
        System.out.println(camry); //print whether Camry exists or not
        System.out.println();
























        *//*
        Try This:
        1. add cars.remove(1); to the line directly below cars.add("Highlander");
        2. modify the code above so that the algorithm will look for Prius in the arrayList
         and will print A Prius is available. if Prius is an element and A Prius is not available.
          if it is not an element.
         *//*





















        //Solution
        ArrayList<String> cars2 = new ArrayList<String>();
        String Prius = "A Prius is not available.";

        cars2.add("Corolla");
        cars2.add("Camry");
        cars2.add("Prius");
        cars2.add("RAV4");
        cars2.add("Highlander");

        for (String s : cars2) {
            if (s.equals("Prius")) {
                Prius = "A Prius is available.";
            }
        }

        System.out.println(Prius);
        System.out.println();


        //Finding a Minimum or Maximum Value
        //Create an ArrayList of ints called grades
        ArrayList<Integer> grades = new ArrayList<Integer>();

        // add values 72,84,63,55,98
        grades.add(72);
        grades.add(84);
        grades.add(63);
        grades.add(55);
        grades.add(98);
        int min = grades.get(0); //set min to the first element in the array
        int max = grades.get(0);
        for (int i : grades) { //enhanced for loop
            if (i < min) { //if element is less than min
                min = i; //set min to element that is less
            }
        }
        for (int i : grades) {
            if (i > max) {
                max = i;
            }
        }
        //elements are not modified so enhanced for loop can be used




















        System.out.println("The lowest grade is " + min); //print lowest element











        *//*
        1.add grades.set(0, 42); to the line directly below grades.add(98);?
        2.modify the code so that the algorithm will look for the maximum element instead?
         *//*

        //Solution
        ArrayList<Integer> grades2 = new ArrayList<Integer>();
        grades2.add(72);
        grades2.add(84);
        grades2.add(63);
        grades2.add(55);
        grades2.add(98);

        int max2 = grades2.get(0);

        for (int i : grades2) {
            if (i > max2) {
                max2 = i;
            }
        }

        System.out.println("The highest grade is " + max);
        System.out.println();





*/
        //Reversing the Order of Elements
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");

        System.out.println(letters); //print original ArrayList
        int original = letters.size(); //original size

        for (int i = letters.size() - 1; i >= 0; i--) {
            letters.add(letters.get(i));
            //letters.remove(i);
        } //add elements in reverse order to the ArrayList
        for (int j = 0; j < original; j++) {
            letters.remove(0);
        } //remove all the original elements
        System.out.println(letters.toString());










        //regular for loops needed to access element indices

/*


        *//*
        Note that we used letters.remove(0) rather than letters.remove(j) in the code above because remove()
        deletes both the element and the index. Thus, the next element in the ArrayList becomes the new 0th
        index which we want to continue to delete.
         *//*

        System.out.println(letters); //print new ArrayList

        System.out.println();

        //Calculating an Average
        ArrayList<Double> grades3 = new ArrayList<Double>();
        grades3.add(72.0);
        grades3.add(84.5);
        grades3.add(63.0);
        grades3.add(55.0);
        grades3.add(98.8);

        double total = 0; //keeps track of total

        for (Double d : grades3) { //iterate through ArrayList
            total += d; //add each element to total
        }

        double avg = total / grades3.size(); //calculate average

        System.out.println(avg); //print average
        System.out.println();

        //Determine If at Least One Element Has a Particular Property (Use Student Class at bottom)

        Student andy = new Student("Andy", 9);
        Student bonnie = new Student("Bonnie", 10);
        Student carla = new Student("Carla", 12);
        Student david = new Student("David", 12);

        ArrayList<Student> students = new ArrayList<Student>();
        //add Student objects to ArrayList
        students.add(andy);
        students.add(bonnie);
        students.add(carla);
        students.add(david);

        for (Student st : students) { //iterate through ArrayList
            if (st.getGrade() == 12) { //if student object or element has attribute of grade == 12
                System.out.println(st.getName()); //print that object's name
            }
        }

        System.out.println();
*/
        //Print Duplicate Elements
        ArrayList<String> lastNames = new ArrayList<String>();
        lastNames.add("Anderson");
        lastNames.add("Carson");
        lastNames.add("Carson");
        lastNames.add("Grayson");
        lastNames.add("Jackson");
        lastNames.add("Jackson");
        lastNames.add("Jackson");
        lastNames.add("Parson");















        int count = 0; //keep track of duplicate elements

        for (int i = 0; i < lastNames.size(); i++) { //loop for current index
            for (int j = i + 1; j < lastNames.size(); j++) { //loop for next index
                if (lastNames.get(i).equals(lastNames.get(j))) { //if current index element equals next element
                    count++; //increment count by 1
                    if (count == 1) {                    //print duplicate element
                        System.out.println(lastNames.get(i));  //but print only once
                    } else {
                        break; //break if count not equal to 1
                    }
                } else {
                    count = 0; //reset count
                }
            }
        }
        System.out.println("The number of duplicates");

/*
        //Shifting Elements One Index to the Left

        ArrayList<String> letters3 = new ArrayList<String>();
        letters3.add("A");
        letters3.add("B");
        letters3.add("C");
        letters3.add("D");
        letters3.add("E");

        String first = letters3.get(0); //store first element as variable
        for (int i = 0; i < letters3.size()-1; i++) { //iterate through ArrayList excluding last index
            letters3.set(i, letters3.get(i+1)); //set the element to the right as current index
        }
        letters3.set(letters3.size()-1, first); //set original first element as last element

        for (String s : letters3) {
            System.out.println(s); //print ArrayList elements
        }
        System.out.println();

        //Applying Multiple Algorithms
        *//*
        Multiple array and/or ArrayList algorithms can be used together to perform a series of tasks.
        Let’s take a look at an example that incorporates both an array and ArrayList.
         *//*
        int[] integers = {4, 7, 10, 12, 20, 35, 43, 50, 57, 66};
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int z : integers) {
            if (z % 2 == 0) {
                evens.add(z);
                System.out.println(z);
            }
        }

        System.out.println();
        *//*
        The code above iterates through the integers 1D array, then adds all elements that are even
         to the evens ArrayList.
         *//*

        *//*
        Now let’s say you want to create another ArrayList called tens in which you want to store all integers
        from evens that are divisible by 10. Additionally, you want to remove the elements that are added to tens
        from evens.
        Ultimately, the elements added to tens are:
        [10, 20, 50]
        And the elements left within evens are:
        [4, 12, 66]
         *//*
        int[] integers2 = {4, 7, 10, 12, 20, 35, 43, 50, 57, 66};
        ArrayList<Integer> evens2 = new ArrayList<Integer>();

        for (int i : integers2) {
            if (i % 2 == 0) {
                evens.add(i);
                System.out.println(i);
            }
        }

        System.out.println();

        ArrayList<Integer> tens = new ArrayList<Integer>();

        for (int i = 0; i < evens2.size(); i++) {
            if (evens2.get(i) % 10 == 0) {
                tens.add(evens2.get(i));
                evens2.remove(i);
                i--;
            }
        }

        System.out.println(tens);
        System.out.println(evens2);

        System.out.println();*/
    }
}
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void getInfo() {
        System.out.print("Student name: " + this.name);
        System.out.println(", Student grade: " + this.grade);
    }
}