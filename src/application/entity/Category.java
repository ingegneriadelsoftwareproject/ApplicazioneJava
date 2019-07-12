package application.entity;

public class Category {
	
	private String code; 
	private String name; 
	
	
	public Category( String cod, String name) {
		this.code=cod; 
		this.name=name; 
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
