package application.controller;

import java.io.IOException;

import application.boundary.LoggedMainPage;
import application.boundary.LoginFailledCredenzialiErrate;
import application.boundary.LoginFailledNoConnessione;
import application.boundary.LoginFailledNoCredenziali;
import application.boundary.LoginOkPage;
import javafx.event.ActionEvent;

public class LoginPageController {
	
	
	public void loginButtonPressed(ActionEvent event, String userName, String password) throws IOException {
		
		if ( CheckInternetConnection.check()) {
			
			SessionManager s = SessionManager.getInstance(); 
			System.out.println(CheckInternetConnection.check());
			s.authenticate(userName, password, event);
			if ( s.isUserAuthenticated()) {
				LoggedMainPage p2 = new LoggedMainPage();
				p2.showLoggedMainPage(event, userName);
				LoginOkPage p = new LoginOkPage(); 
				p.showLoginOkPage(event);
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
		else {
			LoginFailledNoConnessione p = new LoginFailledNoConnessione(); 
			p.showLoginFailledNoCredenziali(event);
		}
		
	}



}
