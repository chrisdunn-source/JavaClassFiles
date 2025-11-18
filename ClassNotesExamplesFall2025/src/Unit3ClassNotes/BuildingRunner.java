package Unit3ClassNotes;
/*
🏛️ Your Challenge: The Building and Address Classes
You need to set up two classes so that you can retrieve a specific piece of information using a method chain.
The final code, when written correctly, should allow you to print the zip code to the console.
📝 Step 1: Design the Inner Class (CityAddress)
This class holds the specific data you want.
Field: A private field for the zip code (a string, e.g., "76054").
Other Field: A private field for the street name (a string).
Constructor: A constructor to initialize both fields.
Getter Method: A public method that returns the zip code.
📝 Step 2: Design the Outer Class (Building)
This class uses the inner class as an attribute.
Field: A private field for the building's name (a string, e.g., "The Gem Tower").
Other Field: A private field that holds a reference to an CityAddress object.
Constructor: A constructor to initialize both fields.
Getter Method: A public method that returns the stored CityAddress object.
📝 Step 3: Write the Main Method (Main)
In your main method, you need to:
Create an instance of the CityAddress class.
Create an instance of the Building class, linking it to the CityAddress object.
Construct and use the final method chain starting with your Building object (e.g., myBuilding) to print the zip code.
 */
public class BuildingRunner {
    public static void main(String[] args) {
       CityAddress add1 = new CityAddress("75054", "Sherry Street");
       Building build1 = new Building("Downtown", add1);
       CityAddress add2 = new CityAddress("76010", "Sam Houston Dr");

        System.out.println(build1.getAddr().getStreetName());
        build1.setAddr(add2);
        System.out.println(build1.getAddr().getStreetName());
    }
}
