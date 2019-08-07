package application.boundary;

import application.controller.LoginFailledNoCredenzialiController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginFailledNoConnessione {

    @FXML
    private Button okButton;

    @FXML
    void okButtonControl(ActionEvent event) {
     	LoginFailledNoCredenzialiController p = new LoginFailledNoCredenzialiController(); 
    	p.okButtonNoCredenzialiPressed(event);
    	((Node)(event.getSource())).getScene().getWindow().hide();
    }
    public void showLoginFailledNoCredenziali(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/application/fxml/LoginFailledNoConnessione.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Campi vuoti!");
			s.show();
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
