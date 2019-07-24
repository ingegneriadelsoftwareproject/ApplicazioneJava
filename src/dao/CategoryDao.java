package dao;
import java.util.List;

import application.entity.Category;
import application.entity.Order;


public abstract class CategoryDao {
	
	public abstract List<String> readAll(); 
	/**
	 * legge i codici delle categorie contenuti nell'ordine
	 * @param o
	 * @return
	 */
	public abstract List<Category> readCategoryOrder(Order o); 
	
	 
		
	

}
