package Chapter21_2DArrays;

public class TwoDArrayCreate {

    /*
    An Array Inside Another Array
    An array inside another array is called a 2D array.
    A 2D arrays is symbolic of a table where there are rows and columns.
    The first index number represents the row position and the
    second index number represents the column position. Together, the row and column
    indices enable elements to be stored at specific locations.
    */

















    public static void main(String[] args) {
        /*
        2D Array Syntax
    1. array type followed by two empty brackets [][] followed by a name for the 2D array.
    2. The = operator followed by the keyword new followed by the array type and two brackets [][].
    3. The number of rows goes inside the first bracket and the number of columns goes inside the second bracket.
    4. 2D Arrays are zero-based meaning the index spots start at 0 for both the rows and columns
         */

        String [][] names = new String[3][3];
        System.out.println(names);
        System.out.println();

        //adding values to 2DArray:
        names[0][0] = "Mutants";
        names[0][1] = "Cosmic";
        names[0][2] = "Tech";
        names[1][0] = "Professor X";
        names[1][1] = "Jean Grey";
        names[1][2] = "Star Lord";
        names[2][0] = "Wolverine";
        names[2][1] = "Hercules";
        names[2][2] = "Spiderman Tech";





        /*
        To determine the number of rows and columns in the 2D array,
        we can use the instance variable length like we did for arrays.
        */
        //to get the number of rows in the names 2D Array
        System.out.println(names.length + " rows");

        //to get the number of columns, you will get a reference to any row and then read the length
        // property of that row.  this example will tell you how many columns are in row 0.
        System.out.println(names[0].length + " columns");
        System.out.println();
        //for AP exam 2D Arrays will have same number of columns for each row
        /*























        2D Array Access
        To access and modify elements inside a 2D array, you need to specific the row and column
        indices at which the elements are located. For example names[1][2] refers to the element
        that’s at row index 1 and column index 2.
         */

        //Initialize 2D Array
        String[][] names2 = { {"Alan", "Bob", "Carol", "David", "Ellen"},
                                {"Fred", "Grace", "Jerry", "Ian", "Jen"},
                                {"Kelly", "Liam", "Mary", "Nancy", "Owen"} };

        System.out.println(names2[1][2]);
        System.out.println();
        /*
        Try This How do I print the names from my 2D Array?
        I want them to print out like we listed them. 3 rows and 5 columns
         */
        System.out.println();
        for (int i = 0; i < names2.length; i++) {
            System.out.println();
            for (int j = 0; j < names2[i].length; j++) {
                System.out.print(names2[i][j] + " ");
                //if ((j + 1) % 5 == 0) {
                   // System.out.println();
                //}
                //Check if the column index (j) plus one is divisible by 5 (indicating the end of a row). If it is, we print a new line using System.out.println(), which causes the next name to be printed on a new line. This ensures that the names are printed in three rows and five columns.
            }
        }








        /*
        Try This How do I print the names from my 2D Array?
        I want them to print out like we listed them. 3 rows and 5 columns
         */





    /*
        for (int i = 0; i < names2.length; i++) {
            for (int j = 0; j < names2[i].length; j++) {
                System.out.print(names2[i][j] + " ");
                if ((j + 1) % 5 == 0) {
                    System.out.println();
                }
                //Check if the column index (j) plus one is divisible by 5 (indicating the end of a row). If it is, we print a new line using System.out.println(), which causes the next name to be printed on a new line. This ensures that the names are printed in three rows and five columns.
            }
        }
    */








        //2D Array Modification
        //To modify elements within a 2D array,
        // simply access the element and assign another element to it.

        String[][] names3 = { {"Alan", "Bob", "Carol", "David", "Ellen"},
                {"Fred", "Grace", "Mark", "Ian", "Jen"},
                {"Kelly", "Liam", "Mary", "Nancy", "Owen"} };

        System.out.println(names3[1][2]);

        names3[1][2] = "Harry";
        System.out.println(names3[1][2]);
        System.out.println();















        /*
        Row-Major vs. Column-Major Order
        In some cases, programmers may choose to store 2D array data inside a 1D array.
        The data is typically arranged either in row-major order or column-major order.

        Examples:
        2D Array Example:
        {Alan, Bob, Carol, David, Ellen}
        {Fred, Grace, Henry, Ian, Jen}
        {Kelly, Liam, Mary, Nancy, Owen}

        Row-major order will organize the data first from left to right then top to bottom.
        {Alan, Bob, Carol, David, Ellen, Fred, Grace, Henry, Ian, Jen, Kelly, Liam, Mary, Nancy, Owen}


        On the other hand, column-major order will organize the data from top to bottom first, then left to right.
        {Alan, Fred, Kelly, Bob, Grace, Liam, Carol, Henry, Mary, David, Ian, Nancy, Ellen, Jen, Owen}
         */












        //Try this
        /*
        Given This:
        int[][] nums = { {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9} };
        Write the code below so that when the nums array elements are each printed,
        they will be printed in column major order.
        Expected output:
        1
        4
        7
        2
        5
        8
        3
        6
        9

         */















        //Solution:
        int[][] nums = { {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9} };

        System.out.println(nums[0][0]);
        System.out.println(nums[1][0]);
        System.out.println(nums[2][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[1][1]);
        System.out.println(nums[2][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[1][2]);
        System.out.println(nums[2][2]);
















        //Try this #2
        /*
        Given This:
        int[][] points = {{2, 4},
                          {6, 10},
                          {18, 24} };
        Write the code below so that when the points array elements are each printed,
        they will be printed in row major order.
        Expected Output:

        2
        4
        6
        10
        18
        24
         */










        //Solution:

        int[][] points = {{2, 4},
                          {6, 10},
                          {18, 24} };
        System.out.println(points[0][0]);
        System.out.println(points[0][1]);
        System.out.println(points[1][0]);
        System.out.println(points[1][1]);
        System.out.println(points[2][0]);
        System.out.println(points[2][1]);
    }
}
