package Lesson11;

public class CollegeStudent extends Student{
    public int projectScore;

    public CollegeStudent(String name, int[] marks,
                          int projectScore) {
        super(name, marks);
        this.projectScore = projectScore;
    }

    @Override
    public double average() {
        return super.average()+(projectScore*0.1);
    }
}
