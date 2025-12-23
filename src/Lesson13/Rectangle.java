package Lesson13;

public class Rectangle extends Shape{
    private double side;

    public Rectangle(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    //    private double side;
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double area() {
//        return side*side;
//    }
}
