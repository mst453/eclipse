package gameHomeWork;

import java.util.Date;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String pasword;
	private String nationalyId;
	private Date dateOfBirth;
	private Date accountStartDate;
	private String gender;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String nickName, String pasword, String nationalyId,
			Date dateOfBirth, Date accountStartDate, String gender) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.pasword = pasword;
		this.nationalyId = nationalyId;
		this.dateOfBirth = dateOfBirth;
		this.accountStartDate = accountStartDate;
		this.gender = gender;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getAccountStartDate() {
		return accountStartDate;
	}

	public void setAccountStartDate(Date accountStartDate) {
		this.accountStartDate = accountStartDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
