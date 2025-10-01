package Chaper18_Arrays;

public class ArrayDemo3 {
    //Traversing Part of An Array
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 9; i < myIntArray.length;i++){
            System.out.print(myIntArray[i] + " ");
        }
        System.out.println();
        for(int i = myIntArray.length-1; i >= 0; i--)
        {
            System.out.print(myIntArray[i] + " " );
        }
    }
}
