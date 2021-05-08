package eticaretLogin.entities.concretes;

import java.util.Date;

import eticaretLogin.entities.abstracts.Entities;

public class User implements Entities{

	private int id;
	private String firstName;
	private String lasrName;
	private String password;
	private String email;
	private Date dateToBirth;
	private boolean InvalidUser;
	
	public User() {
	}

	public User(int id, String firstName, String lasrName, String password, String email, Date dateToBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasrName = lasrName;
		this.password = password;
		this.email = email;
		this.dateToBirth = dateToBirth;
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

	public String getLasrName() {
		return lasrName;
	}

	public void setLasrName(String lasrName) {
		this.lasrName = lasrName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateToBirth() {
		return dateToBirth;
	}

	public void setDateToBirth(Date dateToBirth) {
		this.dateToBirth = dateToBirth;
	}
	
	
	
}
