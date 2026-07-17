package services;
import models.*;

public class LibraryService {
	private final BookService bookService;
    private final MemberService memberService;
    private final BorrowService borrowService;
    
    public LibraryService(BookService bookService,MemberService memberService,BorrowService borrowService) {
    	this.bookService=bookService;
    	this.memberService=memberService;
    	this.borrowService=borrowService;
    }
    
    public void addMember(Member mem) {
    	memberService.addMember(mem);
    }
    public Member getMember(int memberId){
        return memberService.getMember(memberId);
    }
    public Book getBook(int bookId){
        return bookService.getBook(bookId);
    }
    
    public void addBook(Book book) {
    	bookService.addBook(book);
    }
    
    public BorrowRecord borrowBook(int memId,int bookId) {
    	return borrowService.borrowBook(memId, bookId);
    }
    public void returnBook(int copyId) {
    	borrowService.returnBook(copyId);
    }
}
