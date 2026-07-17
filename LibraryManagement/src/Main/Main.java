package Main;

import java.util.Arrays;

import Repository.BookCopyRepository;
import Repository.BookRepository;
import Repository.BorrowRecordRepository;
import Repository.MemberRepository;
import enums.BookStatus;
import enums.Category;
import enums.MemberType;
import models.Book;
import models.BookCopy;
import models.BorrowRecord;
import models.Member;
import services.BookService;
import services.BorrowService;
import services.LibraryService;
import services.MemberService;

public class Main {

    public static void main(String[] args) {

        // Repositories
        BookRepository bookRepository = new BookRepository();
        BookCopyRepository bookCopyRepository = new BookCopyRepository();
        MemberRepository memberRepository = new MemberRepository();
        BorrowRecordRepository borrowRecordRepository = new BorrowRecordRepository();

        // Services
        BookService bookService = new BookService(bookRepository, bookCopyRepository);
        MemberService memberService = new MemberService(memberRepository);
        BorrowService borrowService =
                new BorrowService(bookService, memberService, borrowRecordRepository);

        LibraryService libraryService =
                new LibraryService(bookService, memberService, borrowService);

        // Books
        Book cleanCode = new Book(
                1,
                "Clean Code",
                Arrays.asList("Robert C. Martin"),
                Category.PROGRAMMING,
                599.0);

        libraryService.addBook(cleanCode);

        // Book Copies
        BookCopy copy1 = new BookCopy(
                101,
                cleanCode,
                BookStatus.AVAILABLE,
                "A-1");

        BookCopy copy2 = new BookCopy(
                102,
                cleanCode,
                BookStatus.AVAILABLE,
                "A-2");

        bookService.addBookCopy(copy1);
        bookService.addBookCopy(copy2);

        // Members
        Member madhu = new Member(
                1,
                "Madhu",
                "madhu@gmail.com",
                "9876543210",
                MemberType.STUDENT);

        libraryService.addMember(madhu);

        // Borrow Book
        BorrowRecord record = libraryService.borrowBook(1, 1);

        System.out.println("Book Borrowed Successfully!");
        System.out.println(record);

        // Return Book
        libraryService.returnBook(record.getBookCopy().getCopyId());

        System.out.println("\nBook Returned Successfully!");

        System.out.println("\nBook Copy Status : "
                + record.getBookCopy().getStatus());
    }
}