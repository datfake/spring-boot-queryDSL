package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthors();
    Author findAuthorById(Long id);
    boolean deleteAuthorById(Long id);
    int deleteAll();
}
