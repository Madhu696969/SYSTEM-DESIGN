package services;
import models.*;
import Repository.*;


public class BookService {

    private final BookRepository bookRepository;
    private final BookCopyRepository bookCopyRepository;
    
    public BookService(BookRepository bookRepository,BookCopyRepository bookCopyRepository) {
    		this.bookRepository = bookRepository;
    		this.bookCopyRepository = bookCopyRepository;
    }
    public void addBook(Book book) {
        bookRepository.add(book);
    }
    public Book getBook(int bookId) {
        return bookRepository.get(bookId);
    }
    public void removeBook(int bookId) {
        bookRepository.remove(bookId);
    }
    public boolean containsBook(int bookId) {
        return bookRepository.contains(bookId);
    }
    
    public void addBookCopy(BookCopy bc) {
    	bookCopyRepository.addBookCopy(bc);
    	bc.getBook().addCopy(bc);
    }
    public BookCopy getBookCopy(int cId) {
    	return bookCopyRepository.getBookCopy(cId);
    }
    
    public BookCopy findAvailableCopy(Book book) {
        return bookCopyRepository.findAvailableCopy(book);
    }
}
