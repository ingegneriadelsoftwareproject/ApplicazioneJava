package application.boundary;

import java.net.URL;
import java.sql.Date;
import java.util.List;
import java.util.ResourceBundle;
import application.controller.UserPageController;
import application.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
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
    
    public static ObservableList<User> observableUserList = FXCollections.observableArrayList(); 
    
    public static List<User> userList; 

    @FXML
    void backButtonControl(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @FXML
    void userClicckedControl(MouseEvent event) {
    	
    	
    	User u = userTable.getSelectionModel().getSelectedItem(); 
    	UserPageController p = new UserPageController(); 
    	p.userRowPressed(event,u);
    	//((Node)(event.getSource())).getScene().getWindow().hide();
    	
    }
    
    
    /**
     * metodo per mostrare la finestra UserListPage
     * @param event click del bottone cerca
     * @param l lista di utenti trovati 
     */
    public void showUserListPage(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User List Page");
			UserListPage p = loader.getController(); 
			p.initData(userList);
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

     
   
    public void setUserList(List<User> l ) {
    	UserListPage.userList = l;  
    }
    
    public static void updateUserList ( User u ) {
    	observableUserList.remove(u); 
    }
     @SuppressWarnings("unchecked")
	public void initData(List<User> l ) {
    	
    	
    	nameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("surname"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
		birthColumn.setCellValueFactory(new PropertyValueFactory<User,Date>("birthDate"));
		usernameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("userName"));
		userTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		observableUserList.setAll(l);
		observableUserList.addListener(new ListChangeListener() {

			@Override
			public void onChanged(Change change) {
				// TODO Auto-generated method stub
				while (change.next()) {

					System.out.println("Was added? " + change.wasAdded());

					System.out.println("Was removed? " + change.wasRemoved());

					}
			}
			
		});
		userTable.setItems(observableUserList);//va passata una observable list
		
    }
 
}
