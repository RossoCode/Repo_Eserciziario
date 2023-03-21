package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("La barca si muove avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("La barca si muove indietro");
    }
}
