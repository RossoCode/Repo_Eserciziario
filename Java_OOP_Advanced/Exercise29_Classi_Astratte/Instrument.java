package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public abstract class Instrument implements Playable {
    String name;
    String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
