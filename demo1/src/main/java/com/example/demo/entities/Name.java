package com.example.demo.entities;

public class Name {

	 private long id;
	 private String FirstName;
	 private String LastName;
	
	   public Name(long id, String firstName, String lastName) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
}
