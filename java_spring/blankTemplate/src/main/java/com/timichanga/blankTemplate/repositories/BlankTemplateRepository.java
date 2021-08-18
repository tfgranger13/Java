package com.timichanga.blankTemplate.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.timichanga.blankTemplate.models.BlankTemplate;

// this repository interface allows us to interact with the spring data jpa
@Repository
public interface BlankTemplateRepository extends CrudRepository<BlankTemplate, Long>{
	// this method retrieves all the books from the database
    List<BlankTemplate> findAll();
    // this method finds books with descriptions containing the search string
    List<BlankTemplate> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
