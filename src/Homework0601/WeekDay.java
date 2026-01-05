package Homework0601;

public class WeekDay {

    public static void findDayByNumber(int number) {
        switch (number) {
            case 1:
                System.out.print(WeekDays.MONDAY);
                break;
            case 2:
                System.out.println(WeekDays.TUESDAY);
                break;
            case 3:
                System.out.println(WeekDays.WEDNESDAY);
                break;
            case 4:
                System.out.println(WeekDays.THURSDAY);
                break;
            case 5:
                System.out.println(WeekDays.FRIDAY);
                break;
            case 6:
                System.out.println(WeekDays.SATURDAY);
                break;
            case 7:
                System.out.println(WeekDays.SUNDAY);
                break;
            default:
                System.out.println("This day doesn't exist");
                break;
        }
    }
}
