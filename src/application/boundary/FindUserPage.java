package application.boundary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FindUserPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> productCategoryComboBox;

    @FXML
    private TextField usernameTextField;

    @FXML
    private RadioButton dataDiNascitaRadioBox;

    @FXML
    private ComboBox<?> birthDayBox;

    @FXML
    private ComboBox<?> birthMounthBox;

    @FXML
    private ComboBox<?> birthYearBox;

    @FXML
    private Button findButton;

    @FXML
    void findButtonControl(ActionEvent event) {

    }
    
    public void showFindUserPage(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/FindUserPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Find User Page");
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    @FXML
    void initialize() {
        assert productCategoryComboBox != null : "fx:id=\"productCategoryComboBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert dataDiNascitaRadioBox != null : "fx:id=\"dataDiNascitaRadioBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert birthDayBox != null : "fx:id=\"birthDayBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert birthMounthBox != null : "fx:id=\"birthMounthBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert birthYearBox != null : "fx:id=\"birthYearBox\" was not injected: check your FXML file 'FindUserPage.fxml'.";
        assert findButton != null : "fx:id=\"findButton\" was not injected: check your FXML file 'FindUserPage.fxml'.";

    }
}
