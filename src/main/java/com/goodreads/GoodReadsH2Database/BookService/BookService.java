package com.goodreads.GoodReadsH2Database.BookService;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodreads.GoodReadsH2Database.BookModel.Book;
import com.goodreads.GoodReadsH2Database.BookRepository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public Book addBook(Book book) {
		Book book1 = bookRepository.save(book);
		return book1;
	}
	public Book updateBook(Book book) {
		Book book1 = bookRepository.save(book);
		return book1;
	}
	public ArrayList<Book> getAllBook() {
		Collection<Book> bk = bookRepository.findAll();
		ArrayList<Book> bk1 = new ArrayList<Book>(bk);
		return bk1;
	}
	public Book getBookById (int book) {
        /* Throw exception if user was not found*/
        return bookRepository.findById(book).orElseThrow(IllegalArgumentException::new);
    }
	public void deleteBook(int book) {
                 bookRepository.deleteById(book);
	}
	
	
}