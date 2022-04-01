package com.datngo.querydsl.repository;

import com.datngo.querydsl.entity.Book;

import java.util.List;

public interface IBookCustomRepository {
    List<Book> getAllBooks();
}
