package com.springdemo.mvc;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

@Controller
//high level mapping, like main directory
//all mappings in this class will be relative to the main mapping
//ex: /hello/showForm
@RequestMapping("/hello")
public class HelloWorldController {

	//controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	//controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	//controller method to read form data and
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {

		//reading the request parameter from the HTML form
		String theName = request.getParameter("studentName");

		//converting to all upper case
		theName = theName.toUpperCase();

		//creating message
		String result = "Heya! "+theName;

		//adding message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

	//controller method to read form data and
	//add data to the model
	//no need of the servelet request paramter as here the value is 
	//being set using annotation
	@RequestMapping("/processFormVersionThree")
	public String letsShoutAgain( @RequestParam("studentName") String theName,
			Model model) {

		//converting to all upper case
		theName = theName.toUpperCase();

		//creating message
		String result = "Hey what's up?! "+theName;

		//adding message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

}
