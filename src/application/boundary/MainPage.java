package application.boundary;


import java.net.URL;

import application.controller.MainPageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class MainPage {

    @FXML
    private Button makeLoginButton;
    
    @FXML
    private ImageView logoEc17;
    

    @FXML
    void loginButtonControl(ActionEvent event){
    	
    	MainPageController p = new MainPageController(); 
    	p.loginButtonPressed(event);
    	((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    public void showMainPage(ActionEvent event) {
      	try {
    			FXMLLoader loader = new FXMLLoader(); 
    			loader.setLocation(getClass().getResource("/application/fxml/MainPage.fxml"));
    			Parent root = loader.load();
    			Scene scene = new Scene(root);
    			Stage s = new Stage();
    			s.setScene(scene);
    			s.setTitle("Main Page");
    			MainPage p = loader.getController();
    			//p.InitData();
    			s.show();
    			//((Node)(event.getSource())).getScene().getWindow().hide();
    			
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    }
    
    public void InitData() {
    
    }

}
