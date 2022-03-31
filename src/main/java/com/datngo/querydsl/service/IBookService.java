package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    boolean deleteBookById(Long id);
    int deleteAll();
}
