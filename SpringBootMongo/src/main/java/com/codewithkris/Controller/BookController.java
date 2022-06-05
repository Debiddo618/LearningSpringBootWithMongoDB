package com.codewithkris.Controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithkris.Entity.Book;
import com.codewithkris.Entity.BookUpdatePayLoad;
import com.codewithkris.Service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public Collection<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@PostMapping()
	public Book postBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping(value="/{id}")
	public Optional<Book> getBookById(@PathVariable("id") int id){
		return bookService.getBookById(id);
	}
	
	@DeleteMapping(value="/{id}")
	public Optional<Book> deleteBookById(@PathVariable("id") int id){
		return bookService.deleteBookById(id);
	}
	
	@PutMapping(value="/{id}")
	public Optional<Book> updateBookById(@PathVariable("id") int id, @RequestBody BookUpdatePayLoad bookUpdatePayLoad){
		return bookService.updateBookById(id,bookUpdatePayLoad);
	}
}
