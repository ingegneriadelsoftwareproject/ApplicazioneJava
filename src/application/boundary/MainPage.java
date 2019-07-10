package application.boundary;
import java.util.Locale;
import application.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainPage {

    @FXML
    private Button makeLoginButton;

    @FXML
    void loginButtonControl(ActionEvent event){
    	//per provare la userListPage
    	UserListPage p = new UserListPage(); 
    	p.showUserListPage(event);
        
    
    }

}
