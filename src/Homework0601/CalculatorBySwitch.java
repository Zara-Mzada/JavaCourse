package Homework0601;

public class CalculatorBySwitch {

    public static Integer calculation(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("This operation doesn't exist");
                break;
        }
        return 0;
    }
}
