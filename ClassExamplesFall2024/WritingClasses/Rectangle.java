public class Rectangle
{
     private int width;
     private int height;
    public Rectangle(int theWidth,int theHeight)//constructor
    {
        width = theWidth;
        height = theHeight;
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
}
