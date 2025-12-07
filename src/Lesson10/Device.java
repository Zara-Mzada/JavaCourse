package Lesson10;

public class Device {

    public String brand;

    public Device(String brand){
        this.brand = brand;
    }

    public void info(){
        System.out.println("This is your device wtih brand " + brand);
    }
}
