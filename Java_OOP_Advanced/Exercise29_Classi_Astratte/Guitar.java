package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println(getName()+ " " + "Sta suonando...");
    }
}
