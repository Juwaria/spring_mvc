package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer",new Customer());
		return "customer-form";
		
	}

	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		//checking the result 
		//if errors go back to form
		
		System.out.println("Last name: |"+theCustomer.getLastName()+"|");
		System.out.println("Binding result: "+theBindingResult);
		System.out.println("\n");
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		//if all is good then move to confirmation page
		else {
		return "customer-confirmation";
		} 
	}
	
	@InitBinder
	public void preProcess(WebDataBinder dataBinder) {

		//removing leading/trailing white spaces from i/p strings
		//only doing this will give "must not be null" message
		//@NotNull message needs to be set in Customer class for lastName
		//for a custom message
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		//removing it from any incoming string objects
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}

}
