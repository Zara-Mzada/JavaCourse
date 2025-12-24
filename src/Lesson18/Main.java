package Lesson18;

public class Main {
    public static void main(String[] args) {
//      ******* Scanner initialize ********

//        Scanner sc = new Scanner(System.in);
//
//        User user = new User("admin123", "1234admin");
//
//        boolean isFound = false;
//
//        while(!isFound){
//            System.out.print("Enter username: ");
//            String username = sc.next();
//
//            System.out.print("Enter password: ");
//            String password = sc.next();
//
//            if(user.foundUser(username, password)){
//                isFound = true;
//            }
//        }



//        Random rand = new Random();
//        int randomNumber = rand.nextInt(0, 10);

//        System.out.println("Enter number: ");
//        int num = sc.nextInt();

//        boolean isFound = false;
//
//        while(!isFound){
//            System.out.print("Enter number: ");
//            int num = sc.nextInt();
//
//            try{
//                if(randomNumber != num){
//                    throw new WrongNumber();
//                }
//                else{
//                    System.out.println("Winner of the game");
//                    isFound = true;
//                }
//            }catch(WrongNumber e){
//                System.out.println(e.getMessage());
//            }
//
//        }


//        RandomGame game = new RandomGame();
//        game.foundNumber();


        // abstract class, generic class

        StringSubClass st1 = new StringSubClass();
        System.out.println(st1.task1("  Hello world   "));

        IntegerSubClass int1 = new IntegerSubClass();
        System.out.println( int1.task1("    Salam       "));

        BooleanSubClass bool1 = new BooleanSubClass();
        System.out.println(bool1.task1("New line code"));

    }
}
