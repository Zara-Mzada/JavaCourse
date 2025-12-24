package Homework2512;

public class CheckArray {

    public static String[] countries = {"Azerbaijan", "United Kingdom","United State of America", "Netherland", "Turkey",
                                "Ukraine", "Russia", "Norway", "Switzerland", "Pakistan", "Georgia"};

    public static void checkValue(String country){
        boolean isFound = false;
        for(String c : countries){
            if(c.equals(country)){
                isFound = true;
            }
        }

        try{
            if(isFound){
                System.out.println("Country exist inside array");
            }
            else{
                throw new NotFoundCountry();
            }
        }catch(NotFoundCountry e){
            System.out.println(e.getMessage());
        }
    }

}
