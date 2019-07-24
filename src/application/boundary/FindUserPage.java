package application.boundary;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.controller.FindUserController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * visualizza la pagina per fare la ricerca di un utente
 * @author UTENTE
 *
 */
public class FindUserPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private TextField usernameTextField;

    @FXML
    private RadioButton dataDiNascitaRadioBox;

    @FXML
    private DatePicker data;
    
    @FXML
    private Label datalabel;

    @FXML
    void dataControl(ActionEvent event) {
    
    }
    @FXML
    private Button findButton;

    @FXML
    void findButtonControl(ActionEvent event) {
    	
    	FindUserController p = new FindUserController();  
    	String username= usernameTextField.getText();
    	boolean radioBox = dataDiNascitaRadioBox.isSelected(); 
    	LocalDate userdata = data.getValue();  
    	p.findUserButtonPressed(event, username, userdata, radioBox);
    	
    	
    }
    //aggiungere metodo read per la lettura dei filtri 
    
    public void showFindUserPage(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/FindUserPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Find User Page");
			FindUserPage p = loader.getController(); 
			//p.initData(l);
			s.show();
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    public void initData() {
    
    }
    @FXML
    void initialize() {
      
        assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert dataDiNascitaRadioBox != null : "fx:id=\"dataDiNascitaRadioBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert findButton != null : "fx:id=\"findButton\" was not injected: check your FXML file 'FindUserPage.fxml'.";

    }
}
