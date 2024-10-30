Example 1
Create A very simple example of using nested loops is to print a matrix of
 characters using two for loops. Suppose we would like to print this pattern.
                
                #####
                #####
                #####
                #####
                #####

Example #2
      This time let's print a triangle of asterisks, or stars. 
      We want our output to look like this.
      
      *
      **
      ***
      ****
      *****
Example 3
Write code which prints every number from 1 to 20
 a number of times equal to the number itself 
(e.g. one 1, two 2's...). Every individual number 
printed should be separated by a space, and there 
should be a new line each time the number changes. 
You should use nested loops to produce your output 
(it will result in far less code).

Sample Output
1 
2 2 
3 3 3 
........

Solutions to Guided Practice:
public class GuidedNestedLoops {

    public static void main(String [] args)
    {
        System.out.println("Example # 1");
        for(int x = 1; x <= 5; x++)
        {
            for(int y = 1; y <= 5; y++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Example number 2.");

        for (int x = 1; x <= 5; x++)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Example number 3");

        //Outer loop iterates through each number from 1 to 20
        for(int i = 1; i <= 20; i++)
        {

            //Inner loop prints the number i, i times
            for(int j = 0; j < i; j++)
            {
                System.out.print(i + " ");
            }

            //Adds a new line
            System.out.println();
        }
    }
}
