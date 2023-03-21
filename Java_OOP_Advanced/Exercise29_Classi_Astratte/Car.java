package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("La Macchina si muove avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("La Macchina si muove indietro");
    }
}
