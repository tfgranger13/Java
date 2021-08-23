package com.timichanga.practice.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timichanga.practice.models.Practice;


@Controller
public class PracticesController {
	
//	private final PracticeService practiceService;
//	    
//    public PracticesController(PracticeService practiceService) {
//        this.practiceService = practiceService;
//    }
	
    @RequestMapping("/practices")
    public String indexPractices(Model model) {
    	//  as parameter
//        List<Practice> practices = practiceService.allPractices();
//        model.addAttribute("practices", practices);
        return "/practices/index.jsp";
    }
}
