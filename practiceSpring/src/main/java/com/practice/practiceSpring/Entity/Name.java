package com.practice.practiceSpring.Entity;

public class Name {

    // Creating an object of ArrayList
    private String firstName;
    private String lastName;
    public Name (String firstName, String lastName)
    {
        // This keyword refers to parent instance itself
        this.firstName = firstName;
        this.lastName = lastName;
    }
	public Name() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Hello" + firstName + lastName;
		//return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
		//return "Hello" + "Name [" + firstName + " + lastName + "]";
	}
	
    
}