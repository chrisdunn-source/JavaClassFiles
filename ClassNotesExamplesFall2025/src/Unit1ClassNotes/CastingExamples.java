public class CastingExamples {
    public static void main(String[] args) {
        //Automatic Widening(Casting)
        double y = 5;
        System.out.println(y);

        int a = 10;
        int b = 4;
        //This is explicit casting
        double c = (double)a / b;
        System.out.println(c);

        double z = 2.56;
        int d = (int)(z + 0.5);
        System.out.println(d);

    }
}
