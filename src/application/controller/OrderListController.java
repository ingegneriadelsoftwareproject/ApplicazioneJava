package application.controller;


import java.util.LinkedList;
import java.util.List;

import application.boundary.OrderStaticsPage;
import application.entity.Article;
import application.entity.ArticleCategoryName;
import dao.ArticleDao;
import daoMySql.DaoFactoryMySql;
import javafx.scene.input.MouseEvent;

public class OrderListController {
	
	public void orderRowPressed(MouseEvent event, String orderCode ) {
		
		
		OrderStaticsPage p = new OrderStaticsPage();
		List<Article> l; 
		List<ArticleCategoryName> l2 = new LinkedList<>(); 
		ArticleDao articleDao = DaoFactoryMySql.getIstance().getArticleDao(); 
		l = articleDao.readArticleByOrder(orderCode); 
		for ( Article x : l ) {
			l2.add(ArticleCategoryName.transformArticleToArticleCategoryName(x)); 
			//System.out.println("qui"); 
		}
		p.showOrderStaticsPage(event, orderCode, l2);
	}

}
