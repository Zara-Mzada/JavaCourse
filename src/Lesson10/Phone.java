package Lesson10;

public class Phone extends Device{
    public String model;

    public Phone(String brand, String model){
        super(brand);
        this.model = model;
    }

    @Override
    public void info() {
        System.out.println("Your phone brand is " + brand + " Model: " + model);
    }
}
