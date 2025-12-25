package Lesson19;

import java.util.Arrays;

public class Mark {
    public String name;
    public Phone[] phones;

    public Mark(String name,
                Phone[] phones){
        this.name = name;
        this.phones = phones;
    }


    @Override
    public String toString() {
        return "Marka: " + name + "\n"+
                "Phones: " + Arrays.toString(phones);
    }

    public static void main(String[] args) {
       Phone iphone15 = new Phone("Iphone 15", 2022, Color.WHITE, 256);
       Phone iphone16 = new Phone("Iphone 16", 2023, Color.MIDNIGHT, 128);
       Phone iphone17 = new Phone("Iphone 17", 2025, Color.ORANGE, 256);

       Phone[] phones = {iphone15, iphone16, iphone17};

       Mark apple = new Mark("Apple", phones);
        System.out.println(apple);
    }
}
