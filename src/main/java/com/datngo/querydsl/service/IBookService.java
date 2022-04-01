package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.model.BookRequest;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void deleteBookById(Long id);
    void deleteAll();
    Book addBook(BookRequest bookRequest);
}
