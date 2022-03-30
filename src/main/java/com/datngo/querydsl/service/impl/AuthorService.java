package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.service.IAuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Author findAuthorById(Long id) {
        return null;
    }

    @Override
    public void deleteAuthorById(Long id) {

    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
