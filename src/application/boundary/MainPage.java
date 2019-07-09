package application.boundary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainPage {

    @FXML
    private Button makeLoginButton;

    @FXML
    void loginButtonControl(ActionEvent event) {
    	//per provare LoginPage
    	LoginPage p = new LoginPage(); 
    	p.showLoginPage(event);
		
    

    }

}
