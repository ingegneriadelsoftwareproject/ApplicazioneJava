package application.boundary;

import java.util.Date;
import java.util.LinkedList;

import application.entity.Category;
import application.entity.Order;
import application.entity.OrderStaticsUser;
import application.entity.PreferencesStaticsUser;
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
    private Tab OrdiniTab;  // tab statistiche sugli ordini 
    
    @FXML
    private Tab PreferenzeTab; // tab statistiche relative alle preferenze 

    @FXML
    private TableView<OrderStaticsUser> ordiniTable;

    @FXML
    private TableColumn<Order, String > numOrdineColumn;

    @FXML
    private TableColumn<Order,Integer> numArticoliColumn;

    @FXML
    private TableColumn<Order, Date> dataColumn;

    @FXML
    private TableColumn<OrderStaticsUser, LinkedList<Category>> categoriaColumn;

    @FXML
    private TableColumn<Order, Float> totaleColumn;
    
    @FXML
    private TableView<PreferencesStaticsUser> preferenzeTable;
    
    @FXML
    private TableColumn<PreferencesStaticsUser, Category> categoriaPreferitaColumn;

    @FXML
    private TableColumn<PreferencesStaticsUser, Float> importoPreferenzeColumn;

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
