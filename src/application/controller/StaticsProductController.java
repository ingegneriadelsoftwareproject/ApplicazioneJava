package application.controller;


import java.util.List;

import application.boundary.StaticsProductPage;
import dao.ArticleDao;
import dao.CategoryDao;
import dao.DaoFactory;
import dao.OrderDao;
import javafx.event.ActionEvent;
import application.entity.*;

public class StaticsProductController {

	
	public void linkCategoryPressed(ActionEvent event, String linkName) {
		StaticsProductPage p = new StaticsProductPage();
		CategoryDao categoryDao = DaoFactory.getIstance().getCategoryDao(); 
		Category category = categoryDao.readCategoryByName(linkName);
		List<ArticleProfit> articleCategoryProfit ; 
		List<VenditeMensili> venditeMensili; 
		ArticleDao articleDao = DaoFactory.getIstance().getArticleDao(); 
		OrderDao orderDao = DaoFactory.getIstance().getOrderDao(); 
		venditeMensili = orderDao.readVenditeMensili(linkName); 
		articleCategoryProfit = articleDao.readBestSellerArticle(category); 
		System.out.println(venditeMensili.isEmpty());
		p.showStaticsProductPage(event, articleCategoryProfit, venditeMensili);
		
	}
	
	
	
	
}
