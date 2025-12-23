package Lesson11;

public class Archer extends Characterr{
    public double accuracy;

    public Archer(String name, double baseDamage,
                  double accuracy) {
        super(name, baseDamage);
        this.accuracy = accuracy;
    }

    @Override
    public double totalDamage() {
        return baseDamage + (accuracy*1.2);
    }
}
