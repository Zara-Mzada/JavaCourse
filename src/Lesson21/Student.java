package Lesson21;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int age;
    private ArrayList<Student> dataBase = new ArrayList<>();

    public Student(){

    }

    public Student(String name,
                   String surname,
                   int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void addStudent(Student student, int limitedAge){
        try{
            if(student.age > limitedAge){
                dataBase.add(student);
            }
            else{
                throw new StudentAgeInvalidException();
            }
        }catch(StudentAgeInvalidException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(dataBase);
        }
    }

    @Override
    public String toString() {
        return  "name: '" + name + "  " +
                "surname: '" + surname  + "   "+
                "age: " + age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Zahra", "Malikzada", 21);
        Student s2 = new Student("Samir", "Javadzada", 26);
        Student s3 = new Student("Artur", "Aliyev", 19);
        Student s4 = new Student("Sabrina", "Mammadli", 17);
        Student s5 = new Student("Kamal", "Abdurrahmanov", 24);


        Student mainStudent = new Student();

        mainStudent.addStudent(s1,18);
        mainStudent.addStudent(s2,18);
        mainStudent.addStudent(s3,18);
        mainStudent.addStudent(s4,18);
        mainStudent.addStudent(s5, 18);


    }
}


