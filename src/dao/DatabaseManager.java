package dao;

import java.sql.ResultSet;

public interface DatabaseManager { 
	 
    public void connect(); 
 
    public void disconnect(); 
 
    public boolean isConnected(); 
 
    public ResultSet query(String statement); 
 
    public void update(String statement); 
 
    public void startTransaction(); 
 
    public void commitTransaction(); 
 
    public void rollbackToSafeState(); 
}