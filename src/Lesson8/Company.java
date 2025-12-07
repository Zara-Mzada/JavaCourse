package Lesson8;

public class Company {
    String name;
    Employee employee;

    public Company(String name, Employee employee){
        this.name = name;
        this.employee = employee;
    }

    public void printCompany(){
        System.out.println("Company: " + name + " Employee:" + employee);
    }
}
