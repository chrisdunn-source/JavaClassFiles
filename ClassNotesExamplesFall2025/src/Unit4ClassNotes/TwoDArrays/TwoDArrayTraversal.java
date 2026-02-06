package Unit4ClassNotes.TwoDArrays;

public class TwoDArrayTraversal {
    public static void main(String[] args) {
        int [][] quizzes = {{90, 85, 77, 61, 94, 89},
                            {94, 80, 85, 75, 88, 80},
                            {93, 81, 80, 78, 90, 85},
                            {89, 87, 82, 81, 96, 90}};

        //Rows will be for quiz scores
        //Column will be for Students
        //Row-Major Traverse
        System.out.println("Row-Major Usage");
        System.out.println("Print out all quiz scores for each quiz: ");
        for(int row = 0; row < quizzes.length; row++)//outer loop
        {
            for (int col= 0; col < quizzes[0].length; col++)//inner loop
            {
                System.out.print(quizzes[row][col] + " ");
            }
            System.out.println();
        }
        for(int[] row : quizzes)
        {
            for(int score : row)
            {
                System.out.print(score + " ");
            }
            System.out.println();
        }




        System.out.println();

        //Column-Major Traversal
        System.out.println("Column-Major Usage");
        System.out.println("Print out all of the quiz scores for each student");
        for(int col = 0; col < quizzes[0].length; col++)//Outer Loop
        {
            for(int row = 0; row < quizzes.length; row++)//Inner Loop
            {
                System.out.println(quizzes[row][col]);
            }
            System.out.println();
        }

    }
}
