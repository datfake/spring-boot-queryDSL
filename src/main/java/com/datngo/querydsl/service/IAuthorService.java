package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthors();
    Author findAuthorById(Long id);
    void deleteAuthorById(Long id);
    void deleteAll();
    Author addAuthor(Author author);
}
