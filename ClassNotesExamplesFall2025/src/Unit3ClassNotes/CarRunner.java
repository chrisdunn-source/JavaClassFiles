package Unit3ClassNotes;

public class CarRunner {
    public static void main(String[] args) {
        Engine engine1 = new Engine(300);
        Car car1 = new Car(engine1);

        System.out.println(car1.getEngine().getHorsepower());
    }
}
