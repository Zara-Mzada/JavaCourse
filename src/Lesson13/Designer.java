package Lesson13;

public class Designer extends Employee{
    @Override
    public double getAnnualSalary() {
        return getSalary()*12+1000;
    }
}
