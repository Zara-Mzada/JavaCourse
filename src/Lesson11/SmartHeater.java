package Lesson11;

public class SmartHeater extends SmartDevice{
    public double temperature;

    public SmartHeater(String name, int powerUsage, double temperature){
        super(name, powerUsage);
        this.temperature = temperature;
    }

    @Override
    public double calculateDailyCost() {
        return (super.calculateDailyCost() + (temperature*0.05));
    }
}
