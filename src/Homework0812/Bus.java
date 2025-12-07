package Homework0812;

public class Bus extends Transport{
    public int speed = 50;

    public void calculateTime(int distance){
        System.out.println("Time for bus: " + (distance/speed));
    }
}
