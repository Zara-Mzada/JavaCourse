package Lesson11;

public class Clothes extends Product{
    public String season;

    public Clothes(String name, double price, String season) {
        super(name, price);
        this.season = season;
    }

    @Override
    public double finalPrice() {
        if(season.equals("winter")){
            return price*95/100;
        }
        else{
            return super.finalPrice();
        }
    }
}
