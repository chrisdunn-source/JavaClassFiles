public class MathExamples {
    //Multiply two integers and return the result
    // non void method
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public int add(int c, int d)
    {
        return c + d;
    }
    public int remainder(int e, int f)
    {
        return e % f;
    }

    public void multiply2(int g, int f)
    {
        System.out.println(g * f);
    }
    public static int addNumber(int a, int b)
    {
        return a + b;
    }




    public static void main(String[] args)
    {
    MathExamples calculator = new MathExamples();
    int product = calculator.multiply(5,6);
    System.out.println("The product is " + product);
    product = calculator.add(5,6);
    System.out.println("The sum is " + product);
    product = calculator.remainder(5,6);
    System.out.println("The remainder is " + product);
    calculator.multiply2(5,6);

    System.out.println(addNumber(10, 20));
    product = addNumber(30,60);


    }
}
