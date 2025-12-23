package Lesson11;

public class SmartDevice {

    public String name;
    public int powerUsage;

    public SmartDevice(String name, int powerUsage){
        this.name = name;
        this.powerUsage = powerUsage;
    }

    public double calculateDailyCost(){
        return powerUsage*0.2;
    }
}
