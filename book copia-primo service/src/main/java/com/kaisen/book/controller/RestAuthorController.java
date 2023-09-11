package com.kaisen.book.controller;

import com.kaisen.book.model.Author;
import com.kaisen.book.model.Book;
import com.kaisen.book.model.BookReport;
import com.kaisen.book.repository.AuthorRepository;
import com.kaisen.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestAuthorController {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("restAuthors")
    public List<Author> getAuthors(){
        List<Author> authors = authorRepository.findAll();

        return authors;
    }
    @GetMapping("restBooks-reports")
    public List<BookReport> getBooks(){
        List<BookReport> bookReports = bookRepository.bookReport();

        return bookReports;
    }

    @GetMapping("restBooks-author/{id}")
    public List<BookReport> getAuthorBooks(@PathVariable(value = "id") String id){
        List<BookReport> books = bookRepository.bookAuthor(id);

        return books;
    }

}
