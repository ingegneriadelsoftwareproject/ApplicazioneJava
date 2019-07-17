package application.controller;

import application.boundary.LoggedMainPage;
import javafx.event.ActionEvent;

public class LoginPageController {
	
	
	public void loginButtonPressed(ActionEvent event, String userName, String password) {
		
		SessionManager s = SessionManager.getInstance(); 
		s.authenticate(userName, password, event);
		
		if ( s.isUserAuthenticated()) {
			LoggedMainPage p = new LoggedMainPage();
			p.showLoggedMainPage(event, userName);
		}
		
	}

}
