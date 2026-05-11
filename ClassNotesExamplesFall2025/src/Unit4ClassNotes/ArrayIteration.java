public class ArrayIteration {
    public static void main(String[] args) {
        //What we have been doing
        String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen",
                "Fred", "Grace", "Henry", "Ian", "Jen"};

        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);
        System.out.println(friends[5]);
        System.out.println(friends[6]);
        System.out.println(friends[7]);
        System.out.println(friends[8]);
        System.out.println(friends[9]);

        System.out.println();
        //Same output using a for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(friends[i]);
        }

        System.out.println();

        //Same output using a for loop and using .length
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
        System.out.println();

        //iterating backwards
        for (int i = 9; i >= 0; i--) {
            System.out.println(friends[i]);
        }
    }
}
