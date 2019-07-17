package application.controller;

import dao.AdministratorDao;
import dao.DaoFactory;
import dao.UserDao;
import daoMySql.UserDaoMySql;
import javafx.event.ActionEvent;

public class SessionManager { 
	 
   private static SessionManager instance = null; 
   AdministratorDao adminDAO = DaoFactory.getIstance().getAdministratorDao();  
   private String activeUserName = null; 
   //default constructor
   private SessionManager() {              
	   
   }       
   
   
   public static SessionManager getInstance() {         
	   
	   if (instance == null) {             
		   instance = new SessionManager();         
		   }         
	   return instance;     
	   } 
 
   
 
    public void logout(ActionEvent event) {         
    	
    	activeUserName = null;     
    	} 
 
  
          
 
    public void authenticate(String userName, String password, ActionEvent event) {         
    	
    	if (adminDAO.exists(userName, password)) {                        
    		setActiveUserName(userName);         
    		}     
    	}         
    
    public boolean isUserAuthenticated() {         
    	
    	return activeUserName != null;     
    } 
 
    
    public void setActiveUserName(String userName) {         
    	this.activeUserName = userName;     
    	} 
 

    public String getActiveUserName() {         
    	return activeUserName;     
    	} 
 
}