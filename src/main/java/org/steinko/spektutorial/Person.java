package org.steinko.spektutorial;

class Person{ 
	
	private String firstName;
	private String lastName;
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String firstName() {
		return firstName;
	}
}