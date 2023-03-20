package Java_OOP_Advanced.Exercise28_Ereditarietà;

public class Fish extends Animal{
    String species;
    double swimSpeedMetersPerSecond(){
        return getWeight() * 2;
    }
    public Fish(double height, double weight,String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
