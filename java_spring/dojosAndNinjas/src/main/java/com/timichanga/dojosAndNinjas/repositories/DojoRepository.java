package com.timichanga.dojosAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.timichanga.dojosAndNinjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    
	// this method retrieves all the Dojos from the database
    List<Dojo> findAll();
   
    // this method finds Dojos with descriptions containing the search string
    List<Dojo> findById(String search);
    
    //save a dojo is built in from crud repository
    
}
