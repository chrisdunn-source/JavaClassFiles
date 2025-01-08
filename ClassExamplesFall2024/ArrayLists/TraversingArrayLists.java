
import java.util.ArrayList;
import java.util.Arrays;

public class TraversingArrayLists {
    public static void main(String[] args) {

        //We use loops to traverse through each item in an Array:
        int[] scores = {8, 2, 1, 6, 7};
        for(int i = 0; i < scores.length; i++)
        {
            // This prints out the ith element!
            System.out.print(scores[i]  + " ");
        }
        System.out.println();

        //Example 1
        ArrayList<Integer> scores1 = new ArrayList<Integer>(Arrays.asList(80, 92, 91, 68, 88));
        for(int i = 0; i < scores1.size(); i++)
        {
            // This prints out the ith element!
            System.out.print(scores1.get(i)  + " ");
        }
        System.out.println();
        //Example 2
        ArrayList<Integer> scores2 = new ArrayList<Integer>();
        scores2.add(95);
        scores2.add(9105);
        scores2.add(106);
        scores2.add(6);
        scores2.add(87);
        int i = 0;
        while(i < scores2.size()) {
            System.out.print(scores2.get(i) + " ");
            i++;
        }
        System.out.println();
        //Example 3
        ArrayList<Integer> scores3 = new ArrayList<Integer>(){{add(75); add(12); add(64); add(15); add(16);}};

        for(int score: scores3) {
            System.out.print(score + " ");
        }
        System.out.println();

        //Example 4 Removing items from a list
        ArrayList<String> dcNames = new ArrayList<String>();
        dcNames.add("Clark Kent");
        dcNames.add("Lex Luthor");
        dcNames.add("Lois Lane");
        dcNames.add("Princess Diana");

        removeP(dcNames);

    }
    public static void removeP(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i).startsWith("P"))
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
