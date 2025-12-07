package Homework0812;

public class Train extends Transport{
    public int speed = 90;

    public void calculateTime(int distance){
        System.out.println("Time for train: " + (distance/speed));
    }
}
