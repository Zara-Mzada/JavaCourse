package Lesson10;

import java.time.LocalDate;

public class FoodProduct2 extends Product2{
    public LocalDate expirationDate;

    public FoodProduct2(String productName, LocalDate expirationDate){
        super(productName);
        this.expirationDate = expirationDate;
    }

    public void printInfo(){
        System.out.println("Name: " + productName + " " +
                "Expiration date: " + expirationDate);
    }
}
