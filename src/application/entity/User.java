package application.entity;

import java.util.Date;



// prova di User 
public class User {
	
	private String name;
	private String surname;
	private String email; 
	private Date birthDate; 
	private String userName; 
	private String password; 

	

	public User() {
		
	}

	public User(String name, String surname, String email, Date birthDate, String userName, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.birthDate = birthDate;
		this.userName = userName;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	
	
}
