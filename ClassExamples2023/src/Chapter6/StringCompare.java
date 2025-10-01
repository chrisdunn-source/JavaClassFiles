package Chapter6;

public class StringCompare {
    public static void main(String[] args) {
        //What is a String?
        //Series of chars
        String name = "john";
        String name1 = new String("John");

        String myString1 = "abc";
        String myString2 = "abc";
        String myString3 = "ABC";
        String myString4 = "abcd";

        boolean isNameEqual = name.equals(name1);
        System.out.println(isNameEqual);

        boolean isResultEqual1 = myString1.equals(myString2);
        boolean isResultEqual2 = myString3.equals(myString4);
        System.out.println(isResultEqual1);
        System.out.println(isResultEqual2);
        boolean isNameEqual2 = name.equalsIgnoreCase(name1);

    }
}
