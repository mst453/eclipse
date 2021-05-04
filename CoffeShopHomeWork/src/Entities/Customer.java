package Entities;

import java.util.Date;

import Abstruct.Entity;
// çýplak býrakma Ientity den birþeylere atmamýz lazým
public class Customer implements Entity {
	
	int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDateOfBirt() {
		return dateOfBirth;
	}

	public void setDateOfBirt(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	

}
