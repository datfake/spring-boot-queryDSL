package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.repository.AuthorRepository;
import com.datngo.querydsl.service.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService implements IAuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.findById(id);
    }

    @Override
    public void deleteAll() {
        authorRepository.deleteAll();
    }
}
