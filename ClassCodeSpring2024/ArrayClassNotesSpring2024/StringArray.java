public class StringArray {
    /*
Write a program to create a String array called friends using an
initializer list that contains the first names of five of your
classmates. Output each element of the array using the indexing
process. Change at least one of the names to another classmate’s
first name, and then output all five names again, in the same order
as the first output series.
*/

    public static void main(String [] args)
    {
        //create a String array called friends using an
        //initializer list that contains the first names of five of your
        //classmates.
        String [] friends = {"Carson", "Clark", "Tuf", "Travis", "Justin"};

        //Output each element of the array using the indexing
        //process.
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);

        //Change at least one of the names to another classmate’s
        //first name
        friends[1] = "Johnny";

        //output all five names again, in the same order
        //as the first output series.
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);


    }

}
