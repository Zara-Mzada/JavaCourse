package Homework0812;

public class Bike extends Transport{
    public int speed = 15;

    public void calculateTime(int distance){
        System.out.println("Time for bike: " + (distance/speed));
    }
}
