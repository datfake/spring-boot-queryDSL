package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.model.BookRequest;
import com.datngo.querydsl.repository.AuthorRepository;
import com.datngo.querydsl.repository.BookRepository;
import com.datngo.querydsl.repository.StoreRepository;
import com.datngo.querydsl.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class BookService implements IBookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final StoreRepository storeRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        book.setEntryDate(bookRequest.getEntryDate());
        bookRequest.getAuthorIds().forEach(authorId -> {
            Author author = authorRepository.findById(authorId).get();
            author.addBook(book);
            authorRepository.save(author);
        });
        bookRequest.getStoreIds().forEach(storeId -> {
            Store store = storeRepository.findById(storeId).get();
            store.addBook(book);
            storeRepository.save(store);
        });
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
