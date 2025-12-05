package QuestionOfTheDay;

public class Triangle
{

    private int base;
    private int height;

    public Triangle(int triBase, int triHeight)
    {
        base = triBase;
        height = triHeight;
    }

    public Triangle(int triSide)
    {
        base = triSide;
        height = triSide;
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle(5);
        tri.printTriangle();
    }

    public void printTriangle()
    {
        System.out.println("The base is " + base +
                " and the height is " + height + ".");
    }
}