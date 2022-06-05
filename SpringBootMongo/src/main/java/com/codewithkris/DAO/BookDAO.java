package com.codewithkris.DAO;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codewithkris.Entity.Book;
import com.codewithkris.Entity.BookUpdatePayLoad;

@Component
public class BookDAO {
	
	@Autowired
	private BookRepository repository;
	
	public Collection<Book> getBooks(){
		return repository.findAll();
	}

	public Book createBook(Book book) {
		return repository.insert(book);
	}

	public Optional<Book> getBookById(int id) {
		return repository.findById(id);
	}
	
	public Optional<Book> deleteBookById(int id) {
		Optional<Book> book = repository.findById(id);
		book.ifPresent(b -> repository.delete(b));
		return book;
	}

	public Optional<Book> updateBookById(int id, BookUpdatePayLoad bookUpdatePayLoad) {
		Optional<Book> book = repository.findById(id);
		book.ifPresent(b -> b.setTitle(bookUpdatePayLoad.getTitle()));
		book.ifPresent(b -> b.setAuthor(bookUpdatePayLoad.getAuthor()));
		book.ifPresent(b -> repository.save(b));
		return book;
	}
}
