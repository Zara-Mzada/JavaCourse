package Lesson8;

public class CarMark {
    public String mark;
    public CarModel model;

    public CarMark(String mark, CarModel model){
        this.mark = mark;
        this.model = model;
    }

    public void printCar(){
        System.out.println("Mark: " + mark + " Model: " + model);
    }
}
