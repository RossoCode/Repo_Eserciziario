package Java_OOP_Advanced.Exercise28_Ereditarietà;

public class Bird extends Animal{
    double wingSpan;
    double flySpeedMetersPerSecond( ){
        return  getWingSpan()* 4;
    }
    public Bird(double height, double weight,double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
