package Lesson13;

public class Main {
    public static void main(String[] args) {
//        Task 1

//        Circle circle = new Circle();
//        circle.setRadius(5);
//        System.out.println(circle.area());
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setSide(8);
//        System.out.println(rectangle.area());



//        Task 2

//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();


//        Task 3

//        Config.printName();


//        Task 4

//        Phone phone = new Phone();
//        phone.start();
//        phone.info();


//        Task 5

//        Employee[] employees = {
//                new Designer(),
//                new Developer(),
//                new HRUtils()
//        };

//        for(int i = 0; i < employees.length; i++){
//            System.out.println(employees[i].getAnnualSalary());
//        }



//        Task 6

//        BankAccount acc1 = new BankAccount(3499);
//        BankAccount acc2 = new SavingsAccount(2300);
//        BankAccount acc3 = new BusinessAccount(4980);
//        BankAccount acc4 = new SavingsAccount(2899);
//        BankAccount acc5 = new BusinessAccount(5600);
//
//        System.out.println(BankAccount.getTotalAccounts());
//
//        acc3.deposit(20);
//        acc3.withdraw(300);
//        System.out.println(acc3.getBalance());



//        Task 7

//        ArrayList<Shape> shapes = new ArrayList<>();
//
//        shapes.add(new Circle(6));
//        shapes.add(new Rectangle(7));
//
//        for(int i = 0; i < shapes.size(); i++){
//            System.out.println(shapes.get(i).area() + "   " + shapes.get(i).perimeter());
//        }


//        Task 8

//        Car car1 = new Car();
//        car1.move();
//
//        Bike bike1 = new Bike();
//        bike1.move();
//
//        Bike bike = new Bike();
//        bike.move();
//
//        System.out.println("Car: " + VehicleStats.carCount + "    Bike: " + VehicleStats.bikeCount);


//        Task 9

        User user1 = new User("zaxhrdm@alik", "vdcyfguh4");

        Authenticator email = new EmailAuth();
        Authenticator phone = new PhoneAuth();

        boolean checkEmail = email.login(user1);
        boolean checkPhone = phone.login(user1);



        if(Security.printResult(checkEmail) || Security.printResult(checkPhone)){
            System.out.println("User name: " + user1.getUsername() + "\n"
            + "Password: " + user1.getPassword() + "\n"
            + "Successfully registered!");
        }
//        Security.printResult(checkEmail);
//        Security.printResult(checkPhone);
    }
}
