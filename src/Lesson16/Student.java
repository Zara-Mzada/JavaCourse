package Lesson16;

import java.time.LocalDate;

public class Student {
    public String name;
    public String surname;
    public int dateOfBirth;

    public Student(String name,
                   String surname,
                   int dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + (LocalDate.now().getYear() -dateOfBirth);
    }
}
