package Chaper18_Arrays;

public class ArrayDemo1 {
    //Using For Loop to Traverse
    //main method
    public static void main(String[] args) {
        // create a 100 element int array
        int [] myIntArray = new int[100];
        //create a for loop to iterate myIntArray
        for(int i = 0; i < myIntArray.length;i++){
            myIntArray[i] = i;
        }

        //create a 5 element array called scores { 90,85,72,53,100}
        //traverse through array find the average of the scores
        int[] myScores = { 90,85,72,53,100};
        int sum = 0; // variable used to store some
        int average = 0; //variable used to store average of scores
        //loop through the length of the array
        for (int i = 0; i < myScores.length; i++){
            //each time we iterate through the array we will add current value to sum
            sum += myScores[i];
        }
        average = sum /myScores.length; //calculate the average by dividing sum by lenght of array
        System.out.println(average); //print out average
    }
}
