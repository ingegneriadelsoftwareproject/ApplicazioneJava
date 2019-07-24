package application.boundary;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import application.entity.Category;
import application.entity.Order;
import application.entity.OrderStaticsUser;
import application.entity.PreferencesStaticsUser;
import application.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener.Change;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    

    @FXML
    private PieChart preferenzeChart;
    
    public static ObservableList<OrderStaticsUser> observableListOrderStatics = FXCollections.observableArrayList(); 
    public static ObservableList<PreferencesStaticsUser> observableListPreferenceStatics = FXCollections.observableArrayList();
    
    public static List<OrderStaticsUser> orderStaticsList; 
    public static List<PreferencesStaticsUser> preferencesStaticsList; 
    
    
    public void showUserStaticsPage(ActionEvent event ) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/UserStaticsPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User Statics Page");
			UserStaticsPage p = loader.getController(); 
			p.initData(orderStaticsList, preferencesStaticsList);
			s.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    public void setOrderList(List<OrderStaticsUser> l) {
    	UserStaticsPage.orderStaticsList=l; 
    }
    
    public void initData (List<OrderStaticsUser> orderList, List<PreferencesStaticsUser> preferencesStatics) {
    	numOrdineColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("code"));
		numArticoliColumn.setCellValueFactory(new PropertyValueFactory<Order,Integer>("numeroArticoli"));
		dataColumn.setCellValueFactory(new PropertyValueFactory<Order,Date>("date"));
		categoriaColumn.setCellValueFactory(new PropertyValueFactory<OrderStaticsUser,LinkedList<Category>>("categorie"));
		totaleColumn.setCellValueFactory(new PropertyValueFactory<Order,Float>("total"));
		ordiniTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		observableListOrderStatics.setAll(orderList); 
		observableListOrderStatics.addListener(new ListChangeListener() {
		
			@Override
			public void onChanged(Change change) {
				// TODO Auto-generated method stub
				while (change.next()) {

					System.out.println("Was added? " + change.wasAdded());

					System.out.println("Was removed? " + change.wasRemoved());

					}
			}
			
		});
		//ordiniTable.setItems(observableListOrderStatics);
		
    }
    

}
