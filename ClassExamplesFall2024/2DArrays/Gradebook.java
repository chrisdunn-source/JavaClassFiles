
public class Gradebook {
    public static void main(String[] args) {
        int [] student1 = {90, 87, 86, 56, 96};
        int [] student2 = {65, 76, 87, 84, 93};
        int [] student3 = {85, 56, 91, 90, 65};
        int [] student4 = {65, 56, 78, 31, 65};
        int [] student5 = {85, 56, 71, 80, 39};

        //System.out.println("Student 1's scores: " + student1[0] +"," + student2[0] + ","+ student3[0]+ "," + student4[0] +"," + student5[0]);

        int[][] gradeBook = {student1,student2,student3,student4,student5};
        int [][] gradeBook2 = new int [5][4];
        gradeBook2[0] = student1;
        gradeBook2[1] = student2;
        gradeBook2[2] = student3;
        gradeBook2[3] = student4;
        gradeBook2[4] = student5;

        int[][] gradeBook3 = {{90, 87, 86, 56, 96},
                              {65, 76, 87, 84, 93},
                              {85, 56, 91, 90, 65},
                              {65, 56, 78, 31, 65},
                              {85, 56, 71, 80, 39}};

        //Row Major Traversal
        for (int row = 0 ; row < gradeBook3[0].length; row++)
        {
            System.out.println(gradeBook3[0][row]);
        }
        System.out.println();
        //Column Major Traversal
        for (int column = 0 ; column < gradeBook3[3].length; column++)
        {
            System.out.println(gradeBook3[column][3]);
        }
        System.out.println("Row Major Traversal");
        // Row Major Traversal the entire 2D array use a nested for Loop
        for (int row = 0 ; row < gradeBook3.length; row++)
        {
            for (int column = 0 ; column < gradeBook3[row].length; column++)
            {
                System.out.print(gradeBook3[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Column Major Traversal");
        //Column Major Traversal
        for(int row = 0; row < gradeBook3[0].length; row++)
        {
            for(int column = 0; column < gradeBook3.length; column++)
            {
                System.out.print(gradeBook3[column][row] + " ");
            }
            System.out.println();
        }

    }
}
