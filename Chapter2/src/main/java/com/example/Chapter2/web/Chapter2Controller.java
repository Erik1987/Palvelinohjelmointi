package com.example.Chapter2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class Chapter2Controller {

	@RequestMapping("/index")
	public String hello(@RequestParam(value="name") String name, Model model, @RequestParam(value="age") int age, Model model2 ) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
	
			return "index";
	}
	
}
