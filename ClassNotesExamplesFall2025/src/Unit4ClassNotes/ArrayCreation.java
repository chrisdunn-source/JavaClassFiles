package Unit4ClassNotes;

public class ArrayCreation {
    public static void main(String[] args) {
        //Ways to use Arrays
        //reference types
        String[] list = {"milk", "eggs", "bananas"};
        String[] toDos = {"walk dog", "paint", "read"};
        //Primative Types
        int[] temps = {55, 60, 45, 48, 50};
        double[] times = {45.5, 44.9, 50.0, 45.8};

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.2);
        Circle circle3 = new Circle(7.8);
        //Object Types
        Circle[] circles = {circle1, circle2, circle3};


    }
}
