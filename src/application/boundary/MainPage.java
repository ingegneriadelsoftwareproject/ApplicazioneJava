package application.boundary;
import java.sql.Date;

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
    	//per provare la userListPage
    	/*
    	ObservableList<User> l = FXCollections.observableArrayList();
    	l.add(new User("luigi", "Napolitano", "giggi@hotmail.it", "giggi0095", Date.valueOf("1995-05-09")));
    	l.add(new User("francesco", "de sapio", "francesco@libero.it", "spid14", Date.valueOf("1991-12-10")));
    	UserListPage p = new UserListPage();
    	p.showUserListPage(event, l);
        */
    	
    	DeleteSuccesPage p = new DeleteSuccesPage(); 
    	p.showDeleteSuccessPage(event);
    	
    
    }

}
