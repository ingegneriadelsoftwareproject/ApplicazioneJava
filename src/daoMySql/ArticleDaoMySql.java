package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import application.entity.Article;
import application.entity.ArticleProfit;
import application.entity.Category;
import dao.ArticleDao;

public class ArticleDaoMySql extends ArticleDao {

	@Override
	public List<Article> readArticleByOrder(String o) {
		// TODO Auto-generated method stub
		List<Article> l = new LinkedList<Article>();
		
		ResultSet rs = null; 
		String statement = "Select * " + "From " + DbsSchema.ARTICLE_TABLE + " Where " + DbsSchema.ARTICLE_CODE_COLUMN + " IN (" +
		"Select " + DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN + " From " + DbsSchema.ORDER_LIST_TABLE + " Where " + DbsSchema.ORDER_LIST_CODE_ORDER_COLUMN + " = " + o + ")"; 
		rs = DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs != null ) {
				while(rs.next()) {
					//rs.first();
					l.add(new Article(rs.getInt(DbsSchema.ARTICLE_CODE_COLUMN), rs.getInt(DbsSchema.ARTICLE_CATEGORYCODE_COLUMN), rs.getString(DbsSchema.ARTICLE_NAME_COLUMN), rs.getFloat(DbsSchema.ARTICLE_PRICE_COLUMN), rs.getString(DbsSchema.ARTICLE_DESCRIPTION_COLUMN),rs.getString(DbsSchema.ARTICLE_DIMENSION_COLUMN), rs.getInt(DbsSchema.ARTICLE_WEIGHT_COLUMN))); 
				}
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<ArticleProfit> readBestSellerArticle(Category category) {
		
		
		List<ArticleProfit> l = new LinkedList<>();
		String categoryCode = category.getCode(); 
		ResultSet rs = null; 
		String statement = "SELECT " + DbsSchema.ARTICLE_TABLE + "." + DbsSchema.ARTICLE_NAME_COLUMN + 
				" , " + "SUM(" + DbsSchema.ARTICLE_TABLE + "." + DbsSchema.ARTICLE_PRICE_COLUMN + ")" + " AS TOTAL " +
				" FROM " + DbsSchema.ARTICLE_TABLE + " JOIN " + DbsSchema.ORDER_LIST_TABLE+ " ON " +
				DbsSchema.ARTICLE_CODE_COLUMN + " = " + DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN +
				" WHERE " + DbsSchema.ARTICLE_CATEGORYCODE_COLUMN + " = " + categoryCode + 
				" ORDER BY TOTAL ASC LIMIT 10"; 
		rs = DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs != null ) {
				while(rs.next()) {
					//rs.first();
					l.add(new ArticleProfit(rs.getString(DbsSchema.ARTICLE_NAME_COLUMN), rs.getFloat(2)));
					
				}
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return l;
		
		
		
		
	}

}
