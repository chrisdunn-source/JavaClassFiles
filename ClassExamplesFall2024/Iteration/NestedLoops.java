public class NestedLoops {
    //Print out a running list of numbers from 1-5 using a forloop

    //Sample output
    // 1  2  3  4  5
    // 2  4  6  8 10
    // 3  6  9 12 15
    // 4  8 12 16 20
    // 5 10 15 20 25

    public static void main(String[] args) {
        /*
        for(int count = 1; count < 6; count++)
        {
            System.out.print(count + " ");
        }
        System.out.println();

        for(int count = 1; count < 6; count++)
        {
            System.out.print(count*2 + " ");
        }

        System.out.println();

        for(int count = 1; count < 6; count++)
        {
            System.out.print(count*3 + " ");
        }
        System.out.println();

        for(int count = 1; count < 6; count++)
        {
            System.out.print(count*4 + " ");
        }

        System.out.println();

        for(int count = 1; count < 6; count++)
        {
            System.out.print(count*5 + " ");
        }
*/
        for(int line = 1; line < 6; line++)
        {
            for(int number = 1; number < 6; number++)
            {
                System.out.print(number*line + " ");
            }
            System.out.println();
        }


    }

}
