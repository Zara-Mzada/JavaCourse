package Lesson11;

public class HighSchoolStudent extends Student{
    public int extraCredit;

    public HighSchoolStudent(String name, int[] marks,
                             int extraCredit) {
        super(name, marks);
        this.extraCredit = extraCredit;
    }

    @Override
    public double average() {
        return super.average() + extraCredit;
    }
}
