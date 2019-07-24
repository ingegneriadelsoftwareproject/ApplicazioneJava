package application.boundary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * pagina di successo quando si effettua il Login 
 * @author UTENTE
 *
 */
public class LoginOkPage {

    @FXML
    private Button okButton;

    @FXML
    void okButtonControl(ActionEvent event) {
    	
    ((Node)(event.getSource())).getScene().getWindow().hide();

    }
    
    public void showLoginOkPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/LoginOkPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Login Ok !");
			s.show();
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
