package application.boundary;

import java.io.IOException;

import application.controller.LoginPageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPage {

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    void loginButtonControl(ActionEvent event) throws IOException{
    	
    	String userName = nomeTextField.getText().toString(); 
    	String password = passwordTextField.getText().toString(); 
    	LoginPageController p = new LoginPageController(); 
    	p.loginButtonPressed(event, userName, password);
    	((Node)(event.getSource())).getScene().getWindow().hide();
    	
    }
    public void close () {
    	
    }
    public void showLoginPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/LoginPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Login Page");
			s.show();
			//((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }


}
