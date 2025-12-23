package Lesson11;

public class SmartLight extends SmartDevice{
    public int brightness;

    public SmartLight(String name, int powerUsage, int brightness){
        super(name, powerUsage);
        this.brightness = brightness;
    }

    @Override
    public double calculateDailyCost() {
        return (super.calculateDailyCost() + (brightness*0.01));
    }
}
