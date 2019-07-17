package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.AdministratorDao;

public class AdministratorDaoMySql extends AdministratorDao{

	@Override
	public boolean exists(String Username, String password) {
	     int counter;         
	     ResultSet resultSet;         
	     String statement = "SELECT COUNT(*) "                          
	    		 			+" FROM "+ DbsSchema.ADMINISTRATOR_TABLE                          
	    		 			+" WHERE "+ DbsSchema.ADMINISTRATOR_USERNAME_COLUMN +"=\""+ Username +"\" AND "+ 
	    		 			DbsSchema.ADMINISTRATOR_PASSWORD_COLUMN +"=\""+ password +"\";";                  
	     resultSet = DatabaseManagerMySql.getInstance().query(statement);         
	     try {             
	    	 if (resultSet != null) {                 
	    		 resultSet.first();                 
	    		 counter = resultSet.getInt(1);                 
	    		 System.out.println("counter ottenuto "+counter);                 
	    		 return counter!=0;             
	    		 }             
	    	 else {                 
	    		 return false;             
	    		 }         
	    	 } catch (SQLException ex) {             
	    		 return false;         
	    		 }
	}

}
