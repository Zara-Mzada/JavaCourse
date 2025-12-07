package Lesson10;

public class Car2 extends Vehicle2{
    public int maxSpeed;

    public Car2(String brand, int maxSpeed){
        super(brand);
        this.maxSpeed = maxSpeed;
    }

    public void printInfo(){
        System.out.println("Brand: " + brand + " Max speed: " + maxSpeed);
    }
}
