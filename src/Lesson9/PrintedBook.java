package Lesson9;

public class PrintedBook extends Book{
    public String pageColor;
    public String publisher;

    @Override
    public void printBook() {
        System.out.println("Book title: " + title +
                "  Author: " + author +
                "  Published date: " + publishDate +
                "  Page count: " + pageCount +
                "  Publisher: " + publisher +
                "  Page Color: " + pageColor);
    }
}
