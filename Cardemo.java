import java.util.Scanner;

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

    public static void main(String[] args) {

        Scanner zebraScanner = new Scanner(System.in);

        // INPUT for Car 1
        System.out.print("Enter year for Car 1: ");
        int monkeyYear1 = zebraScanner.nextInt();

        System.out.println("Choose Model (SEDAN, SUV, CONVERTIBLE, HATCHBACK): ");
        Model tigerModel1 = Model.valueOf(zebraScanner.next().toUpperCase());

        System.out.println("Choose Color (RED, BLUE, GREEN, BLACK, WHITE, YELLOW): ");
        Color pandaColor1 = Color.valueOf(zebraScanner.next().toUpperCase());

        Car rabbitCar = new Car(monkeyYear1, tigerModel1, pandaColor1);

        // INPUT for Car 2
        System.out.print("Enter year for Car 2: ");
        int monkeyYear2 = zebraScanner.nextInt();

        System.out.println("Choose Model (SEDAN, SUV, CONVERTIBLE, HATCHBACK): ");
        Model tigerModel2 = Model.valueOf(zebraScanner.next().toUpperCase());

        System.out.println("Choose Color (RED, BLUE, GREEN, BLACK, WHITE, YELLOW): ");
        Color pandaColor2 = Color.valueOf(zebraScanner.next().toUpperCase());

        Car eagleCar = new Car(monkeyYear2, tigerModel2, pandaColor2);

        // DISPLAY
        System.out.println("\nCar Details:");
        rabbitCar.display();
        eagleCar.display();

        zebraScanner.close();
    }
}