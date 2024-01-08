package Chapter5;

public class StaticOverloadedMethods {
    public static void main(String[] args) {
        Mutant mutant1 = new Mutant("Iceman");
        mutant1.goodBye();//non static method, must have an object
        Mutant.mutantGreeting();//static method no object required
        Contact.currentMonth();
        System.out.println(Mutant.guessLevel("Omega"));
        System.out.println(Contact.guessMyName("Coach Dunn"));
    }
}
