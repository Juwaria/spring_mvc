package com.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =  CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//defining default course prefixes array
	public String[] value() default "CS";
	
	//defining default error message
	public String message() default "must start with CS";
	
	//defining default groups
	public Class<?>[] groups() default{};
	
	//defining default payloads
	public Class<? extends Payload>[] payload() default{}; 

}
