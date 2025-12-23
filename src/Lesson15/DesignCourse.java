package Lesson15;

public class DesignCourse extends Course implements Certificate{

    public DesignCourse(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Course name: " + getTitle() + " Price: " + getPrice()+
                "Platform: " + PLATFORM);

        if(getPrice() > 2000)
            System.out.println("Premium programming course!");
        else
            System.out.println("Standard programming course.");
    }

    @Override
    public void issueCertificate() {
        System.out.println("You got design course certificate");
    }
}
