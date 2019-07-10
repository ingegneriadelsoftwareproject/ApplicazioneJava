package application.boundary;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import application.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class UserListPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TableView<User> userTable;

    @FXML
    private TableColumn <User,String> nomeColumn;

    @FXML
    private TableColumn <User,String> cognomeColumn;

    //@FXML
   // private TableColumn bithDateColumn;

    @FXML
    private TableColumn <User,String> mailColumn;

    //@FXML
    //private TableColumn usernameColumn;

    @FXML
    private Button backButton;

    @FXML
    void backButtonControl(ActionEvent event) {

    }
    /*
    public void setTable() {
    	
    	userTable = new TableView<User>();
    	nomeColumn = new TableColumn<User,String>("name"); 
    	cognomeColumn = new TableColumn<User,String>("surname");
    	mailColumn = new TableColumn<User,String>("email");
    	nomeColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	cognomeColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
    	mailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
    	userTable.getColumns().addAll(nomeColumn, cognomeColumn,mailColumn); 
    	
        ObservableList<User> values = FXCollections.
                observableArrayList();
        values.add(new User("Laura", "Verdi", "LauraVerdi@hotmail.it"));
        values.add(new User("Mario", "Rossi", "Mariorossi@gmail.com"));
        userTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        userTable.setItems(values);
        userTable.setVisible(true);

    }*/
    public void showUserListPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User List Page");
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    @FXML
    void initialize() {
        assert userTable != null : "fx:id=\"userTable\" was not injected: check your FXML file 'UserListPage.fxml'.";
        assert nomeColumn != null : "fx:id=\"nomeColumn\" was not injected: check your FXML file 'UserListPage.fxml'.";
        assert cognomeColumn != null : "fx:id=\"cognomeColumn\" was not injected: check your FXML file 'UserListPage.fxml'.";
        assert mailColumn != null : "fx:id=\"mailColumn\" was not injected: check your FXML file 'UserListPage.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'UserListPage.fxml'.";
    	userTable = new TableView<User>();
    	nomeColumn = new TableColumn<User,String>("name"); 
    	cognomeColumn = new TableColumn<User,String>("surname");
    	mailColumn = new TableColumn<User,String>("email");
    	nomeColumn.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
    	cognomeColumn.setCellValueFactory(new PropertyValueFactory<User,String>("surname"));
    	mailColumn.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
    	userTable.getColumns().addAll(nomeColumn, cognomeColumn,mailColumn); 
    	
        ObservableList<User> values = FXCollections.
                observableArrayList();
        values.add(new User("Laura", "Verdi", "LauraVerdi@hotmail.it"));
        values.add(new User("Mario", "Rossi", "Mariorossi@gmail.com"));
        userTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        userTable.setItems(values);

    }

 
}

