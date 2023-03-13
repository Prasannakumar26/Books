package com.goodreads.GoodReadsH2Database.BookController;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.goodreads.GoodReadsH2Database.BookModel.Book;
import com.goodreads.GoodReadsH2Database.BookService.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
    @PostMapping()
	public Book saveEmployee(@RequestBody()Book book) {
		Book bk1 = bookService.addBook(book);
		return bk1;
	}
    @GetMapping()
    public ArrayList<Book>getAllEmployee() {
    	ArrayList<Book> bk1 = bookService.getAllBook();
    	return bk1;
    }
    @PutMapping()
    public Book updateEmploye(@RequestBody Book book) {
    	Book bk1 = bookService.updateBook(book);
    	return bk1;
    	
    }
    @GetMapping("/{bookId}")
    public Book getEmployeeById(@PathVariable("{bookId}")int bookId) {
    	Book bk1 = bookService.getBookById(bookId);
    	return bk1;
    }
	public void deleteEmployee(int bookId) {
		bookService.deleteBook(bookId);
	}
	
}