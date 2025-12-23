package Lesson15;

public abstract class Course {
    private String title;
    private double price;
    private static int totalCourses;
    protected static final String PLATFORM = "OnlineAcademy";

    public Course(String title, double price){
        this.price = price;
        this.title = title;
        totalCourses++;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public abstract void displayInfo();
}
