package com.brainstation23.liquibase.controller;

import com.brainstation23.liquibase.entity.Author;
import com.brainstation23.liquibase.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("list")
    public List<Author> getAuthors(){
        return authorService.getAllAuthors();
    }
}
