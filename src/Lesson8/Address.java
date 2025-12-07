package Lesson8;

public class Address {

    String city;
    String street;

    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return city + ", " + street;
    }
}
