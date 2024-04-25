package Chapter19_ArrayLists;
import java.util.ArrayList;
import java.util.List;
public class ListFiltering {
    /*
    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

    Example
    Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
    Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
    Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
     */
    public static void main(String[] args) {
        List<Object> input1 = List.of(1, 2, "a", "b");
        List<Object> input2 = List.of(1, "a", "b", 0, 15);
        List<Object> input3 = List.of(1, 2, "a", "b", "aasf", "1", "123", 123);

        System.out.println(filterList(input1)); // Output: [1, 2]
        System.out.println(filterList(input2)); // Output: [1, 0, 15]
        System.out.println(filterList(input3)); // Output: [1, 2, 123]
    }
    public static List<Object> filterList(List<Object> list) {
        List<Object> result = new ArrayList<>();

        for (Object element : list) {
            if (element instanceof Integer) {
                result.add(element);
            }
        }

        return result;
    }
}
