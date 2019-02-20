package com.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	//injecting the country values from the properties file
	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
	
	//method to return form view
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		//creating student object
		Student theStudent = new Student();

		//adding student object to the model
		theModel.addAttribute("student",theStudent);
		
		//adding the country options to the model
		theModel.addAttribute("countryOptions",countryOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	//form data will populate the theStudent object using the id "student"
	public String processForm(@ModelAttribute("student") Student theStudent) {

		System.out.println("theSTudent: "+theStudent.getFirstName()+" "+
				theStudent.getLastName());
		return "student-confirmation";

	}

}
