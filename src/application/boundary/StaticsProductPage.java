package application.boundary;

import application.entity.Article;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class StaticsProductPage {

    @FXML
    private Tab venditeTab;

    @FXML
    private TableView<Article> venditeTable;

    @FXML
    private TableColumn<Article, String> articoloColumn;

    @FXML
    private TableColumn<Article, Float> importoColumn;

    @FXML
    private PieChart venditeChart;

    @FXML
    private Tab venditeMensiliTab;

    @FXML
    private LineChart<?, ?> venditeMensiliChart;
    
    public void showStaticsProductPage(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/StaticsProductPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Statics Product Page");
			s.show();
	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
