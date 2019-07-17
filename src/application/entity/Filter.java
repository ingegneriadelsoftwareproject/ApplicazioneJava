package application.entity;

import java.util.Date;

public class Filter {
	
	private String Category; 
	private String Username; 
	private Date birthDate; //usare java.Calendar?
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	public Filter(String category, String username, Date birthDate) {
		super();
		Category = category;
		Username = username;
		this.birthDate = birthDate;
	}
	
	

}
