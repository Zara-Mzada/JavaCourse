package Lesson13;

public class Car extends Vehicle{

    public Car(){
        VehicleStats.carCount++;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
