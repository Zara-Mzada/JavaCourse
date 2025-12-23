package Lesson11;

public class Characterr {
    public String name;
    public double baseDamage;

    public Characterr(String name, double baseDamage){
        this.baseDamage = baseDamage;
        this.name = name;
    }

    public double totalDamage(){
        return baseDamage;
    }
}
