package Repository;
import java.util.*;
import models.BookCopy;
import enums.BookStatus;
import models.Book;

public class BookCopyRepository {
	private final Map<Integer, BookCopy> bookCopies;

    public BookCopyRepository() {
        this.bookCopies = new HashMap<>();
    }

    public void addBookCopy(BookCopy bookCopy) {
        bookCopies.put(bookCopy.getCopyId(), bookCopy);
    }

    public BookCopy getBookCopy(int copyId) {
        return bookCopies.get(copyId);
    }
    public void removeBookCopy(int copyId) {
        bookCopies.remove(copyId);
    }
    public boolean containsBookCopy(int copyId) {
        return bookCopies.containsKey(copyId);
    }
    public List<BookCopy> getAllBookCopies() {
        return new ArrayList<>(bookCopies.values());
    }

    public List<BookCopy> getCopiesByBook(Book book) {
        List<BookCopy> copies = new ArrayList<>();
        for (BookCopy copy : bookCopies.values()) {
            if (copy.getBook().getBookId() == book.getBookId()) {
                copies.add(copy);
            }
        }

        return copies;
    }
    
    public BookCopy findAvailableCopy(Book book){
        for (BookCopy copy : bookCopies.values()){
            if (copy.getBook().getBookId() == book.getBookId()
                    && copy.getStatus() == BookStatus.AVAILABLE) {
                return copy;
            }
        }
        return null;
    }
	
	
	

}
