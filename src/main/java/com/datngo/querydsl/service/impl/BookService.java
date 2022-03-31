package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.service.IBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public boolean deleteBookById(Long id) {
        return false;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
