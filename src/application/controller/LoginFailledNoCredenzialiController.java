package application.controller;

import application.boundary.LoginPage;
import javafx.event.ActionEvent;

public class LoginFailledNoCredenzialiController {
	
	public void okButtonNoCredenzialiPressed(ActionEvent event) {
		LoginPage p = new LoginPage(); 
		p.showLoginPage(event);
	}

}
