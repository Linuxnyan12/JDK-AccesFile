public class CarDemo {

    // ENUM for Color
    enum Color {
        RED,
        BLUE,
        GREEN,
        BLACK,
        WHITE,
        YELLOW
    }

    // ENUM for Model
    enum Model {
        SEDAN,
        SUV,
        CONVERTIBLE,
        HATCHBACK
    }

    // Car class
    static class Car {

        // private fields
        private int dogYear;
        private Model catModel;
        private Color birdColor;

        // constructor
        public Car(int tigerYr, Model lionModel, Color pandaColor) {
            dogYear = tigerYr;
            catModel = lionModel;
            birdColor = pandaColor;
        }

        // display method
        public void display() {
            System.out.println("Year: " + dogYear);
            System.out.println("Model: " + catModel);
            System.out.println("Color: " + birdColor);
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {

        // create two Car objects
        Car rabbitCar = new Car(2014, Model.SUV, Color.RED);
        Car eagleCar = new Car(2020, Model.SEDAN, Color.BLACK);

        // display data
        rabbitCar.display();
        eagleCar.display();
    }
}
