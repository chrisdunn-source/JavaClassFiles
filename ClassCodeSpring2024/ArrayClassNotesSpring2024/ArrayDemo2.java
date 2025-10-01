package Chaper18_Arrays;

public class ArrayDemo2 {
    //Using a while loop
    public static void main(String[] args) {
        // create a 100 element int array
        int [] myIntArray = new int[100];
        //create a while loop to iterate myIntArray
        int i = 0;// initial value
        //condition is in the while statement
        while(i < myIntArray.length){
            myIntArray[i] = i;
            i++; //update the initial value.
        }
    }


}
