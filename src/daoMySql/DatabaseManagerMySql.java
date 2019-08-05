package daoMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.DatabaseManager;

public class DatabaseManagerMySql implements DatabaseManager {
	
	private static DatabaseManagerMySql instance = null; 
	private static Connection connection = null; 
	private static final String DATABASE_NAME = "ec17_db"; 
	private static final String END_POINT = "ec17instance.cykkcxolpmos.eu-central-1.rds.amazonaws.com";
	private final String user; 
	private final String password; 
	
	private DatabaseManagerMySql() {
		this.user="root"; 
		this.password = "root1234"; 
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		String connectionString = "jdbc:mysql://" + END_POINT + ":3306/" + DATABASE_NAME + "?user="+ user +"&password="+ password;         
		Connection conn = null;         
		if(connection == null){             
			                
			try{                 
				conn = DriverManager.getConnection(connectionString);             
				}catch(SQLException sqlex){                 
					System.out.println("Connessione fallita!");
					}            
			DatabaseManagerMySql.connection = conn;         
		}
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
	     if(connection != null){             
	    	 try{                 
	    		 connection.close();             
	    		}catch(SQLException sqlex){                 
	    			return;             
	    		}             
	    	 
	    	 connection = null;         
	    }
		
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return connection!=null;
	}

	@Override
	public ResultSet query(String statement) {
		System.out.println("Querying " + statement);         
		ResultSet resultSet = null;         
		if(isConnected()) {             
			try {                 
				Statement stmn = connection.createStatement();                 
				resultSet = stmn.executeQuery(statement);                 
				return resultSet;             
				}catch(SQLException sqlex){                 
					System.out.println(sqlex.getMessage());             
					}         
			}         
		return resultSet; 
	}

	@Override
	public void update(String statement) {
		   System.out.println("Executing " + statement);         
		   if(isConnected()) {             
			   try {                 
				   Statement stmn = connection.createStatement();                 
				   stmn.executeUpdate(statement);             
				   }catch(SQLException sqlex){                 
					   sqlex.printStackTrace();             
					}         
		}
		
	}

	@Override
	public void startTransaction() {
		 String statement = "START TRANSACTION;";
		 DatabaseManagerMySql.getInstance().update(statement);
		
	}

	@Override
	public void commitTransaction() {
		String statement = "COMMIT;";         
		DatabaseManagerMySql.getInstance().update(statement);
		
	}

	@Override
	public void rollbackToSafeState() {
		String statement = "ROLLBACK;";         
		DatabaseManagerMySql.getInstance().update(statement); 
		
	}
	
    public static DatabaseManagerMySql getInstance() {         
    	if (instance == null) {             
    		instance = new DatabaseManagerMySql();         
    		}         
    	if (!instance.isConnected()) {             
    		instance.connect();         
    	}         return instance;     
    	
    }

}
