package application.entity;

public class Administrator {
	
	private String username; 
	private String password; 
	
	
	public Administrator(String name, String pass) {
		this.password=pass; 
		this.username=name; 
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	

}
