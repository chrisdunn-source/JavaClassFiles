public class StringMethods {
    public static void main(String[] args) {
        String output1 = new String("How Bout Them Cowboys!");


        String word1 = output1.substring(0,3); // 1st #Inclusive 2nd Exclusive
        System.out.println(word1);


        String word2 = output1.substring(4,13);
        System.out.println(word2);

        String word3 = output1.substring(14);
        System.out.println(word3);
    }
}
