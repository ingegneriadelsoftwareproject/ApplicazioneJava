package application.boundary;

import java.text.DateFormat;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Locale;

import application.controller.LoggedMainPageController;
import application.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;
/**
 * pagina principale dopo che l'amministratore ha effettuato il login 
 * @author UTENTE
 *
 */
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
    void findUserButtonControl(ActionEvent event) throws ParseException {
    	
    	LoggedMainPageController p = new LoggedMainPageController(); 
    	p.findUserButtonPressed(event);
    	
    }

    @FXML
    void logoutLabelControl(ActionEvent event) {
    	LoggedMainPageController p = new LoggedMainPageController(); 
    	p.logoutLabelPressed(event);
    	((Node)(event.getSource())).getScene().getWindow().hide();
    	

    }

    @FXML
    void viewProductStaticsControl(ActionEvent event) {
    	LoggedMainPageController p = new LoggedMainPageController();
    	p.viewProductStaticsButtonPressed(event);

    }
    
    public void showLoggedMainPage(ActionEvent event, String userName) {
    
      	try {
      			
      			FXMLLoader loader = new FXMLLoader(); 
    			loader.setLocation(getClass().getResource("../fxml/LoggedMainPage.fxml"));
    			Parent root = loader.load();
    			Scene scene = new Scene(root);
    			Stage s = new Stage();
    			s.setScene(scene);
    			s.setTitle("Logged Main Page");
    			LoggedMainPage l = loader.<LoggedMainPage>getController(); 
    			l.initData(userName);
    			s.show();
    		
    			
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	
    }
    
    void initData (String nome ) {
    	this.usernameLabel.setText(nome);
    }
    @FXML
    void initialize() {
        assert findUserButton != null : "fx:id=\"findUserButton\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert viewProductStatics != null : "fx:id=\"viewProductStatics\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert usernameLabel != null : "fx:id=\"usernameLabel\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";
        assert logoutLabel != null : "fx:id=\"logoutLabel\" was not injected: check your FXML file 'LoggedMainPage.fxml'.";

    }
 
 
}
