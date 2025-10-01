package Chapter5;

public class MutantG {
    public static void main(String[] args) {
        Mutant obj1 = new Mutant();
        Mutant obj2 = new Mutant("Omega", "God");

        //obj1.name = "Billy";
        //obj2.type = "Omega";
        System.out.println(obj1.teacherName);
        System.out.println(obj2.teacherName);
    }
}
