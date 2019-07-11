package application.boundary;

import java.net.URL;
import java.sql.Date;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
/**
 * classe per la visualizzazione degli utenti a seguito di una ricerca,
 * gli utenti trovati vengono visualizzati in una tabella
 * 
 * @author UTENTE
 *
 */
public class UserListPage   {

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
    private TableColumn<User,Date>  birthColumn; 
    
    @FXML
    private TableColumn<User,String> usernameColumn; 

    @FXML
    private Button backButton;

    @FXML
    void backButtonControl(ActionEvent event) {

    }
    
    @FXML
    void userClicckedControl(MouseEvent event) {
    	
    	/*
    	User u = userTable.getSelectionModel().getSelectedItem(); 
    	UserPage p = new UserPage(); 
    	p.showUserPage(event, u);
    	*/
    }
    
    
    /**
     * metodo per mostrare la finestra UserListPage
     * @param event click del bottone cerca
     * @param l lista di utenti trovati 
     */
    public void showUserListPage(ActionEvent event, ObservableList<User> l ) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User List Page");
			UserListPage p = loader.getController(); 
			p.initData(l);
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    //per provare la table view 
   
    /**
     * metodo per settare i valori della tableview
     * @param l lista di User
     */

     void initData(ObservableList<User> l ) {
    	
    	
    	nameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("surname"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
		birthColumn.setCellValueFactory(new PropertyValueFactory<User,Date>("birthDate"));
		usernameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("userName"));
		userTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		userTable.setItems(l);//va passata una observable list
		
    }
 
}
