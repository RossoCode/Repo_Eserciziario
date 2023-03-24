package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public abstract class Shape {
    double height;
    double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public abstract double calculateArea();

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
