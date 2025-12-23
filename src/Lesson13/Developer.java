package Lesson13;

public class Developer extends Employee{

    @Override
    public double getAnnualSalary() {
        return getSalary()*12+1000;
    }
}
