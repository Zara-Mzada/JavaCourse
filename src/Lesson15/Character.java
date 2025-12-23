package Lesson15;


public class Character {
    private String name;
    private String health;
    public static int totalCharacters;

    public Character(String name, String health){
        this.health = health;
        this.name = name;
        totalCharacters++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public final void displayHealth(){
        System.out.println("Health is good");
    }


}
