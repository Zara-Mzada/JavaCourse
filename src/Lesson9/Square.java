package Lesson9;

public class Square extends Shape{
    public double side;

    public Square(double side, String color){
        this.side = side;
        this.color = color;
    }
    public double area(){
        double areaSquare = side*side;
        return areaSquare;
    }

    public void printSquareInfo(){
        System.out.println("Square side: " + side + ", area: " + area());
    }

    @Override
    public void printColor() {
        System.out.println("Color: " + color);
    }
}
