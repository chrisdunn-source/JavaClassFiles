package VariableScope;

public class Trolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        Trolls trolls = new Trolls();
        int today = 20, tomorrow = 40;
        System.out.println(today + trolls.tomorrow + trolls.yesterday);
    }
}
