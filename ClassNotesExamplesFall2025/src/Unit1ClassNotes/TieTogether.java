public class TieTogether {
    //Create a non void string method called greeting
    //return Hello with name

    public String greeting(String name)
    {
        return "Hello, " + name;
    }
    public static String greeting2(String name)
    {
        return "Hello, " + name;
    }


    public static void main(String[] args) {
        TieTogether greetName = new TieTogether();
        System.out.println(greetName.greeting("Coach Dunn"));
        System.out.println(greeting2("Mr. Dunn"));
    }
}
