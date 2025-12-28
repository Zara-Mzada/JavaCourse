package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String surname;
    public int age;
    private final ArrayList<Student> students = new ArrayList<>();

    public Student(String name,
                   String surname,
                   int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student() {
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> filterByAge(int limitAge){
        ArrayList<Student> limitStudents = new ArrayList<>();
        for(Student student : students){
            if(student.age >= limitAge){
                limitStudents.add(student);
            }
        }
        return limitStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", students=" + students +
                '}';
    }

    public static void main(String[] args) {

        Student student = new Student();

        Student s1 = new Student("Zahra", "Malikzada", 21);
        Student s2 = new Student("Madina", "Aliyeva", 24);
        Student s3 = new Student("Hikmat", "Mammadli", 20);
        Student s4 = new Student("Zamin", "Mammadli", 16);

        student.addStudent(s1);
        student.addStudent(s2);
        student.addStudent(s3);
        student.addStudent(s4);


//        student.removeStudent(s2);

//        System.out.println(student.getStudents().toString());

        System.out.println(student.filterByAge(21));
        System.out.println(student.filterByAge(18));
    }
}
