package Java_OOP_Advanced.Exercise28_Ereditarietà;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog1 = new Dog(65, 35.0 , "Pastore Tedesco");
        System.out.println("Razza: " + dog1.breed + "\nAltezza: " + dog1.getHeight()+ "\nPeso: " + dog1.getWeight() );

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish = new Fish(15, 5, "Pesce Rosso");
        Bird bird = new Bird(25, 5, 15);
        System.out.println("Specie: " +fish.species + "\nAltezza: " + fish.getHeight()+ "\nPeso: " + fish.getWeight());
        System.out.println();
        System.out.println("Apertura alare: " + bird.wingSpan + "\nAltezza: " + bird.getHeight()+ "\nPeso: " + bird.getWeight());
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog = new Dog(65, 35.0 , "Pastore Tedesco");
        Fish fish = new Fish(15, 5, "Pesce Rosso");
        Bird bird = new Bird(25, 5, 15);
        List<Double> speed = new ArrayList<>();
        speed.add(dog.runSpeedMetersPerSecond());
        speed.add(fish.swimSpeedMetersPerSecond());
        speed.add(bird.flySpeedMetersPerSecond());

        double maxSpeed = Double.MIN_VALUE;

        for (int i = 0; i < speed.size(); i++) {
            maxSpeed = Math.max(maxSpeed, speed.get(i));
        }
        if (maxSpeed == dog.runSpeedMetersPerSecond()){
            System.out.println("il cane è l'animale piu veloce");
        } else if (maxSpeed == fish.swimSpeedMetersPerSecond()){
            System.out.println("il pesce è l'animale piu veloce");
        } else if (maxSpeed == bird.flySpeedMetersPerSecond()){
            System.out.println("L'uccello è l'animale piu veloce");
        }
        /* Alternativa
        if (dog.runSpeedMetersPerSecond() > fish.swimSpeedMetersPerSecond() && dog.runSpeedMetersPerSecond() > bird.flySpeedMetersPerSecond()){
            System.out.println("il cane è l'animale piu veloce");
        } else if (fish.swimSpeedMetersPerSecond() > bird.flySpeedMetersPerSecond() && fish.swimSpeedMetersPerSecond() > dog.runSpeedMetersPerSecond()){
            System.out.println("il pesce è l'animale piu veloce");
        } else if (bird.flySpeedMetersPerSecond() > dog.runSpeedMetersPerSecond() && bird.flySpeedMetersPerSecond() > fish.swimSpeedMetersPerSecond()){
            System.out.println("L'uccello è l'animale piu veloce");
        }
        */
}
}
