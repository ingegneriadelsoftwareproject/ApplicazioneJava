package application.boundary;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import application.controller.FindUserController;
import application.entity.Filter;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FindUserPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> productCategoryComboBox;

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
    	String Category = productCategoryComboBox.getValue(); 
    	String username= usernameTextField.getText(); 
    	LocalDate userdata = data.getValue(); 
    	Filter f = new Filter(Category,username,userdata); //passare categoria, username e data di nascita letti 
    	p.findUserButtonPressed(event, f);
    	
    	
    }
    //aggiungere metodo read per la lettura dei filtri 
    
    public void showFindUserPage(ActionEvent event, ObservableList<String> l) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/FindUserPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Find User Page");
			FindUserPage p = loader.getController(); 
			p.initData(l);
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    public void initData(ObservableList<String> l) {
    	
    	productCategoryComboBox.setItems(l);
    	
    }
    @FXML
    void initialize() {
        assert productCategoryComboBox != null : "fx:id=\"productCategoryComboBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert dataDiNascitaRadioBox != null : "fx:id=\"dataDiNascitaRadioBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert findButton != null : "fx:id=\"findButton\" was not injected: check your FXML file 'FindUserPage.fxml'.";

    }
}
