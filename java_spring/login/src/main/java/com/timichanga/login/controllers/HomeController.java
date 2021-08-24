package com.timichanga.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.timichanga.login.models.LoginUser;
import com.timichanga.login.models.User;
import com.timichanga.login.services.UserService;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String home(Model model, HttpSession session, RedirectAttributes redirectAttributes ) {
    	// get user from session, save them in a model
    	Long loginId = (Long)session.getAttribute("user_id");
    	
    	if (loginId == null) {
    		redirectAttributes.addFlashAttribute("notLoggedIn", "You must be logged in to view that page");
    		return "redirect:/";
    	}
    	
    	User loginUser = this.userServ.findUser(loginId);
    	model.addAttribute("user", loginUser);
    	return "home.jsp";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session){
    	// clear session
    	session.invalidate();
    	return "redirect:/";
    }
    
}
