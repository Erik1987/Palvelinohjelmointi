package com.example.oppilaslista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.oppilaslista.domain.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repository;
	
	public String listStudents() {
		
		return "";
	}
	
}
