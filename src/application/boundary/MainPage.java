package application.boundary;
import java.sql.Date;

import application.controller.MainPageController;
import application.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainPage {

    @FXML
    private Button makeLoginButton;
    

   	

    @FXML
    void loginButtonControl(ActionEvent event){
    	
    	MainPageController p = new MainPageController(); 
    	p.loginButtonPressed(event);
    }

}
