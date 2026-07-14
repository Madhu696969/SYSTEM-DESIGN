package models;

import enums.BookStatus;

public class BookCopy {
    private final int copyId;
    private final Book book;
    private BookStatus status;
    private String rackNumber;
    public BookCopy(int copyId, Book book,
                    BookStatus status, String rackNumber) {

        this.copyId=copyId;
        this.book=book;
        this.status=status;
        this.rackNumber=rackNumber;
    }

    public int getCopyId() {
        return copyId;
    }

    public Book getBook() {
        return book;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }

    @Override
    public String toString() {
        return "BookCopy{" +
                "copyId=" + copyId +
                ", status=" + status +
                ", rackNumber='" + rackNumber + '\'' +
                '}';
    }
}