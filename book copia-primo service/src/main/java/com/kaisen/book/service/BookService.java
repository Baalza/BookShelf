package com.kaisen.book.service;

import com.kaisen.book.model.Author;
import com.kaisen.book.model.Book;
import com.kaisen.book.model.BookReport;
import jakarta.transaction.Transactional;

import java.util.List;

public interface BookService {
    @Transactional
    Book save(Book book);

    List<Book> findAll();

    List<BookReport> findAllBookAuthor();

    List<BookReport> findAllBookAuthorId(String id);
}
