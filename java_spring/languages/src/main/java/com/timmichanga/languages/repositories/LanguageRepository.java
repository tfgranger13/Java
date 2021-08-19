package com.timmichanga.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.timmichanga.languages.models.Language;


// gain access to data once we start talking with the database
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	// this method retrieves all the languages from the database
    List<Language> findAll();
    
    // this method finds languages with creators containing the search string
    List<Language> findByCreatorContaining(String search);
    
    // this method counts how many versions contain a certain string
    Long countByCurrentVersionContaining(String search);
    
    // this method deletes a language that starts with a specific version
    Long deleteByCurrentVersionStartingWith(String search);
}
