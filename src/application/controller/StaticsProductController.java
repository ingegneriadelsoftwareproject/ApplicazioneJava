package application.controller;


import java.util.List;

import application.boundary.StaticsProductPage;
import dao.ArticleDao;
import dao.CategoryDao;
import dao.DaoFactory;
import javafx.event.ActionEvent;
import application.entity.*;

public class StaticsProductController {

	
	public void linkCategoryPressed(ActionEvent event, String linkName) {
		StaticsProductPage p = new StaticsProductPage();
		CategoryDao categoryDao = DaoFactory.getIstance().getCategoryDao(); 
		Category category = categoryDao.readCategoryByName(linkName);
		List<ArticleProfit> l ; 
		ArticleDao articleDao = DaoFactory.getIstance().getArticleDao(); 
		l= articleDao.readBestSellerArticle(category); 
		p.showStaticsProductPage(event, l);
		
	}
	
	
	
	
}
