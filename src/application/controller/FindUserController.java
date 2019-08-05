package application.controller;

import java.time.LocalDate; 
import java.util.List;

import application.boundary.UserListPage;
import application.entity.User;
import dao.UserDao;
import daoMySql.DaoFactoryMySql;
import javafx.event.ActionEvent;

public class FindUserController {

	
	
	
	public void findUserButtonPressed(ActionEvent event, String username, Integer annoNascita, boolean radioBox) {
		
		UserListPage p = new UserListPage(); 
		UserDao users = DaoFactoryMySql.getIstance().getUserDao(); 
		List <User> l; 
		if(radioBox == true && username.isEmpty() ) {
			l = users.readUsersOnlyBirthDate(annoNascita); 
		}
		else if (radioBox == true && username.isEmpty() == false ){
			
			l = users.readUsersBirthDate(username, annoNascita); 
		}	
		else {
			l = users.readUsersName(username); 
		}
			
		p.setUserList(l);
		p.showUserListPage(event);
		
	}
	
	
}
