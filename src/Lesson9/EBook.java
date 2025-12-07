package Lesson9;

public class EBook extends Book{
    public String docType;
    public boolean isRead;

    @Override
    public void printBook() {
        System.out.println("Book title: " + title +
                "  Author: " + author +
                "  Published date: " + publishDate +
                "  Page count: " + pageCount +
                "  docType: " + docType +
                "  Read: " + isRead);

    }
}
