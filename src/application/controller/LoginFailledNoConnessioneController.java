package application.controller;

import application.boundary.LoginPage;
import javafx.event.ActionEvent;

public class LoginFailledNoConnessioneController {
	
	public void okButtonNoConnessionePressed(ActionEvent event) {
		LoginPage p = new LoginPage(); 
		p.showLoginPage(event);
	}


}
