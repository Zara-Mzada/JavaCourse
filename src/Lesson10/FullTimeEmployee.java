package Lesson10;

public class FullTimeEmployee extends Employee{
    public double salary;

    public FullTimeEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Name: " + name + " Salary: " + salary);
    }
}
