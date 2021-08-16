package com.timichanga.displayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// rest controller responds with text or json
// controller allows us to respond with a view
@Controller
public class DisplayController {
	@RequestMapping("/")
	public String index() {
	    return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String getDate(Model model) {
		String pattern = "EEEE, 'the' d 'of' MMMM, Y";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		model.addAttribute("date", date);
	    return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String getTime(Model model) {
		String pattern = "hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		model.addAttribute("time", date);
	    return "time.jsp";
	}
}
