package application.entity;

public class Article {
	
	private String code;
	private String categoryCode; 
	private String name; 
	private String price;
	private String description; 
	private String dimension; 
	private Float weight; 
	
	
	
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


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getCategoryCode() {
		return categoryCode;
	}


	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDimension() {
		return dimension;
	}


	public void setDimension(String dimension) {
		this.dimension = dimension;
	}


	public Float getWeight() {
		return weight;
	}


	public void setWeight(Float weight) {
		this.weight = weight;
	}


	public Article(String code, String categoryCode, String name, String price, String description, String dimension,
			Float weight) {
		super();
		this.code = code;
		this.categoryCode = categoryCode;
		this.name = name;
		this.price = price;
		this.description = description;
		this.dimension = dimension;
		this.weight = weight;
	}




}
