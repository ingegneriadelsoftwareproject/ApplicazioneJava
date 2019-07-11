package application.boundary;

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

    @FXML
    void deleteButtonControl(ActionEvent event) {

    }

    @FXML
    void viewStaticsButtonControl(ActionEvent event) {

    }
    /**
     * metodo per mostrare la pagina di un Utente 
     * 
     * @param event  evento 
     * @param u Utente di cui si vogliono mostrare le informazioni 
     */
    
    public void showUserPage ( MouseEvent event , User u ) {
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
