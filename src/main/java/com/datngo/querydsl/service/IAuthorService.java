package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthors();
    Author addAuthor(Author author);
    Author findAuthorById(Long id);
    void deleteAuthorById(Long id);
    void deleteAll();
}
