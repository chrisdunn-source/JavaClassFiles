package RectangleClasses;
public class Rectangle
{
     private int width;
     private int height;
     private static int numRect = 0;
         public Rectangle(int theWidth,int theHeight)//constructor
    {
        width = theWidth;
        height = theHeight;
        numRect++;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public static int getNumRect()
    {
        return numRect;
    }

    public String toString()
    {
        return "The width of the Rectangle is: " + width + " and the height of the Rectangle is: " + height;
    }
    public static void rectEquations()
    {
        System.out.println("The formula for area is: L * W");
        System.out.println("The formula for perimeter is: 2(L + W)");
    }



}
