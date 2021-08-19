package com.timichanga.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguagesApi {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}
