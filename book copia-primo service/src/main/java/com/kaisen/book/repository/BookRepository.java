package com.kaisen.book.repository;

import com.kaisen.book.model.Book;
import com.kaisen.book.model.BookReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    List<BookReport> bookReport();

    List<BookReport> bookAuthor(String id);

}
