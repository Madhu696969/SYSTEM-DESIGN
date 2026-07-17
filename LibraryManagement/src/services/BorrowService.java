package services;
import Repository.*;
import models.*;
import java.time.*;

public class BorrowService {
	
    private final BookService bookService;
    private final MemberService memberService;
    private final BorrowRecordRepository borrowRecordRepository;
    private static int recordCounter = 1;
  
    public BorrowService(BookService bookService,MemberService memberService,BorrowRecordRepository borrowRecordRepository) {
    	this.bookService=bookService;
    	this.memberService=memberService;
    	this.borrowRecordRepository=borrowRecordRepository;
    }
    public BorrowRecord borrowBook(int memberId, int bookId) {
        Member member = memberService.getMember(memberId);
        if (member == null) {
            throw new RuntimeException("Member not found");
        }
        Book book = bookService.getBook(bookId);
        if (book == null) {
            throw new RuntimeException("Book not found");
        }
        BookCopy copy = bookService.findAvailableCopy(book);
        if (copy == null) {
            throw new RuntimeException("No copies available");
        }

        copy.setStatus(enums.BookStatus.CHECKED_OUT);

        BorrowRecord record = new BorrowRecord(
                recordCounter++,
                member,
                copy,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(15));

        borrowRecordRepository.add(record);

        return record;
    }
    public void returnBook(int copyId) {
        BookCopy copy = bookService.getBookCopy(copyId);
        if (copy == null) {
            throw new RuntimeException("Invalid Copy Id");
        }
        BorrowRecord record =
                borrowRecordRepository.getActiveBorrowByCopy(copy);

        if (record == null) {
            throw new RuntimeException("Book is not currently borrowed");
        }
        record.setReturnDate(LocalDateTime.now());
        copy.setStatus(enums.BookStatus.AVAILABLE);
    }

}
