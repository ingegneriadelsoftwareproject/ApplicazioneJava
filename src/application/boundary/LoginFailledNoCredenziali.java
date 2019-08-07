package application.boundary;

import application.controller.LoginFailledNoConnessioneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * pagina di errore per credenziali non inserite 
 * @author UTENTE
 *
 */
public class LoginFailledNoCredenziali {

    @FXML
    private Button okButton;

    @FXML
    void okButtonControl(ActionEvent event) {
    	LoginFailledNoConnessioneController p = new LoginFailledNoConnessioneController(); 
    	p.okButtonNoConnessionePressed(event);
    	((Node)(event.getSource())).getScene().getWindow().hide();

    }
    public void showLoginFailledNoCredenziali(ActionEvent event) {
     	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/application/fxml/LoginFailledNoCredenziali.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Campi vuoti!");
			s.show();
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
