package com.timmichanga.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//1. Annotation
@RestController

public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	
	// 1. Annotation
	@RequestMapping("/")
    // 3. Method that maps to the request route above
    public String greet() { // 3
            return "Hello client, how are you doing?";
    }
	@RequestMapping("/random")
    // 3. Method that maps to the request route above
    public String random() { // 3
            return "Spring Boot is great! So easy to just respond with strings.";
    }

}
