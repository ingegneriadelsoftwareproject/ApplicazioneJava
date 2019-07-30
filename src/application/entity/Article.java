package application.entity;

public class Article {
	
	private Integer code;
	private Integer categoryCode; 
	private String name; 
	private Float price;
	private String description; 
	private String dimension; 
	private Integer weight; 
	
	
	


	
	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}










	public Integer getCategoryCode() {
		return categoryCode;
	}


	public void setCategoryCode(Integer categoryCode) {
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





	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public Article(Integer code, Integer categoryCode, String name, Float price, String description, String dimension,
			Integer weight) {
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
