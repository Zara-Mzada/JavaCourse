package Lesson9;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double area(){
        double areaCircle = radius*radius*3.14;
        return areaCircle;
    }

    public void printCircleInfo(){
        System.out.println("Square radius: " + radius + ", area: " + area());
    }

    @Override
    public void printColor() {
        System.out.println("Color: " + color);
    }
}
