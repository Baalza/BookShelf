package com.kaisen.book.service;

import com.kaisen.book.model.Author;
import com.kaisen.book.model.Book;

import java.util.List;

public interface AuthorService {
    Author save(Author author);

    List<Author> findAll();


}
