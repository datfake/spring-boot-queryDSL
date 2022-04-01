package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.repository.IAuthorRepository;
import com.datngo.querydsl.service.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService implements IAuthorService {

    private final IAuthorRepository authorRepository;

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
    public void deleteAll() {
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}
