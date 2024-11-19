package WritingMethods;


public class WritingMethodsExamples {
    private int width;
    private int height;

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

    //taking a whole number and making it a real number with decimal places
    public double castDouble(int number)
    {
        return (double)number;
    }
    public void resetRect(WritingMethodsExamples rect)
    {
        rect.setWidth(0);
        rect.setHeight(0);
    }
//public String toString()
//{
 //   return "Width is " + width + " \n" + "Height is " + height;
//}
}
