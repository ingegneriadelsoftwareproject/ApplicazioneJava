package application.boundary;

import application.controller.LoginFailledCredenzialiErrateController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * pagina di errore per credenziali errate
 * @author UTENTE
 *
 */
public class LoginFailledCredenzialiErrate {

    @FXML
    private Button okButton;

    @FXML
    void okButtonControl(ActionEvent event) {
    	
    	LoginFailledCredenzialiErrateController p = new LoginFailledCredenzialiErrateController(); 
    	p.oKButtonCredenzialiErrattePressed(event);
    	((Node)(event.getSource())).getScene().getWindow().hide();

    }
    
    public void showLoginFailledCredenzialiErrate(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/application/fxml/LoginFailledCredenzialiErrate.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Credenziali errate !");
			s.show();
		
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
