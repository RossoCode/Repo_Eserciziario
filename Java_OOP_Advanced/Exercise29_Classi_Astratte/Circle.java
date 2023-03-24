package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        super(radius,radius);
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getHeight()/ 2), 2); // height = radius;
    }


}
