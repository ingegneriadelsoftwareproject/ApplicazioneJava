package application.controller;

import java.util.LinkedList;
import java.util.List;

import application.boundary.FindUserPage;
import application.boundary.StaticsProductPage;
import dao.CategoryDao;
import dao.DaoFactory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class LoggedMainPageController {

	
		public void findUserButtonPressed(ActionEvent event) {
			
			FindUserPage p = new FindUserPage(); 
			CategoryDao categories = DaoFactory.getIstance().getCategoryDao(); 
			ObservableList l = (ObservableList) categories.readAll();
			p.showFindUserPage(event, l );
			
		}
		
		public void viewProductStaticsButtonPressed(ActionEvent event) {
			StaticsProductPage p = new StaticsProductPage(); 
			p.showStaticsProductPage(event);
			
		}
}
