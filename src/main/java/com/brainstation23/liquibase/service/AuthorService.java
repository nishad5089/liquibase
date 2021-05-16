package com.brainstation23.liquibase.service;

import com.brainstation23.liquibase.entity.Author;
import com.brainstation23.liquibase.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return StreamSupport.stream(authorRepository.findAll().spliterator(), true).collect(Collectors.toList());
    }
}
