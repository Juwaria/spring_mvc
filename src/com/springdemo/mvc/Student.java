package com.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.lang.NonNull;

public class Student {
	
	private String firstName;
	
	
	private String lastName;
	
	private String country;
	
	private  String favoriteLanguage;
	
	private String[] operatingSystems;
	
	//was used initially 
	//now loading using file
	//private LinkedHashMap<String,String> countryOptions;
	
	
	public Student() {
		
		//populating country options
		//can also be done using a properties file
		
		/*
		 * countryOptions = new LinkedHashMap<String, String>();
		 * 
		 * countryOptions.put("BR", "Brazil"); countryOptions.put("IN", "India");
		 * countryOptions.put("US", "United States"); countryOptions.put("CA",
		 * "Canada");
		 */
		
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	//was just when country options were statically loaded from the class
	//was used as ${student.countryOptions} in the form
	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */


	
	

}
