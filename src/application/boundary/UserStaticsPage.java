package application.boundary;

import java.util.ArrayList;
import java.util.Date;

import application.entity.Category;
import application.entity.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class UserStaticsPage {

    @FXML
    private Tab OrdiniTab;

    @FXML
    private TableView<Order> ordiniTable;

    @FXML
    private TableColumn<Order, String> numOrdineColumn;

    @FXML
    private TableColumn<Order, Integer> numArticoliColumn;

    @FXML
    private TableColumn<Order, Date> dataColumn;

    @FXML
    private TableColumn<Order, ArrayList<Category>> categoriaColumn;

    @FXML
    private TableColumn<Order, Float> totaleColumn;

    @FXML
    private Tab PreferenzeTab;

    @FXML
    private TableView<Category> preferenzeTable;

    @FXML
    private TableColumn<Category, Float> importoColumn;

    @FXML
    private PieChart preferenzeChart;
    
    public void showUserStaticsPage(ActionEvent event ) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserStaticsPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User Statics Page");
			s.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
