package application.entity;

public class Article {
	
	private String code; 
	private String categorycode; 
	private String name; 
	private String price;
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getCategorycode() {
		return categorycode;
	}


	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Article(String code, String categorycode, String name, String price) {
		super();
		this.code = code;
		this.categorycode = categorycode;
		this.name = name;
		this.price = price;
	} 
	

}
