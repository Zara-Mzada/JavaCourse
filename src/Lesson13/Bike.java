package Lesson13;

public class Bike extends Vehicle{

    public Bike(){
        VehicleStats.bikeCount++;
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
