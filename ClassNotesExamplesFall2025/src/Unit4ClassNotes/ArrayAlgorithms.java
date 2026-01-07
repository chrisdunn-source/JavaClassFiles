package Unit4ClassNotes;

public class ArrayAlgorithms {
    /*
    Some of the more used Algorithms for Arrays
     */
    public static void main(String[] args) {
        //Mathematical Analysis
        //find the minimum
        int[] scores = {80, 92, 91, 68, 88};

        int minIndex = scores[0];// assign min value to first value in list

        for (int i = 1; i < scores.length; i++) {//loop through list starting at 2 spot since first spot is min value
            if (scores[i] < minIndex) {//check to see if the element you are looking at is less than current min
                minIndex = i;// if true update minIndex
            }
        }

        System.out.print("Minimum number: ");
        System.out.println(scores[minIndex]);
        System.out.print("Found at index: ");
        System.out.println(minIndex);

        //Tracking Values in a List
        String[] grades = {"A", "C", "B", "A", "B"};
        //How many A's are in the list
        int numAs = 0;// variable to store the number of As
        for (String a : grades)//foreach to go thru the entire list
        {
            if (a.equals("A")) //check to see if value matches value in list
            {
                numAs++;//update counter
            }
        }
        System.out.print("Number of A's: ");//Display output
        System.out.println(numAs);

        //Checking for Consecutive Elements
        int[] numbers = {5, 4, 3, 3, 5};
        boolean consecutive = false;

        for (int i = 0; i < numbers.length - 1; i++)
        {
            if (numbers[i] == numbers[i + 1]) {
                consecutive = true;
            }
        }
        System.out.print("Number has consecutive: ");
        System.out.println(consecutive);


        //Reordering Arrays
        //Shift Elements to the right by 1
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] temp = new int[numbers2.length]; //Create default array

        //Loop, but stop at the last element (edge case)
        for (int i = 0; i < numbers2.length - 1; i++){
            temp[i + 1] = numbers2[i];
        }

        temp[0] = numbers2[numbers2.length - 1]; //Edge case
        numbers2 = temp; //Copy over to the original array

        for (int i = 0; i < numbers2.length; i++){
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        //Finding Duplicates
        int[] numbers3 = {1, 2, 3, 3, 4, 5};
        boolean hasDuplicate = false;

        for (int i = 0; i < numbers3.length - 1; i++){
            for (int j = i + 1; j < numbers3.length; j++){
                if (numbers3[i] == numbers3[j]){
                    hasDuplicate = true;
                }
            }
        }

        System.out.print("Has Duplicate: ");
        System.out.println(hasDuplicate);


    }

}
