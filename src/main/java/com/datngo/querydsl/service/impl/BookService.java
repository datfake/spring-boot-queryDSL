package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Author;
import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.model.BookRequest;
import com.datngo.querydsl.repository.IAuthorRepository;
import com.datngo.querydsl.repository.IBookRepository;
import com.datngo.querydsl.repository.IBookCustomRepository;
import com.datngo.querydsl.repository.IStoreRepository;
import com.datngo.querydsl.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService implements IBookService {

    private final IBookRepository bookRepository;
    private final IStoreRepository storeRepository;
    private final IAuthorRepository authorRepository;
    private final IBookCustomRepository bookCustomRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookCustomRepository.getAllBooks();
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public Book addBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        book.setEntryDate(bookRequest.getEntryDate());
        bookRepository.save(book);
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
        return book;
    }
}
