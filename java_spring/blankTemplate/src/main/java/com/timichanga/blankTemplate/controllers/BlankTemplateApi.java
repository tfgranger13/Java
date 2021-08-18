package com.timichanga.blankTemplate.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlankTemplateApi {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	// request method post to take the information the user submits
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    
    // add the session and model to store the information entered and pass it to the results route
    // request param takes the info from the form, the 'String name' after it automatically sets it as part of the model?
    public String submit(HttpSession session, Model model, @RequestParam(value="submitName") String name, @RequestParam(value="submitLocation") String location, @RequestParam(value="submitLanguage") String language) {
    	
    	// session is good for persistent data
    	session.setAttribute("name", name);
    	session.setAttribute("location", location);
    	session.setAttribute("language", language);
    	
    	// model is good for quick data that doesn't need to be stored long term
    	model.addAttribute("name", name);
    	model.addAttribute("location", location);
    	model.addAttribute("language", language);
    	
    	return "redirect:/results";
    }
    @RequestMapping("/results")
    public String results() {
        return "results.jsp";
    }
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        return "redirect:/";
    }
}
