package org.prashil.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public @ResponseBody String simple() {
//		ModelAndView modelView = new ModelAndView();
//		modelView.setViewName("welcome");
		return "Hello World";
		
	}

}
