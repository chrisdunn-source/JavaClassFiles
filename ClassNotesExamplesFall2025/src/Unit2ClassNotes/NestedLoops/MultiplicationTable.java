package Unit2ClassNotes.NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int line = 1; line < 6; line++)
        {
            for(int number = 1; number < 6; number++)
            {
                System.out.println(number * line + " ");
            }
            System.out.println();
        }
    }
}
