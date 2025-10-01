package Chaper18_Arrays.ForEach;

public class Hat {
    private String name; //instance variables
    private double cost; //instance variables

    public Hat(String newName, double newCost)// constructor
    {
        name = newName;
        cost = newCost;
    }

    // accessor methods
    public String getName()
    {
        return name;
    }
    public double getCost()
    {
        return cost;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setCost(double newCost)
    {
        this.cost = newCost;
    }
}
