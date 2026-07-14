package models;

import java.time.LocalDateTime;

public class BorrowRecord {

    private final int recordId;
    private final Member member;
    private final BookCopy bookCopy;
    private final LocalDateTime borrowDate;
    private final LocalDateTime dueDate;
    private LocalDateTime returnDate;

    public BorrowRecord(int recordId,
                        Member member,
                        BookCopy bookCopy,
                        LocalDateTime borrowDate,
                        LocalDateTime dueDate) {

        this.recordId = recordId;
        this.member = member;
        this.bookCopy = bookCopy;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public int getRecordId() {
        return recordId;
    }

    public Member getMember() {
        return member;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "recordId=" + recordId +
                ", member=" + member.getName() +
                ", bookCopy=" + bookCopy.getCopyId() +
                '}';
    }
}