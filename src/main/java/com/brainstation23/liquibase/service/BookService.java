package com.brainstation23.liquibase.service;

import com.brainstation23.liquibase.entity.Book;
import com.brainstation23.liquibase.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return StreamSupport.stream(bookRepository.findAll().spliterator(), true).collect(Collectors.toList());
    }
}
