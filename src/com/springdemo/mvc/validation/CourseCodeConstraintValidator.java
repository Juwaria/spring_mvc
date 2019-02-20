package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode,String> {
	
	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	//theCode: value entered by the user
	//ConstraintValidatorContext: used to define customized messages
	//any thing can be done here: talk to DB, call a web service
	//to make sure the input coming in as per requirement
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
	
		boolean result=false;
		
		if(theCode!=null) {
			//handling list of prefixes
			for(String temp:coursePrefix) {
	      	result=theCode.startsWith(temp);
	      	if(result) {
	      		break;
	      	}
			}
		}
		else {
			result=true;
		}
		return result;
	}
	


}
