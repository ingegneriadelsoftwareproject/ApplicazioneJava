package application.boundary;

import application.controller.StaticsProductController;
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
    	((Node)(event.getSource())).getScene().getWindow().hide();

    }
    
    public void showProductCategoryListPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/application/fxml/ProductCategoryListPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Product Category List Page");
			s.show();
			//((Node)(event.getSource())).getScene().getWindow().hide();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    @FXML
    void abbigliamentoLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = abbigliamentoLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void alimentariLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = alimentariLink.getText();
    	p.linkCategoryPressed(event, linkPressed);
    }

    @FXML
    void autoMotoLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = autoMotoLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

  

    @FXML
    void casaCucinaLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = casaCucinaLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void elettronicaLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = elettronicaLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void faiDaTeLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = faiDaTeLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void giardinoLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = giardinoLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void gioielliLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = gioielliLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }
    

    @FXML
    void informaticaLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = informaticaLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void scarpeBorseLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = scarpeBorseLink.getText();
    	p.linkCategoryPressed(event,linkPressed);

    }

    @FXML
    void sportLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = sportLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }

    @FXML
    void videoGiochiLinkCliccked(ActionEvent event) {
    	StaticsProductController p = new StaticsProductController(); 
    	String linkPressed = videogiochiLink.getText();
    	p.linkCategoryPressed(event,linkPressed);
    }
   

}
