package Homework2912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int age;
    private List<String> programLanguage;

    private final ArrayList<Student> allStudents = new ArrayList<>();

    public Student(){

    }

    public Student(String name,
                   String surname,
                   int age,
                   List<String> programLanguage){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.programLanguage = programLanguage;
    }

    public void addStudent(Student student){
        allStudents.add(student);
    }

    public List<Student> filterByAge(int limitAge){
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for(Student s : allStudents){
            if(s.age > limitAge){
                filteredStudents.add(s);
            }
        }
        return filteredStudents;
    }


    @Override
    public String toString() {
        return  "name: '" + name + "  " +
                "surname: '" + surname  + "   "+
                "age: " + age + "   " +
                "programming languages: " + programLanguage + "\n";
    }


    public static void main(String[] args) {
        Student s1 = new Student("Zahra", "Malikzada", 21, new ArrayList<>(Arrays.asList("JavaScript", "C#", "Java")));
        Student s2 = new Student("Samir", "Javadzada", 26, new ArrayList<>(Arrays.asList("C++", "C#", "C")));
        Student s3 = new Student("Artur", "Aliyev", 19, new ArrayList<>(Arrays.asList("JavaScript", "React")));
        Student s4 = new Student("Sabrina", "Mammadli", 17, new ArrayList<>(Arrays.asList("HTML", "CSS", "JavaScript")));

        Student mainStudent = new Student();
        mainStudent.addStudent(s1);
        mainStudent.addStudent(s2);
        mainStudent.addStudent(s3);
        mainStudent.addStudent(s4);

        System.out.println(mainStudent.filterByAge(18));

    }
}
