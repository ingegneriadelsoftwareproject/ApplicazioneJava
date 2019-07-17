package application.controller;

import application.boundary.FindUserPage;
import application.boundary.StaticsProductPage;
import javafx.event.ActionEvent;

public class LoggedMainPageController {

	
		public void findUserButtonPressed(ActionEvent event) {
			
			FindUserPage p = new FindUserPage(); 
			p.showFindUserPage(event);
			
		}
		
		public void viewProductStaticsButtonPressed(ActionEvent event) {
			StaticsProductPage p = new StaticsProductPage(); 
			p.showStaticsProductPage(event);
			
		}
}
