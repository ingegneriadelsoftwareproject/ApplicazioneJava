package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import application.entity.Category;
import application.entity.Order;
import application.entity.User;
import dao.CategoryDao;


public class CategoryDaoMySql extends CategoryDao{

	@Override
	public List<String> readAll() {
		
		List<String> l = new LinkedList<>(); 
		ResultSet st = null; 
		String statement = "SELECT "+ DbsSchema.CATEGORY_NAME_COLUMN + " FROM " + DbsSchema.CATEGORY_TABLE; 
		st=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			while(st.next()) {
				l.add(st.getString(1)); 
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Category> readCategoryOrder(Order o) {
		List<Category> l = new LinkedList<>(); 
		ResultSet rs = null; 
		String orderCode = o.getCode(); 
		String statement = "SELECT *" + " FROM " + DbsSchema.CATEGORY_TABLE + " WHERE " + DbsSchema.CATEGORY_CODE_COLUMN + " IN " + "(" + "SELECT " + DbsSchema.ARTICLE_CATEGORYCODE_COLUMN + " FROM " + DbsSchema.ORDER_LIST_TABLE + " JOIN " + DbsSchema.ARTICLE_TABLE + " ON " + DbsSchema.ARTICLE_CODE_COLUMN + " = "+ DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN
				+ " WHERE " + DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN + "=\"" + orderCode + "\"" + ");";
		rs=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs!= null) {
				while(rs.next()) {
					//System.out.println(rs);
					rs.first(); 
					l.add(new Category(rs.getString(DbsSchema.CATEGORY_CODE_COLUMN), rs.getString(DbsSchema.CATEGORY_NAME_COLUMN))); 
				}
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}


	

}
