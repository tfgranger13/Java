package com.timichanga.hellohuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// rest controller at the top
// accepts routes
// also give responses
@RestController
public class HumanController {
	// request mapping for the route
	@RequestMapping("/")
	// then the method that it calls
	// add the request param to see if they added a param
	// required = false to allow them to not add a param if they don't want to
	public String name(@RequestParam(value="name", required = false) String name) {
		if (name == null){
			return "Hello Human!";
		}
		else {
			return "Hello " + name+ "!";			
		}
	}
}
