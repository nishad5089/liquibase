package com.brainstation23.liquibase.repository;

import com.brainstation23.liquibase.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
