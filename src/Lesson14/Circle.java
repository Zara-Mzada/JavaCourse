package Lesson14;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public Double area() {
        return 3.14 * radius * radius;
    }
}
