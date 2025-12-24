package Lesson18;

import java.util.Arrays;

public class Student <T, I>{
    //ad, soyad, yas, prog[]

    public T name;
    public T surname;
    public I age;
    public T[] programmingLanguage;

    public Student(T name,
                   T surname,
                   I age,
                   T[] programmingLanguage){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name = " + name +
                ", surname = " + surname +
                ", age = " + age +
                ", programmingLanguage = " + Arrays.toString(programmingLanguage);
    }

    public static void main(String[] args) {

//        String[] langs = {"Javascript", "Java"};

        Student<String, Integer> student = new Student<>("Zahra", "Malikzada", 21, new String[]{"Javascript", "Java"});

        System.out.println(student);
    }
}
