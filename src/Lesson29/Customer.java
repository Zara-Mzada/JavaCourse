package Lesson29;

import java.util.Map;

public class Customer {
    private String name;
    private double balance;
    private Map<String, Integer> products;

    public Customer(String name, double balance, Map<String, Integer> products) {
        this.name = name;
        this.balance = balance;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }
}
