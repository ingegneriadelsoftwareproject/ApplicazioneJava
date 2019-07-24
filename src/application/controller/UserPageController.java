package application.controller;

import java.util.List;

import application.boundary.DeleteSuccesPage;
import application.boundary.UserListPage;
import application.boundary.UserPage;
import application.boundary.UserStaticsPage;
import application.entity.OrderStaticsUser;
import application.entity.PreferencesStaticsUser;
import application.entity.User;
import dao.UserDao;
import daoMySql.DaoFactoryMySql;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableView;
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
		List<OrderStaticsUser> l1 = userDao.readOrderStatics(u); 
		List<PreferencesStaticsUser> l2 = userDao.readPreferences(u); 
		UserStaticsPage p = new UserStaticsPage(); 
		p.setOrderList(l1);
		p.showUserStaticsPage(event);
		
	}
}
