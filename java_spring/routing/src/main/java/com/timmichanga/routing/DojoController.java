package com.timmichanga.routing;

// import the Path Variable dependency
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// rest controller before the class
@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String dojoPath() {
		return "The Dojo is awesome!";
	}
	@RequestMapping("/{location}-dojo")
	public String locDojo(@PathVariable("location") String location) {
		return "" + location + " Dojo is located in Southern California.";
	}
	@RequestMapping("/{location}")
	public String locOnly(@PathVariable("location") String location) {
		return "" + location + " dojo is the headquarters.";
	}
}
