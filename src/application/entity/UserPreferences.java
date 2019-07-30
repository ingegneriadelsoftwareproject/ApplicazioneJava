package application.entity;

public class UserPreferences {
	
	
	private String categoryName; 
	private Float importoPerCategori;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Float getImportoPerCategori() {
		return importoPerCategori;
	}
	public void setImportoPerCategori(Float importoPerCategori) {
		this.importoPerCategori = importoPerCategori;
	}
	public UserPreferences(String categoryName, Float importoPerCategori) {
		super();
		this.categoryName = categoryName;
		this.importoPerCategori = importoPerCategori;
	} 
	
	

}
