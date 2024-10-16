import static java.lang.Character.isUpperCase;

public class StringAlgorithms {
    public static void main(String[] args) {
        /*
        name.length()
        - Returns the number of characters in a String Object
         */
        //Example of .length()
        String superHeroName = "Super Man";
        System.out.println(superHeroName.length());

        /*
        name.substring(x,y) , name.substring(x)
        Returns the substring beginning at index x (inclusive) and ending at index y(exclusive)
        Returns the substring starting at index x (inclusive) and goes to the end of the string
         */
        String greeting = "Hello there";
        //i want to print out ello
        //that is index spot 1, and after o is 5
        String partOfWord = greeting.substring(1,5);
        System.out.println(partOfWord);

        /*
        String Traversal
        You can use a the .length() method inside of a for loop to traverse a string
         */
        //Example: Print each character of a string on a new line
        String printMe = "Print Me!";
        for(int i = 0; i < printMe.length(); i++)
        {
            System.out.println(printMe.substring(i,i+1));
        }

        /*
        name.indexOf(x)
        Returns the index of the first occurrence of x; returns -1 if not found

        name.charAt(x)
        Returns the index of the character x
         */
        String checkMe = "Not to Day!";
        System.out.println(checkMe.indexOf('o'));
        System.out.println(checkMe.charAt(2));
        System.out.println(checkMe.indexOf('O'));

       //Determine how many characters are Uppercase in a string
        //

    }
    public int numUpperCase(String string){
        //counter variable
        int counter = 0;
        for (int i = 0; i < string.length(); i++)
        {
            char character = string.charAt(i);
            if(isUpperCase(character))
            {
                counter++;
            }
        }
        return counter;
    }

    //Step one: create method signature
    public String reverse(String string)
    {
        //Step two: create new String to hold reversed String
        String newString = "";
        //Step three: create for loop
        for (int i = string.length() - 1; i >= 0; i--) {
            //Step four: access last index of String
            String character = string.substring(i, i+1);
            //Step five: add index to new String
            newString += character;
            //Step six: return new String

        }
        return newString;
    }
}
