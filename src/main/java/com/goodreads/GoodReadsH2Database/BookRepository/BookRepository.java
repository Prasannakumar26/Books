package com.goodreads.GoodReadsH2Database.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodreads.GoodReadsH2Database.BookModel.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
  

}
