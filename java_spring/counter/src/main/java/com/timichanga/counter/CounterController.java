package com.timichanga.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session){
        // Here we can use the variable session to store things!
		if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count", (int)(session.getAttribute("count")) + 1);
		}
        return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model){
		int currentCount = (int) session.getAttribute("count");
        model.addAttribute("dispCount", currentCount);
		return "counter.jsp";
	}
	@RequestMapping("/counter/reset")
	public String counterReset(HttpSession session, Model model){
		session.setAttribute("count", 0);
		int currentCount = (int) session.getAttribute("count");
        model.addAttribute("dispCount", currentCount);
		return "counter.jsp";
	}
}
