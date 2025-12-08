package QuestionOfTheDay;

public class Airplane
{
    private int speed;
    private int location;

    public Airplane(int planeSpeed, int planeLocation)
    {
        speed = planeSpeed;
        location = planeLocation;
    }

    public void updateLocation()
    {
        location += speed;
    }

    public void updateLocation(int dx)
    {
        location += dx;
    }

    public static void main(String[] args) {
        Airplane blue = new Airplane(300, 1000);
        blue.updateLocation();
        blue.updateLocation(500);
        blue.printLocation();
    }

    public void printLocation(){
        System.out.println(location);
    }
}