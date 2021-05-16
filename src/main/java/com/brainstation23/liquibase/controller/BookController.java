package com.brainstation23.liquibase.controller;

import com.brainstation23.liquibase.entity.Author;
import com.brainstation23.liquibase.entity.Book;
import com.brainstation23.liquibase.service.AuthorService;
import com.brainstation23.liquibase.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("list")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }
}
