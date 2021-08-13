package com.timmichanga.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// rest controller before the class
@RestController
// request mapping class to not retype 'coding'
@RequestMapping("/coding")
public class CodingController {
	// no braces after the mapping
	@RequestMapping("")
	// braces to code block the method for this route
	public String coding() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
}