package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Circle extends Shape{

    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }

}
