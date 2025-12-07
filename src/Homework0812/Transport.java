package Homework0812;

public class Transport {
    public int speed;

    public void calculateTime(int distance){
        speed = 50;
        System.out.println("Time: " + (distance/speed));
    }
}
