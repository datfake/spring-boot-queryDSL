package com.datngo.querydsl.controller;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.model.AuthorRequest;
import com.datngo.querydsl.service.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/author")
@AllArgsConstructor
public class AuthorController {

    private final IAuthorService authorService;

    @GetMapping
    public ResponseEntity getAllAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        if (null != authors) return new ResponseEntity<>(authors, HttpStatus.OK);
        else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
    }

    @PostMapping
    public ResponseEntity addAuthor(@RequestBody AuthorRequest authorRequest) {
        Author author = new Author();
        author.setName(authorRequest.getName());
        authorService.addAuthor(author);
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getAuthor(@PathVariable("id") Long id) {
        Author author = authorService.findAuthorById(id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
