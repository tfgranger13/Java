package com.timmichanga.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.timmichanga.languages.models.Language;
import com.timmichanga.languages.repositories.LanguageRepository;

// allows Spring to inject this class as a dependency in any controller
@Service
public class LanguageService {
	// adding the language repository as a dependency
    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    
    // returns all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a language
    public Language createLanguage(Language l) {
        return languageRepository.save(l);
    }
    // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
    // deletes a language
    public void deleteLanguage(Long id) {
    	this.languageRepository.deleteById(id);
    }
    
    // updates a language
    public Language updateLanguage(Language l) {
    	return this.languageRepository.save(l);
    } 
}
