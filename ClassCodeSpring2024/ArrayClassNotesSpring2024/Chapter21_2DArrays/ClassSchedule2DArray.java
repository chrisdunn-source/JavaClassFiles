package Chapter21_2DArrays;

public class ClassSchedule2DArray {
    public static void main(String[] args) {
        String[][] schedule = { {"", "", "", "Class Periods", "", "","",""},
                {"", "", "0", "1", "2", "3","4","5"},
                {"", "1", "No Class", "Principles", "Principles", "Java","No Class","Football"},
                {"Tri", "2", "No Class", "Principles", "Principles", "Football","No Class","Principles"},
                {"", "3", "No Class", "Football", "Principles", "No Class","Java","Football"}
        };

        for (int i = 0; i < schedule.length; i++) {
            System.out.println();
            for (int j = 0; j < schedule[i].length; j++) {
                String formattedElement = String.format("%-12s", schedule[i][j]);
                System.out.print(formattedElement);
            }
        }
    }
}
