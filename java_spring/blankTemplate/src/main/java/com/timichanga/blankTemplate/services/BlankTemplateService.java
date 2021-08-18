package com.timichanga.blankTemplate.services;

import java.util.List;
import java.util.Optional;

import com.timichanga.blankTemplate.models.BlankTemplate;
import com.timichanga.blankTemplate.repositories.BlankTemplateRepository;

// service annotation to allow STS to inject this class as a dependency in any controller (for the repository to access the database)
public class BlankTemplateService {
	
	// adding the language repository as a dependency
    private final BlankTemplateRepository blankTemplateRepository;
    
    public BlankTemplateService(BlankTemplateRepository blankTemplateRepository) {
        this.blankTemplateRepository = blankTemplateRepository;
    }
    // returns all the languages
    public List<BlankTemplate> allBlankTemplates() {
        return blankTemplateRepository.findAll();
    }
    // creates a language
    public BlankTemplate createBlankTemplate(BlankTemplate b) {
        return blankTemplateRepository.save(b);
    }
    // retrieves a language
    public BlankTemplate findBlankTemplate(Long id) {
        Optional<BlankTemplate> optionalBlankTemplate = blankTemplateRepository.findById(id);
        if(optionalBlankTemplate.isPresent()) {
            return optionalBlankTemplate.get();
        } else {
            return null;
        }
    }
}
