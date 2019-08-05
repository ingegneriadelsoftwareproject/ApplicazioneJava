package application.controller;



import java.util.LinkedList;
import java.util.List;

import application.boundary.FindUserPage;
import application.boundary.MainPage;
import application.boundary.ProductCategoryListPage;
import javafx.event.ActionEvent;

public class LoggedMainPageController {

	
		public void findUserButtonPressed(ActionEvent event) {
			
			FindUserPage p = new FindUserPage();
			p.showFindUserPage(event);
			
		}
		
		public void viewProductStaticsButtonPressed(ActionEvent event) {
			ProductCategoryListPage p = new ProductCategoryListPage(); 
			p.showProductCategoryListPage(event);
			
		}
		public void logoutLabelPressed(ActionEvent event) {
			SessionManager s = SessionManager.getInstance(); 
			s.logout(event);
			MainPage p = new MainPage(); 
			p.showMainPage(event);
			
		
		}
}
