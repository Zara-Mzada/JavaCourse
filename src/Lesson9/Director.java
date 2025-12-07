package Lesson9;

public class Director extends Manager {
    public double companyBudget;

    public void printDirector(){
        System.out.print("Name: " + name +
                " Salary: " + salary +
                " Bonus: " + bonus +
                " Company budget: " + companyBudget);
    }
}
