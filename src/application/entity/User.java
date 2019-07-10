package application.entity;

import javafx.beans.property.SimpleStringProperty;

// prova di User 
public class User {
	
	public SimpleStringProperty name;
	public SimpleStringProperty surname;
	public SimpleStringProperty email; 

	public User(String name, String surname,String email ) {
		this.name=new SimpleStringProperty(name); 
		this.surname=new SimpleStringProperty(surname); 
		this.email=new SimpleStringProperty(email); 
		
	}

	public SimpleStringProperty getName() {
		return name;
	}

	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

	public SimpleStringProperty getSurname() {
		return surname;
	}

	public void setSurname(SimpleStringProperty surname) {
		this.surname = surname;
	}

	public SimpleStringProperty getEmail() {
		return email;
	}

	public void setEmail(SimpleStringProperty email) {
		this.email = email;
	}


	
	
}
