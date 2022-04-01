package com.datngo.querydsl.repository.impl;

import com.datngo.querydsl.entity.Book;
import com.datngo.querydsl.entity.QBook;
import com.datngo.querydsl.repository.IBookCustomRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookRepository implements IBookCustomRepository {

    @PersistenceContext
    EntityManager em;

    final static QBook qBook = QBook.book;

    @Override
    public List<Book> getAllBooks() {
        final JPAQuery<Book> jpaQuery = new JPAQuery<>(em);
        jpaQuery.select(qBook)
                .from(qBook);
        return jpaQuery.fetch();
    }
}
