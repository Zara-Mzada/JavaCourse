package Lesson15;

public class SmartThermostat implements SmartDevice{

    private boolean isOn;

    public SmartThermostat(boolean isOn){
        this.isOn = isOn;
    }


    @Override
    public Boolean turnOn() {
        if(isOn){
            return true;
        }
        return false;
    }

    @Override
    public Boolean turnOff() {
        if(!isOn){
            return true;
        }
        return false;
    }

    public void displayStatus(){
        if(turnOff()){
            System.out.println("Smart Thermostat is off");
        }
        else if(turnOn()){
            System.out.println("Smart Thermostat is on");
        }
    }
}
