package com.juslin.ohte.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.juslin.ohte.domain.Friend;

@Controller
public class HelloController {

	private ArrayList<Friend> friends = new ArrayList<Friend>();

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String friendList(Model model) {
		Friend friend = new Friend();
		//student.setFirstName(name);
		//friends.add(friend);
		model.addAttribute("friend", friend);
		//model.addAttribute("friends", friends);
		//model.addAttribute("name", name);
		return "index";
	}

	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String friendSubmit(@ModelAttribute Friend friend, Model model) {
		
		friends.add(friend);
		model.addAttribute("friends", friends);

		return "index";
	}
	
}
