package application.boundary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoggedMainPage {

    @FXML
    private Button findUserButton;

    @FXML
    private Button viewProductStatics;

    @FXML
    private Label usernameLabel;

    @FXML
    private Hyperlink logoutLabel;

    @FXML
    void findUserButtonControl(ActionEvent event) {

    }

    @FXML
    void logoutLabelControl(ActionEvent event) {

    }

    @FXML
    void viewProductStaticsControl(ActionEvent event) {

    }
    
    public void showLoggedMainPage(ActionEvent event) {
    
      	try {
      			
      			FXMLLoader loader = new FXMLLoader(); 
    			loader.setLocation(getClass().getResource("../fxml/LoggedMainPage.fxml"));
    			Parent root = loader.load();
    			Scene scene = new Scene(root);
    			Stage s = new Stage();
    			s.setScene(scene);
    			s.setTitle("Logged Main Page");
    			s.show();
    		
    			
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	
    }
    @FXML
    void initialize() {
        assert findUserButton != null : "fx:id=\"findUserButton\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert viewProductStatics != null : "fx:id=\"viewProductStatics\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert usernameLabel != null : "fx:id=\"usernameLabel\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert logoutLabel != null : "fx:id=\"logoutLabel\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";

    }
 
 
}
