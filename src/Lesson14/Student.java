package Lesson14;

public class Student {
    private String name;
    private final String university = "ADNSU";
    private static int count;

    public Student(String name){
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public static int getCount() {
        return count;
    }
}
