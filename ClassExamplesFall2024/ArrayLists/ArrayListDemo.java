
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Ways to create array lists
        ArrayList<String> newNames = new ArrayList<String>();
        List names2 = new ArrayList<String>();
        newNames.add("Student1");
        newNames.add("Student2");
        newNames.add("Student3");
        System.out.println(newNames);

        //Only Holds objects
        //When do i use arraylist vs arrays
        //When you know the size of the array use arrays
        //When size changes alot use arraylist
        //.add - adds object to the end of list
        //.add(index, object) - adds object at position index
        //.get(index)- returns object at index
        //.size - returns the number of elements in a ArrayList
        //.remove(index) removes element at position index
        //.set(index, obj) - replaces ojb at position index

        newNames.add(1, "Coach Dunn "); //add(index, object)
        newNames.add(2, "AP Computer Science");//add(index, object)
        System.out.println(newNames);
        String teacherName = newNames.get(1);//.get
        String className = newNames.get(2);//.get
        System.out.println(newNames.size());//.size
        newNames.set(4, "Java Programming");//set
        newNames.remove(4);//remove








    }
}
