package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.UserDao;

public class UserDaoMySql extends UserDao {

	@Override
	public boolean exists(String Username, String password) {
		int counter; 
		ResultSet rs; 
		String query = "SELECT COUNT(*) " +" FROM "+ DbsSchema.ADMINISTRATOR_TABLE +
				" WHERE "+ DbsSchema.ADMINISTRATOR_USERNAME_COLUMN +"=\""+ Username +"\" AND "+ 
				DbsSchema.ADMINISTRATOR_PASSWORD_COLUMN +"=\""+ password +"\";";
		rs=DatabaseManagerMySql.getInstance().query(query); 
		try {
			if(rs != null) {
				rs.first(); 
				counter=rs.getInt(1); 
				System.out.println(counter); 
				return counter!=0; 
			}
			else {
				return false; 
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
