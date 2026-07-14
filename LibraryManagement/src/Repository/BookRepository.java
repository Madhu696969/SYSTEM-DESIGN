package Repository;
import java.util.*;
import models.Book;
import enums.Category;

public class BookRepository {
	private final HashMap<Integer,Book> BookRepo;
	public BookRepository() {
		this.BookRepo=new HashMap<>();
	}
	void add(Book book) {
		BookRepo.put(book.getBookId(),book);
	}
	public Book get(int bookId) {
		Book b=BookRepo.getOrDefault(bookId, null);
		return b;
	}
	public void remove(int bookId) {
		BookRepo.remove(bookId);
	}
	public boolean contains(int bookId) {
		return BookRepo.containsKey(bookId);
	}
	public Collection<Book> getAll() {
		return BookRepo.values();
	}
	public Book findByTitle(String title) {
		for(Book b:BookRepo.values()) {
			if(b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
	}
	public Book findByCategory(Category category) {
		for(Book b:BookRepo.values()) {
			if(b.getCategory().equals(category)) {
				return b;
			}
		}
		return null;
	}
	
}
