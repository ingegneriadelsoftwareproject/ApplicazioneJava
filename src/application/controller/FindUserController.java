package application.controller;

import java.time.LocalDate; 
import java.util.List;

import application.boundary.UserListPage;
import application.entity.User;
import dao.UserDao;
import daoMySql.DaoFactoryMySql;
import javafx.event.ActionEvent;

public class FindUserController {

	
	
	
	public void findUserButtonPressed(ActionEvent event, String username, LocalDate birthData, boolean radioBox) {
		
		UserListPage p = new UserListPage(); 
		UserDao users = DaoFactoryMySql.getIstance().getUserDao(); 
		List <User> l; 
		if(username.isEmpty() && radioBox == true ) {
			l = users.readUsersOnlyBirthDate(birthData); 
		}
		else {
			if(username.isEmpty() == false && radioBox== true) {
				
				l = users.readUsersBirthDate(username, birthData); 
			}
			else {
				l = users.readUsersName(username); 
			}
		}
			
		p.setUserList(l);
		p.showUserListPage(event);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
