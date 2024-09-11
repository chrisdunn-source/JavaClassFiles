public class StringObjects {
    public static void main(String[] args) {



        //Immutable Strings
        String name = "Iceman";
        name.toUpperCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);








        //Concatenated Strings
        String firstName = "Coach";
        String lastName = "Dunn";
        String fullName = firstName + lastName;


        //Concatenated Primitives
        int currentAge = 56;
        int age = 10;
        System.out.println("In ten years i will be: " + (currentAge + age));










        //Escape Sequences
        String favoriteQuote = "\"Dreams without Goals are Just Dreams\"";






        /*






        String name1 = "Coach Dunn";
        String name2 = "Coach Dunn";
        String name3 = new String("Coach Dunn");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name1);
     */

    }
}
