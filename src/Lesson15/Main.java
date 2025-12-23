package Lesson15;

public class Main {
    public static void main(String[] args) {

//        PayPalProcessor pay1 = new PayPalProcessor();
//        pay1.process(45);
//
//        CreditCardProcessor credit1 = new CreditCardProcessor();
//        credit1.process(78);



//        User user = new User("zahra@gamail.com", "239jf");
//        UserLogger logger = new UserLogger();
//        UserService service = new UserService(logger);
//        service.createUser(user);
//        service.deleteUser(user);
//        logger.loginUser("User created and deleted");


//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(new Rectangle(4, 7));
//        shapes.add(new Triangle(3, 8));
//        shapes.add(new Circle(4));
//
//
//        AreaCalculator calc = new AreaCalculator();
//        System.out.println(calc.totalArea(shapes));




//        SmartDevice[] arr = new SmartDevice[]{
//            new SmartLight(true),
//            new SmartThermostat(false)
//        };
//
//        for(int i = 0; i<arr.length; i++){
//            arr[i].displayStatus();
//        }



//        Book[] arr = new Book[]{
//            new Novel(),
//            new ComicBook(),
//                new Magazine()
//        };
//
//        for(Book book : arr){
//            book.displayInfo();
//        }


//        Character character = new Character("Micky mouse", "good");
//        Character character1 = new Character("Picky", "normal");
//        Character character2 = new Character("Rapunz", "bad");
//
//        System.out.println(Character.totalCharacters);



//        Product[] products = new Product[]{
//                new Clothing(56),
//                new Electronics(34)
//        };
//
//        for(Product product : products){
//            System.out.println(product.getPrice());
//        }



//        Messenger[] messengers = {
//                new Whatsapp(),
//                new Telegram()
//        };
//
//        MessageSender.sendAll(messengers, "Good morning!");



        ProgrammingCourse c1 = new ProgrammingCourse("Backend", 3400);
        DesignCourse c2 = new DesignCourse("UI/UX" , 2300);
        ProgrammingCourse c3 = new ProgrammingCourse("Frotnend", 1500);
//        c1.displayInfo();
//        c1.issueCertificate();
//        c2.displayInfo();
//        c2.issueCertificate();
//        c3.displayInfo();
//        c3.issueCertificate();

        Course[] courses = {
            c1, c2, c3
        };

       for(Course course : courses){
           course.displayInfo();
       }

        System.out.println(Course.getTotalCourses());

    }
}
