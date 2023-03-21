package Java_OOP_Advanced.Exercise29_Classi_Astratte;

public class Rectangle extends Shape{
    public Rectangle(double height,double width){
        super(height,width);
    }
    @Override
    public double calculateArea(){
        return getHeight() * getWidth();
    }
}
