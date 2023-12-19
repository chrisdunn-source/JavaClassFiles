package Chapter5;

public class Contact {
    //Class Data
    String teacherName;
    String name;
    String phoneNumber;
    int age;

    public Contact()
    {
        teacherName = "Coach Dunn";
    }

    public Contact(String newName)
    {
        name = newName;
    }

    public void greeting()
    {
        System.out.println("Hi, nice to meet you");
    }

    public int birthYear(int currentYear)
    {
        return currentYear - age;
    }






    public String getName(String name) {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static void currentMonth()
    {
        System.out.println("We are currently in September!");
    }
    public static String guessMyName(String myName)
    {
        return myName;
    }


}
