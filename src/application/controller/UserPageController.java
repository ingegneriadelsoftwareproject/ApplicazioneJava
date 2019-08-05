package application.controller;


import java.util.List;

import application.boundary.DeleteSuccesPage;
import application.boundary.UserListPage;
import application.boundary.UserPage;
import application.boundary.UserStaticsPage;
import application.entity.Order;
import application.entity.PreferencesStaticsUser;
import application.entity.User;
import dao.UserDao;
import daoMySql.DaoFactoryMySql;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class UserPageController {
	
	public void userRowPressed(MouseEvent event, User u ) {
		UserPage p = new UserPage(); 
		p.setUser(u);
		p.showUserPage(event);
		
	}
	
	public void deleteUserButtonPressed(ActionEvent event, User u  ) {	
	
		UserDao userDao = DaoFactoryMySql.getIstance().getUserDao(); 
		userDao.deleteUser(u.getUserName());
		DeleteSuccesPage p = new DeleteSuccesPage(); 
		p.showDeleteSuccessPage(event); 
		UserListPage.updateUserList(u);

		
	}
	
	
	
	public void viewStaticsButtonPressed(ActionEvent event, User u ) {
		
		UserDao userDao = DaoFactoryMySql.getIstance().getUserDao();
		List<Order> orderList = userDao.readOrder(u); //lista di ordini effettuata dagli utenti ;
		List<PreferencesStaticsUser> userPreference = userDao.readPreferences(u); 
		UserStaticsPage p = new UserStaticsPage(); 
		p.showUserStaticsPage(event, orderList, userPreference);
		
	}
}
