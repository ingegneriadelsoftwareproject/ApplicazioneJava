package daoMySql;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import application.entity.Order;
import application.entity.OrderStaticsUser;
import application.entity.PreferencesStaticsUser;
import application.entity.User;
import dao.UserDao;


public class UserDaoMySql extends UserDao {

	@Override
	public List<User> readUsersBirthDate(String username, LocalDate birthData) {
		List<User> l = new LinkedList<>(); 
		ResultSet rs = null; 
		 
		String statement = "SELECT * " + " FROM " + DbsSchema.USER_TABLE + " WHERE " + DbsSchema.USER_USERANAME_COLUMN
				+ "=\"" + username + "\" AND " + DbsSchema.USER_BIRTHDATE_COLUMN + "=\"" + birthData.toString() + "\";";
		rs=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs!= null) {
				while(rs.next()) {
					//System.out.println(rs);
					rs.first(); 
					l.add(new User(rs.getString(DbsSchema.USER_NAME_COLUMN),rs.getString(DbsSchema.USER_SURNAME_COLUMN), rs.getString(DbsSchema.USER_EMAIL_COLUMN), rs.getDate(DbsSchema.USER_BIRTHDATE_COLUMN), rs.getString(DbsSchema.USER_USERANAME_COLUMN),rs.getString(DbsSchema.USER_PASSWORD_COLUMN))); 
				}
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public List<User> readUsersName(String username) {
		
		List<User> l = new LinkedList<>(); 
		ResultSet rs = null; 
		String statement = "SELECT * " + " FROM " + DbsSchema.USER_TABLE + " WHERE " + DbsSchema.USER_USERANAME_COLUMN 
				+ "=\"" + username + "\""; 
		rs=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs!= null) {
				while(rs.next()) {
					System.out.println(rs);
					rs.first(); 
					l.add(new User(rs.getString(DbsSchema.USER_NAME_COLUMN), rs.getString(DbsSchema.USER_SURNAME_COLUMN), rs.getString(DbsSchema.USER_EMAIL_COLUMN),rs.getDate(DbsSchema.USER_BIRTHDATE_COLUMN),  rs.getString(DbsSchema.USER_USERANAME_COLUMN), rs.getString(DbsSchema.USER_PASSWORD_COLUMN))); 
				}
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public List<User> readUsersOnlyBirthDate(LocalDate birthData) {
		List<User> l = new LinkedList<>(); 
		ResultSet rs = null; 
		 
		String statement = "SELECT * " + " FROM " + DbsSchema.USER_TABLE + " WHERE " 
		+ DbsSchema.USER_BIRTHDATE_COLUMN + "=\"" + birthData.toString() + "\";";
		rs=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			if(rs!= null) {
				while(rs.next()) {
					//System.out.println(rs);
					//rs.first(); 
					l.add(new User(rs.getString(DbsSchema.USER_NAME_COLUMN),rs.getString(DbsSchema.USER_SURNAME_COLUMN), rs.getString(DbsSchema.USER_EMAIL_COLUMN), rs.getDate(DbsSchema.USER_BIRTHDATE_COLUMN), rs.getString(DbsSchema.USER_USERANAME_COLUMN),rs.getString(DbsSchema.USER_PASSWORD_COLUMN))); 
				}
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public void deleteUser(String username) {
		
	      String statement = "DELETE FROM "+ DbsSchema.USER_TABLE                          
	    		  +" WHERE "+ DbsSchema.USER_USERANAME_COLUMN +"=\""+ username +"\";"; 
	      DatabaseManagerMySql.getInstance().update(statement);
		
		
	}

	@Override
	public List<OrderStaticsUser> readOrderStatics(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PreferencesStaticsUser> readPreferences(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> readOrder(User u) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
