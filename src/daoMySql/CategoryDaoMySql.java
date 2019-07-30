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
	public List<String> readCategoryOrder(Order o) {
		List<String> l = new LinkedList<>(); 
		ResultSet rs = null; 
		String orderCode = o.getCode(); 
		String statement = "SELECT " + DbsSchema.CATEGORY_NAME_COLUMN +  " FROM " + DbsSchema.CATEGORY_TABLE + " WHERE " + DbsSchema.CATEGORY_CODE_COLUMN + " IN " + "(" + "SELECT " + DbsSchema.ARTICLE_CATEGORYCODE_COLUMN + " FROM " + DbsSchema.ORDER_LIST_TABLE + " JOIN " + DbsSchema.ARTICLE_TABLE + " ON " + DbsSchema.ARTICLE_CODE_COLUMN + " = "+ DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN
				+ " WHERE " + DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN + "=\"" + orderCode + "\"" + ");";
		rs=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs!= null) {
				while(rs.next()) {
					//System.out.println(rs);
					rs.first(); 
					l.add(rs.getString(1)); 
				}
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String readCategoryByCode(Integer code) {
		// TODO Auto-generated method stub
		String ret = null; 
		ResultSet st = null; 
		String statement = "SELECT "+ DbsSchema.CATEGORY_NAME_COLUMN + " FROM " + DbsSchema.CATEGORY_TABLE + 
				" Where " + DbsSchema.CATEGORY_CODE_COLUMN + " = " +code; 
		st=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			while(st.next()) {
				ret = st.getString(DbsSchema.CATEGORY_NAME_COLUMN);  
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		return ret;
	}

	@Override
	public Category readCategoryByName(String categoryName) {
		Category ret = null; 
		ResultSet st = null; 
		String statement = "SELECT *"+ " FROM " + DbsSchema.CATEGORY_TABLE + 
				" Where " + DbsSchema.CATEGORY_NAME_COLUMN + " = " + "\"" + categoryName + "\""; 
		st=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			while(st.next()) {
				ret = new Category(st.getString(DbsSchema.CATEGORY_CODE_COLUMN), st.getString(DbsSchema.CATEGORY_NAME_COLUMN));  
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		return ret;
	}


	

}
