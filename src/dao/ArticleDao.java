package dao;

import java.util.List;

import application.entity.Article;
import application.entity.ArticleProfit;
import application.entity.Category;
import application.entity.Order;

public abstract class ArticleDao {
	
	/**
	 * dato un ordine, legge gli articoli presenti in quell'ordine 
	 * @param o
	 * @return
	 */
	public abstract List<Article> readArticleByOrder(String o ); 
	/**
	 * data una categoria, legge i 10 articoli più venduti di quella categoria 
	 * @param categoryName : nome della categoria 
	 * @return
	 */
	
	public abstract List<ArticleProfit> readBestSellerArticle(Category category); 
		
}
