package com.datngo.querydsl.controller;

import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.model.BookRequest;
import com.datngo.querydsl.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")
@AllArgsConstructor
public class BookController {
    private final IBookService bookService;

    @GetMapping
    public ResponseEntity getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        if (null != books) return new ResponseEntity<>(books, HttpStatus.OK);
        else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
    }

    @PostMapping
    public ResponseEntity addBook(@RequestBody BookRequest bookRequest) {
        Book book = bookService.addBook(bookRequest);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getBook(@PathVariable("id") Long id) {
        Book book = bookService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
