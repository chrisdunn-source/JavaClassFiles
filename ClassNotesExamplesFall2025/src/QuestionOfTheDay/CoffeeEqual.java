package QuestionOfTheDay;

public class CoffeeEqual {
    public static void main(String[] args) {
        String morning = new String("Coffee");
        String noon = new String("Coffee");
        String evening = morning;

        if (morning==noon)
        {
            System.out.print("A");
        }
        if (morning.equals(noon))
        {
            System.out.print("B");
        }
        if (morning==evening)
        {
            System.out.print("C");
        }
        else if (morning.equals(evening))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
    }
}
