package Lesson21;

public class StudentAgeInvalidException extends RuntimeException {
    public StudentAgeInvalidException() {
        super("Student age is invalid");
    }
}
