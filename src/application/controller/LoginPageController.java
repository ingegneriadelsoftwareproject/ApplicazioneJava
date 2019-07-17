package application.controller;

import application.boundary.LoggedMainPage;
import application.boundary.LoginFailledCredenzialiErrate;
import application.boundary.LoginFailledNoCredenziali;
import javafx.event.ActionEvent;

public class LoginPageController {
	
	
	public void loginButtonPressed(ActionEvent event, String userName, String password) {
		
		SessionManager s = SessionManager.getInstance(); 
		s.authenticate(userName, password, event);
		
		if ( s.isUserAuthenticated()) {
			LoggedMainPage p = new LoggedMainPage();
			p.showLoggedMainPage(event, userName);
		}
		else
		{
				if (userName.isEmpty()  || password.isEmpty()  ) {
	
					LoginFailledNoCredenziali p = new LoginFailledNoCredenziali(); 
					p.showLoginFailledNoCredenziali(event);
				}
				else {
					LoginFailledCredenzialiErrate p = new LoginFailledCredenzialiErrate(); 
					p.showLoginFailledCredenzialiErrate(event);
				}
		
		
		}
	}
}
