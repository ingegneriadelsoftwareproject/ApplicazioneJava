package dao;
import java.util.List;

import application.entity.Category;
import application.entity.Order;


public abstract class CategoryDao {
	/**
	 * legge tutte le categorie presenti nel database 
	 * @return
	 */
	public abstract List<String> readAll(); 
	/**
	 * legge i nomi delle categorie contenute nell'ordine
	 * @param o
	 * @return
	 */
	public abstract List<String> readCategoryOrder(Order o); 
	
	/**
	 * legge il nome della categoria corrsipondente al codice 
	 * @param code
	 * @return
	 */
	public abstract String readCategoryByCode(Integer code); 
	/**
	 * legge una categoria attraverso il nome 
	 * @param CategoryName
	 * @return
	 */
	public abstract Category readCategoryByName(String CategoryName);  
		
	

}
