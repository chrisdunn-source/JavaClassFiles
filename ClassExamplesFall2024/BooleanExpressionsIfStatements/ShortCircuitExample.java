public class ShortCircuitExample {

    public static void main(String[] args) {
        User user = null;

        if (user != null && user.getName().equals("John")) {
            System.out.println("Hello, John!");
        } else {
            System.out.println("User is null or not named John.");
        }
    }
}
 class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}