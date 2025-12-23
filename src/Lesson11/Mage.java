package Lesson11;

public class Mage extends Characterr{
    public double mana;

    public Mage(String name, double baseDamage,
                double mana){
        super(name, baseDamage);
        this.mana = mana;
    }

    @Override
    public double totalDamage() {
        return baseDamage + (mana * 1.5);
    }
}
