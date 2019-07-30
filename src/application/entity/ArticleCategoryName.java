package application.entity;

import dao.CategoryDao;
import dao.DaoFactory;
/**
 * classe che aggiunge all'articolo il nome della categoria a cui appartiene 
 * @author UTENTE
 *
 */
public class ArticleCategoryName extends Article {
	
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ArticleCategoryName(Integer code, Integer categoryCode, String name, Float price, String description,
			String dimension, Integer weight, String categoryName) {
		super(code, categoryCode, name, price, description, dimension, weight);
		this.categoryName=categoryName; 
	} 
	
	public static ArticleCategoryName transformArticleToArticleCategoryName (Article a ) {
		
		Integer categoryCode = a.getCategoryCode(); 
		CategoryDao categoryDao= DaoFactory.getIstance().getCategoryDao(); 
		String categoryName = categoryDao.readCategoryByCode(categoryCode); 
		
		ArticleCategoryName artcategory = new ArticleCategoryName (a.getCode(), a.getCategoryCode(), a.getDescription(), a.getPrice(), a.getDescription(), a.getDimension(), a.getWeight(), categoryName); 
		
		
		return artcategory;
		
	}
	
	

}
