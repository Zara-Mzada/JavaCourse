package Lesson27;

public class Human implements Comparable<Human> {
    private String name;
    private int age;
    private double balance;

    public Human(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    /**
     * @param o
     * @return
     */
    @Override
    public int compareTo(Human o) {
        return this.getAge() - o.getAge();
    }
}
