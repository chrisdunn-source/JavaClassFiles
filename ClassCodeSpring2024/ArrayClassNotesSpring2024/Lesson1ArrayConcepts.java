package Chaper18_Arrays;

public class Lesson1ArrayConcepts {
    //What is an array?
    /*
    a data structure that allow you to hold a collection of similar values

    Data structure is a way to organize a large collection of information efficiently
     */
    public static void main(String[] args) {
        //Declare an Array
        // data type [] arrayName;
        //Declare an integer array called myArray?
     int [] myArray;   //declaring
     myArray = new int [5];// assigning 5 places to myArray

     int [] myIntArray = {1,2,3,4,5};   //shortcut to declaring and assigning values to an array

       //Create a String array called dogBreeds, give it 4 values;
       String [] dogBreeds = {"Shepard", "Retriever", "Beagle", "Poodle"};

       //accessing item in an array
        System.out.println(dogBreeds[1]);

        //set a different value in my array
        dogBreeds[2] = "Boxer";

        //I want to add husky to my array
        String [] dogBreeds2 = {"Shepard", "Retriever", "Boxer", "Poodle", "Husky"};

        //What does this output
        dogBreeds2[0] = dogBreeds[3];

        //Array of Objects
        //Dog [] myDogs; // declare and array of Dog objects
        //myDogs = new Dog[3];
        Dog [] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        //Checking Array Size
        //Size of dogBreeds, dogBreeds2, and myDogs
        System.out.println("DogBreeds has " + dogBreeds.length + " dogs" );
        System.out.println("DogBreeds2 has " + dogBreeds2.length +   " dogs" );
        System.out.println("MyDogs has " + myDogs.length +  " dog references" );



    }
}
