package Lesson11;

public class Warrior extends Characterr{
    public double strength;

    public Warrior(String name, double baseDamage,
                   double strength){
        super(name, baseDamage);
        this.strength = strength;
    }

    @Override
    public double totalDamage() {
        return baseDamage + (strength*2);
    }
}
