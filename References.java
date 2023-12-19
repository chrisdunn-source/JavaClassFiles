package Chapter5;

public class References {

    public static void main(String[] args) {

       //Defining Reference Variables
        Contact name1 = null;
        Contact name2 = null;

        //Assigning Values to an object (Instantiation)

        Contact name3 = new Contact();
        name3.name = "Josh";
        name3.phoneNumber = "787-898-5465";


        //Multiple Chapter5.References to the Same Object
        Contact name4 = name3;


        System.out.println(name3.name);
        System.out.println(name3.phoneNumber);

        //Introducing the String Class
        String gradClass;
        String gradClass2 = new String();

        //Declaring and Initializing String Variables
        String teacherName = new String("Coach Dunn");
        String teacherName2 = "Coach Dunn";

        //Displaying Strings
        System.out.println(teacherName);

        //Concatenating (Combinding Strings)
        System.out.println("My name is " + teacherName);

        //calling a method
        name3.greeting();
        name3.age = 16;
        System.out.println(name3.birthYear(2023));



    }



}
