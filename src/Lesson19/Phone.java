package Lesson19;

public class Phone {
    public String model;
    public int productionYear;
    public Color color;
    public int capacity;

    public Phone(String model, int productionYear,
             Color color, int capacity){

        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  "{ " + model + ", " + productionYear + ", " + color + ", " + capacity + " }";
    }

}
