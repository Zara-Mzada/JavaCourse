package Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private String model;
    private int capacity;
    private Color color;
    private double price;
    private int releaseDate;

    public Model(String model,
                 int capacity,
                 Color color,
                 double price,
                 int releaseDate){
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Model: '" + model + "  "+
                "Capacity: " + capacity + "  " +
                "Color: " + color + "  " +
                "Price: " + price + "  " +
                "Release date: " + releaseDate;
    }

    public static void main(String[] args) {
        Model m1  = new Model("iPhone 17 Pro", 256, Color.WHITE, 5600, 2025);
        Model m2  = new Model("iPhone 17 Pro", 512, Color.BLACK, 6200, 2025);
        Model m3  = new Model("iPhone 16 Pro", 256, Color.MIDNIGHT, 5100, 2024);
        Model m4  = new Model("iPhone 16", 128, Color.PINK, 4300, 2024);

        Model m5  = new Model("Samsung Galaxy S25 Ultra", 512, Color.BLACK, 5400, 2025);
        Model m6  = new Model("Samsung Galaxy S24", 256, Color.WHITE, 4600, 2024);
        Model m7  = new Model("Samsung Galaxy Z Fold 6", 512, Color.MIDNIGHT, 7200, 2025);

        Model m8  = new Model("Google Pixel 9 Pro", 256, Color.BLACK, 4800, 2024);
        Model m9  = new Model("Google Pixel 8", 128, Color.WHITE, 3900, 2023);

        Model m10 = new Model("Xiaomi 14 Pro", 512, Color.GOLD, 4100, 2024);
        Model m11 = new Model("Xiaomi Redmi Note 13", 256, Color.SILVER, 2300, 2024);

        Model m12 = new Model("OnePlus 13", 256, Color.BLACK, 4500, 2025);
        Model m13 = new Model("OnePlus Nord 4", 128, Color.MIDNIGHT, 2800, 2024);

        Model m14 = new Model("Huawei P70 Pro", 512, Color.WHITE, 5000, 2025);
        Model m15 = new Model("Sony Xperia 1 VI", 256, Color.BLACK, 4700, 2024);



        Marka iphone = new Marka("Iphone", new ArrayList<>(Arrays.asList(m1, m2, m3, m4)));
        Marka samsung = new Marka("Samsung", new ArrayList<>(Arrays.asList(m5, m6, m7)));
        Marka google = new Marka("Google", new ArrayList<>(Arrays.asList(m8, m9)));
        Marka xiaomi = new Marka("Xiaomi", new ArrayList<>(Arrays.asList(m10, m11)));
        Marka onePlus = new Marka("OnePlus", new ArrayList<>(Arrays.asList(m13, m12)));
        Marka huawei = new Marka("Huawei", new ArrayList<>(List.of(m14)));
        Marka sony = new Marka("Sony", new ArrayList<>(List.of(m15)));

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);
        System.out.println(xiaomi);
        System.out.println(onePlus);
        System.out.println(huawei);
        System.out.println(sony);
    }

}
