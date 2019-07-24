package application.controller;

import application.boundary.LoginPage;
import javafx.event.ActionEvent;

public class LoginFailledCredenzialiErrateController {
	
	
	public void oKButtonCredenzialiErrattePressed(ActionEvent event) {
		LoginPage p = new LoginPage(); 
		p.showLoginPage(event);
		
	}

}
