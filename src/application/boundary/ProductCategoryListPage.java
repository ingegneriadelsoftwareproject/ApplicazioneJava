package application.boundary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class ProductCategoryListPage {

    @FXML
    private Hyperlink abbigliamentoLink;

    @FXML
    private Hyperlink alimentariLink;

    @FXML
    private Hyperlink autoMotoLink;

    @FXML
    private Hyperlink casaCucinaLink;

    @FXML
    private Hyperlink elettronicaLink;

    @FXML
    private Hyperlink faiDaTeLink;

    @FXML
    private Hyperlink giardinoLink;

    @FXML
    private Hyperlink gioielliLink;

    @FXML
    private Hyperlink informaticaLink;

    @FXML
    private Hyperlink videogiochiLink;

    @FXML
    private Hyperlink sportLink;

    @FXML
    private Hyperlink scarpeBorseLink;

    @FXML
    private Button backButton;

    @FXML
    void backButtonControl(ActionEvent event) {

    }
    
    public void showProductCategoryListPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/ProductCategoryListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Product Category List Page");
			s.show();
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
