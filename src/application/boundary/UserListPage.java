package application.boundary;

import java.net.URL;
import java.util.ResourceBundle;

import application.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class UserListPage implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<User> userTable;

    @FXML
    private TableColumn<User, String> nameColumn;

    @FXML
    private TableColumn<User, String> surnameColumn;

    @FXML
    private TableColumn<User, String> emailColumn;

    @FXML
    private Button backButton;

    @FXML
    void backButtonControl(ActionEvent event) {

    }
    
    public void showUserListPage(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Login Page");
			
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }


	
	public ObservableList<User> getUser(){
		ObservableList<User> l = FXCollections.observableArrayList(); 
		l.add(new User("Luigi", "Napolitano", "luigi.napolitano@hotmail.it")); 
		l.add(new User("Grazia", "Napolitano", "gr.napolitano@hotmail.i")); 
		return l; 
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		nameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("surname"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
		userTable.setItems(getUser());
		
	}
}
