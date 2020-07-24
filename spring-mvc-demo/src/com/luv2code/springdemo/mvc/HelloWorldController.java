package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String readFormData(@RequestParam("studentName") String name, Model model) {
		model.addAttribute("message", "Hey! " + name.toUpperCase());
		return "helloworld";
	}
	
}
