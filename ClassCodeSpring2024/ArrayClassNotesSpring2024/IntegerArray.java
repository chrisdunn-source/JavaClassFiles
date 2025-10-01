public class IntegerArray
{
    public static void main(String [] args)
    {
        //integer array declared and intialized
        int [] list2 = new int[5];
        int [] list = {4,9,-3,5,2};

        list2[0] = 5;

        //output the first element
        System.out.println(list[0]);

        //output last element
        System.out.println(list[4]);

        //output the value -3
        System.out.println(list[2]);

        //output the element in position 4
        System.out.println(list[3]);

        //output length
        System.out.println(list.length);
    }
}