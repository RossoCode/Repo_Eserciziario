package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rect = new Rectangle(15,10);
        Circle circle = new Circle(15,10);
        System.out.println(rect.calculateArea());
        System.out.println(circle.calculateArea());
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car car = new Car();
        Boat boat = new Boat();
        car.moveBackward();
        car.moveForward();
        boat.moveBackward();
        boat.moveForward();

    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Guitar guitar = new Guitar("Gibson SG.", "Yamaha");
        Piano piano = new Piano("fortePiano" ,"Schulze ");
        guitar.play();
        piano.play();
    }
}
