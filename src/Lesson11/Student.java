package Lesson11;

public class Student {
    public String name;
    public int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public double average(){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
        }

        return sum/(marks.length);
    }
}
