package Chaper18_Arrays.ForEach;

public class EnhancesFor {
    /*
    forEach a.k.a enhanced for each
    for (<data type> <loop variable> : <array variable>)
    {

    }
     */
    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 20};
        String[] myColors = {"red", "blue", "green"};
        //The for each loop will automatically loop over the entire array and
        // exit the loop when there are no more elements to process
        for(int value : myArray)
        {
            System.out.println(value);
        }
        for(int i = 0 ; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }


        //Important Limitations of Enhanced for() Loops
    }
}
