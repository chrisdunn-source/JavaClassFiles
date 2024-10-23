public class EquivalentLoops {
    public static void main(String[] args) {
        System.out.println("Original Code");
        int total = 0;
        for (int k = 0; k <= 100; k += 2)
        {

            total += k;
            System.out.println("k= "+ k + " total= "+ total);
        }
        System.out.println();

        System.out.println("Answer Choice A");
        int total2 = 0;
        for (int k = 1; k < 101; k += 2)
        {
              total2 +=k;
            System.out.println("k= "+ k + " total= "+ total2);
        }
        System.out.println();
        System.out.println("Answer Choice B");
        int total3 = 0;
        for (int k = 1; k <= 101; k +=2)
        {

            total3 += k-1 ;
            System.out.println("k= "+ k + " total= "+ total3);
        }
        System.out.println();

        System.out.println("Answer Choice C");
        int total4 = 0;
        for (int k = 0; k <= 101; k +=2)
        {

            total4 +=k + 1;
            System.out.println("k= "+ k + " total= "+ total4);
        }
        System.out.println();
        System.out.println("Answer Choice D");
        int total5 = 0;
        for (int k = 1; k <= 101; k +=2)
        {

            total5 += k + 1;
            System.out.println("k= "+ k + " total= "+ total5);
        }
        System.out.println();
        System.out.println("Answer Choice E");
        int total6 = 0;
        for (int k = 1; k <= 101; k +=2)
        {

            total6 += k-1;
            System.out.println("k= "+ k + " total= "+ total6);
        }
        System.out.println();

    }
}
