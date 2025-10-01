public class DoubleArray {

    /*
 Write a program to instantiate an array of doubles called grades to
 hold nine values.Write three statements to output the values in the first,
 middle, and last positions.Reassign the values in those same positions
 to grades you have recently earned in this class.Create an output statement
 containing an expression to output the average of those three grades you
 just entered using the indexing process.
*/
    public static void main(String [] args)
    {
         //Write a program to instatiate an array of doubles called grades
         //to hold nine values
         double [] grades = {95,87.5,88,76,25.5,33.5,68,95, 84};

         //write three statements to output the first, middle and last positions
         System.out.println(grades[0]);
         System.out.println(grades[4]);
         System.out.println(grades[8]);

         //Reassign the values in those same postions to grades you have
         //recently earned in the class

         grades[0] = 85;
         grades[4] = 73;
         grades[8] = 92;

         //Create an output statement containing an expression to output the
         //average of those three grades you just entered using the indexing
         //process

         System.out.println((grades[0] + grades[4] + grades[8])/3);
    }


}
