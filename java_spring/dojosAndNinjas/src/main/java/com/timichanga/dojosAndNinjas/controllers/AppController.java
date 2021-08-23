package com.timichanga.dojosAndNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.timichanga.dojosAndNinjas.models.Dojo;
import com.timichanga.dojosAndNinjas.models.Ninja;
import com.timichanga.dojosAndNinjas.services.AppService;
@Controller
public class AppController {

	// let the controller know about the services
	private final AppService appService;
    
	// initialize controller
    public AppController(AppService appService) {
        this.appService = appService;
    }
	
    @RequestMapping("/dojos")
    public String indexDojos(Model model, @ModelAttribute("dojo") Dojo dojo) {
        List<Dojo> dojos = appService.allDojos();
        // model to pass information to template
        model.addAttribute("dojos", dojos);
        return "/dojos.jsp";
    }
    
    @RequestMapping("/dojos/{id}")
    public String dojoInfo(Model model, @PathVariable("id")Long id) {
        Dojo d = appService.dojoInfo(id);
        // model to pass information to template
        model.addAttribute("dojo", d);
        return "/showdojo.jsp";
    }
    
    @RequestMapping(value="/newdojo", method=RequestMethod.POST)
    // model attribute to create an empty object to store the form data
    public String createNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	List<Dojo> dojos = appService.allDojos();
            // model to pass information to template
            model.addAttribute("dojos", dojos);
            return "/dojos.jsp";
        }
        else {
        	appService.createDojo(dojo);
            return "redirect:/dojos";
        }
    }
    
    @RequestMapping("/ninjas/new")
    public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
    	List<Dojo> dojos = this.appService.allDojos();
        model.addAttribute("dojos", dojos);
        return "/ninjas.jsp";
    }
    
    @RequestMapping(value="/newninja", method=RequestMethod.POST)
    // model attribute to create an empty object to store the form data
    public String createNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	List<Dojo> dojos = this.appService.allDojos();
            model.addAttribute("dojos", dojos);
            System.out.println("Something is wrong");
            System.out.println(result);
            return "/ninjas.jsp";
        }
        else {
        	System.out.println("This is working");
        	appService.createNinja(ninja);
            return "redirect:/dojos";
        }
    }
}
