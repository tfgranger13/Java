package com.timmichanga.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.timmichanga.languages.models.Language;
import com.timmichanga.languages.services.LanguageService;

import java.util.List;

import javax.validation.Valid;

@Controller
public class LanguagesController {
	
	private final LanguageService languageService;
	    
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
	
    @RequestMapping("/languages")
    public String indexLanguages(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
	
    @RequestMapping("/languages/new")
    public String newLanguage(@ModelAttribute("language") Language language) {
        return "/languages/new.jsp";
    }
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/new.jsp";
        }
        else {
        	languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    
    // show a language
    @RequestMapping("/languages/{id}/show")
    public String show(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
    	return "/languages/show.jsp";
    }
    
    // edit a language
    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	// OK to render a page on POST b/c it is being validated and we don't want to lose the info they submitted
            return "/languages/edit.jsp";
        }
        else {
        	languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    
    // delete a language
    @RequestMapping("/languages/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
    	languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
    
}
