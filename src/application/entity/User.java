package application.entity;

import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// prova di User 
public class User {
	
	public String name;
	public String surname;
	public String email; 
	public Date birthDate; 
	public String userName; 

	
	public User(String name, String surname,String email, String userName, Date birthDate ) {
		this.name=name; 
		this.surname=surname; 
		this.email=email; 
		this.birthDate=birthDate; 
		this.userName=userName; 
		
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
