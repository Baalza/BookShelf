package com.kaisen.book.service;

import com.kaisen.book.model.Author;
import com.kaisen.book.model.Book;
import com.kaisen.book.model.BookReport;
import com.kaisen.book.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    @Transactional
    public Book save(Book book){
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<BookReport> findAllBookAuthor() {
        return bookRepository.bookReport();
    }

    @Override
    public List<BookReport> findAllBookAuthorId(String id) {
        return bookRepository.bookAuthor(id);
    }

}
