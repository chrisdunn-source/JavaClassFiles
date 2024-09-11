public class Automobile{
    private  String make;
    private  String model;
    private int year;

    public Automobile(String newMake, String newModel)
    {
        make = newMake;
        model = newModel;
    }
    public Automobile()
    {

    }

    public void printMakeName()
    {
        System.out.println("The make of my automobile is " +  make + " " + model);

    }
    public void setMake(String newMake)
    {
        make= newMake;
    }

    public void setModel(String newModel)
    {
        model = newModel;
    }

    public static void main (String [] args){
        Automobile auto1 = new Automobile("Honda", "Civic");
        Automobile auto2 = new Automobile();
        auto1.printMakeName();
        auto1.setMake("Toyota");
        auto2.setModel("Tahoe");
        auto1.printMakeName();
        auto2.printMakeName();
    }
}