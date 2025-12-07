package Lesson8;

public class Book {
    public String title;
    public double price;
    public Author author;

    public Book(String title, double price, Author author){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void printBookDetail(){
        if(price > 20){
            System.out.println("Book: " + title + " Price: " + price + " Author: " + author.name + " " + author.lastName);
        }
    }
}
