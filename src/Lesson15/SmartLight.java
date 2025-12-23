package Lesson15;

public class SmartLight implements SmartDevice{

    private boolean isOn;

    public SmartLight(boolean isOn){
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
            System.out.println("SmartLight is off");
        }
        else if(turnOn()){
            System.out.println("SmartLight is on");
        }
    }
}
