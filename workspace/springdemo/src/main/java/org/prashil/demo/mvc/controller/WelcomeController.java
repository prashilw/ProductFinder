package org.prashil.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class WelcomeController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView sayWelcome(){
		ModelAndView model = new ModelAndView("welcome");
		return model;
	}
}
