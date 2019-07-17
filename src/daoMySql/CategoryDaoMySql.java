package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dao.CategoryDao;
import dao.DatabaseManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CategoryDaoMySql extends CategoryDao{

	@Override
	public ObservableList<String> readAll() {
		
		ObservableList<String> l = FXCollections.observableArrayList(); 
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
	

}
