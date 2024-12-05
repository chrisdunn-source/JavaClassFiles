public class TraversingArrays {
    public static void main(String[] args) {
        int[] scores = {80, 92, 91, 68, 88};
        //Traversing using a for loop

        System.out.println("Traversing using a for loop");
        for(int i = 0; i < scores.length; i++)
        {
            // This prints out the ith element!
            System.out.println(scores[i]);
        }

        //Traversing using a while loop
        System.out.println();
        System.out.println("Traversing using a while loop ");
        int index = 0;
        int target = 91;
        while (index < scores.length)
        {
            if (scores[index] == target)
                break;
            index ++;
        }
        System.out.println("The target was found at: " + index);





        //Traversing using a for each loop
        System.out.println();
        System.out.println("Traversing using a for each loop");
        for(int score: scores )
        {
            System.out.println(score);
        }
    }

}
