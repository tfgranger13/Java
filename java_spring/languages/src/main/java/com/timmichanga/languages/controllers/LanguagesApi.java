package com.timmichanga.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timmichanga.languages.models.Language;
import com.timmichanga.languages.services.LanguageService;

@RestController
public class LanguagesApi {
	
	// we are using the Language Service and that it will not be changing
	private final LanguageService languageService;
    public LanguagesApi(LanguageService languageService){
        this.languageService = languageService;
    }
    
    @RequestMapping("/api/languages")
    public List<Language> index() {
        return languageService.allLanguages();
    }
    
    @RequestMapping(value="/api/languages", method=RequestMethod.POST)
    public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
    	Language language = new Language(name, creator, currentVersion);
        return languageService.createLanguage(language);
    }
    
    @RequestMapping("/api/languages/{id}")
    public Language show(@PathVariable("id") Long id) {
    	Language language = languageService.findLanguage(id);
        return language;
    }
    
    // delete mapping annotation to delete
    @DeleteMapping("/api/languages/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	this.languageService.deleteLanguage(id);
    }
    
    // put method to update
    @RequestMapping(value="/api/languages/update/{id}", method=RequestMethod.PUT)
    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
    	
    	// find the language
    	Language l = this.languageService.findLanguage(id);
    	
    	// update object
    	l.setName(name);
    	l.setCreator(creator);
    	l.setCurrentVersion(currentVersion);
    	
    	// send the updated object to service to update database
    	return this.languageService.updateLanguage(l);
    }
    
    
    
}
