package Lesson19;

public class Task<T> {
    public T username;

    public T getUsername() {
        return username;
    }

    public static void main(String[] args) {
        Task<String> t1 = new Task<>();
        System.out.println(t1.getUsername());
    }
}
