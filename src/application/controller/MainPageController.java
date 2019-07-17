package application.controller;

import application.boundary.LoginPage;
import javafx.event.ActionEvent;

public class MainPageController {
	
	
	public void loginButtonPressed(ActionEvent event) {
		
		LoginPage p = new LoginPage(); 
		p.showLoginPage(event);
		
	}

}
