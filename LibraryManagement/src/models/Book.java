package models;
import java.util.ArrayList;
import java.util.List;
import enums.Category;

public class Book {

    private final int bookId;
    private String title;
    private List<String> authors;
    private Category category;
    private double price;
    private List<BookCopy> copies;
    public Book(int bookId, String title, List<String> authors,
                Category category, double price) {
        this.bookId=bookId;
        this.title=title;
        this.authors=authors;
        this.category=category;
        this.price=price;
        this.copies = new ArrayList<>();
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public List<BookCopy> getCopies() {
        return copies;
    }

    public void addCopy(BookCopy copy) {
        copies.add(copy);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}