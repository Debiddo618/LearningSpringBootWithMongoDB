package com.codewithkris.Service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithkris.DAO.BookDAO;
import com.codewithkris.Entity.Book;
import com.codewithkris.Entity.BookUpdatePayLoad;

@Service
public class BookService {
	@Autowired
	private BookDAO bookDAO;
	
	public Collection<Book> getBooks(){
		//Data Access Object
		return bookDAO.getBooks();
	}

	public Book createBook(Book book) {
		return bookDAO.createBook(book);
	}

	public Optional<Book> getBookById(int id) {
		return bookDAO.getBookById(id);
	}

	public Optional<Book> deleteBookById(int id) {
		return bookDAO.deleteBookById(id);
	}

	public Optional<Book> updateBookById(int id, BookUpdatePayLoad bookUpdatePayLoad) {
		return bookDAO.updateBookById(id, bookUpdatePayLoad);
	}
}
