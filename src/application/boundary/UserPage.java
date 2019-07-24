package application.boundary;

import application.controller.UserPageController;
import application.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UserPage {

    @FXML
    private Label usernameLabel;

    @FXML
    private Label birthDateLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label nameLabel;
    
    @FXML
    private Label surnameLabel; 

    @FXML
    private Button deleteButton;

    @FXML
    private Button viewStaticsButton;
    
    private  static User u ;
    
    public void setUser(User u2 ) {
    	this.u = new User(); 
    	u = u2; 
    	
    }
  

    @FXML
    void deleteButtonControl(ActionEvent event) {
    	UserPageController p = new UserPageController(); 
    	p.deleteUserButtonPressed(event, u);
    	((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void viewStaticsButtonControl(ActionEvent event) {
    	UserPageController p = new UserPageController(); 
    	p.viewStaticsButtonPressed(event, UserPage.u);
    	//((Node)(event.getSource())).getScene().getWindow().hide();

    }
    /**
     * metodo per mostrare la pagina di un Utente 
     * 
     * @param event  evento 
     * @param u Utente di cui si vogliono mostrare le informazioni 
     */
    
    public void showUserPage ( MouseEvent event ) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User Page");
			UserPage p = loader.getController(); 
			p.initData(u);
			s.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    void initData(User u) {
    	
    	nameLabel.setText(u.getName().toString());
    	surnameLabel.setText(u.getSurname().toString());
    	usernameLabel.setText(u.getUserName().toString());
    	birthDateLabel.setText(u.getBirthDate().toString());
    	emailLabel.setText(u.getEmail().toString());
    	
    }

}
