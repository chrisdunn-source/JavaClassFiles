package Chaper18_Arrays;
/*
    Problem 2: JerseyNumbers
    Class name: JerseyNumbers
    Write a program to instantiate an integer array containing jersey numbers of your favorite players (for any sport, any team), no fewer than 10 values. Write four loops, your choice of for, while, or do while, and output the following, with single spaces between each value, and a new line for each loop:
    all the jersey numbers in forwards order
    all the jersey numbers in reverse order
    all the jersey numbers in forwards order except the first element of the array
    all the jersey numbers in reverse order except for the last element of the array
    For example, if the jersey numbers were 34, 11, 15, 17 and 29, the four outputs would be:
    34 11 15 17 29
    29 17 15 11 34
    11 15 17 29
    17 15 11 34
    You are required to use the length field in controlling each of the loops.
 */
public class JerseyNumbers {
    public static void main(String[] args) {
        int [] favoriteJerseys = {81,2,3,11,24,6,80,1,84,32};

        for (int i = 0; i < favoriteJerseys.length;i++)
        {
            System.out.print(favoriteJerseys[i] + " ");
        }
        System.out.println();
        for (int i = favoriteJerseys.length-1; i >= 0;i--)
        {
            System.out.print(favoriteJerseys[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < favoriteJerseys.length;i++)
        {
            System.out.print(favoriteJerseys[i] + " ");
        }
        System.out.println();
        for (int i = favoriteJerseys.length-2; i >= 0;i--)
        {
            System.out.print(favoriteJerseys[i] + " ");
        }
    }
}
