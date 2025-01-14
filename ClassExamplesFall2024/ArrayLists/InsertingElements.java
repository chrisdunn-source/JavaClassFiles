import java.util.ArrayList;
public class InsertingElements {
    /*
    1.Imagine you're building a shopping list application. You can use an ArrayList to store the items on the list.

    Requirements:

    1.Create an ArrayList: Create an ArrayList named shoppingList to store the names of items on the shopping list.
    2.Add Items:
        Initially, add several items to the shoppingList ArrayList (e.g., "Milk", "Eggs", "Bread").
        Implement a method addItem(String item) to add a new item to the end of the shopping list.
    3.Print Shopping List: Implement a method printShoppingList() to display all the items currently on the shopping list.
     */
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        addItem(shoppingList, "Water");
        addItem(shoppingList,"Chips");
        printShoppingList(shoppingList);
    }
    public static void addItem(ArrayList<String> list, String item)
    {
        list.add(item);
    }

    public static void printShoppingList(ArrayList<String> list)
    {
        System.out.println("Shopping List: ");
        for (String item: list)
        {
            System.out.println("- " + item);
        }
    }
}
