package com.timichanga.blankTemplate;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlankTemplateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	// request method post to take the information the user submits
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    // add the session and model to store the information entered and pass it to the results route
    public String submit(HttpSession session, Model model, @RequestParam(value="submitName") String name, @RequestParam(value="submitLocation") String location, @RequestParam(value="submitLanguage") String language) {
    	session.setAttribute("name", name);
    	session.setAttribute("location", location);
    	session.setAttribute("language", language);
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
