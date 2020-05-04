package com.example.Student.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Student.domain.Student;



@Controller
public class StudentController {
	private ArrayList<Student> students = new ArrayList<Student>();
	private String firstName = "Kate"+" " + "Dan"+" " +"Mike";
	private String lastName = "Cole"+" " + "Brown"+" " + "Mars";
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String studentList(Model model) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		students.add(student);
		model.addAttribute("students", students);
		//model.addAttribute("students", students);
		//model.addAttribute("name", name);
		return "hello";
	}
	@RequestMapping("/hellou")
	public String messages(Model model) {
	model.addAttribute("messages", "Welcome to the Haaga-Helia!");
	return	"hello";
	}
		
		
}
