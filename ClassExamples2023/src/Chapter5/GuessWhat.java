package Chapter5;

public class GuessWhat
{
    public static void main(String[] args)
    {
        String guess1 = "GreenLantern";
        String guess2 = "Superman";
        String guess3 = null;
        String guess4 = guess3;

        guess2 = guess1;
        guess3 = guess1;

        System.out.println("guess1 = " + guess1);
        System.out.println("guess2 = " + guess2);
        System.out.println("guess3 = " + guess3);
        System.out.println("guess4 = " + guess4);
    }
}

