public class January1626 {
public static void main(String []args)
  {
    int[] values = {4, 25, 13, 7, 62};

    int mystery = 0;

    for (int i = 0; i < values.length; i++)
    {
        if (values[i] % 2 == 0) 
    {
        mystery++;
    }
}

System.out.println(mystery);
  }
}
