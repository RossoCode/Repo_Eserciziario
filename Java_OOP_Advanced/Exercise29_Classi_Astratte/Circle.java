package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Circle extends Shape{
    double radius;

    public Circle(double height) {
        super();
        radius = height;
    }
    public double getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getRadius() / 2), 2);
    }


}
