package application.boundary;

import java.util.Date;


import java.util.List;

import application.controller.OrderListController;

import application.entity.Order;
import application.entity.PreferencesStaticsUser;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * pagina che visualizza le statistiche su un utente
 * in questa pagina viene visualizzata la lista degli ordini e le preferenze di acquisto dell'utente
 * @author UTENTE
 *
 */
public class UserStaticsPage {

    @FXML
    private Tab OrdiniTab;  // tab statistiche sugli ordini 
    
    @FXML
    private Tab PreferenzeTab; // tab statistiche relative alle preferenze 
    
   
    @FXML
    private TableView<Order> ordiniTable;

    @FXML
    private TableColumn <Order, Integer>numOrdineColumn;

    @FXML
    private TableColumn <Order, Integer>numArticoliColumn;

    @FXML
    private TableColumn <Order, Date>dataColumn;
     

    @FXML
    private TableColumn <Order, Float> totaleColumn;
    
    @FXML
    private TableView<PreferencesStaticsUser> preferenzeTable;
    
    @FXML
    private TableColumn<PreferencesStaticsUser, String> categoriaPreferitaColumn;

    @FXML
    private TableColumn<PreferencesStaticsUser, Float> importoPreferenzeColumn;
    

    @FXML
    private PieChart preferenzeChart;
    /**
     * metodo per il controllo degli ordini
     * @param event
     */
    @FXML
    void orderCliccked(MouseEvent event) {
    	OrderListController p = new OrderListController(); 
    	String codeOrder = ordiniTable.getSelectionModel().getSelectedItem().getCode();
    	p.orderRowPressed(event, codeOrder);
    	//((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    public void showUserStaticsPage(ActionEvent event , List<Order> orderStaticsList, List<PreferencesStaticsUser>  preferencesList) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("/application/fxml/UserStaticsPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("User Statics Page");
			UserStaticsPage p = loader.getController(); 
			p.initData(orderStaticsList, preferencesList);
			s.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
  
    
    public void initData (List<Order> orderList, List<PreferencesStaticsUser> preferencesStatics) {
    	
    	
    	numOrdineColumn.setCellValueFactory(new PropertyValueFactory<Order,Integer>("code"));
    	numArticoliColumn.setCellValueFactory(new PropertyValueFactory<Order,Integer>("numeroArticoli"));
		dataColumn.setCellValueFactory(new PropertyValueFactory<Order,Date>("date"));
		totaleColumn.setCellValueFactory(new PropertyValueFactory<Order,Float>("total"));
		ordiniTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		ObservableList<Order> observableListOrderStatics = FXCollections.observableArrayList(orderList); 
		ordiniTable.setItems(observableListOrderStatics);
		
		
		
		categoriaPreferitaColumn.setCellValueFactory(new PropertyValueFactory<PreferencesStaticsUser,String>("categoria"));
		importoPreferenzeColumn.setCellValueFactory(new PropertyValueFactory<PreferencesStaticsUser, Float>("importo"));
		preferenzeTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		ObservableList<PreferencesStaticsUser> observavbleListPreferences = FXCollections.observableArrayList(preferencesStatics); 
		preferenzeTable.setItems(observavbleListPreferences);
		ObservableList<Data> observableListChart = FXCollections.observableArrayList(); 
		for(PreferencesStaticsUser x : preferencesStatics) {
			PieChart.Data data = new Data(x.getCategoria(), x.getImporto()); 
			observableListChart.add(data); 
		}
		
		preferenzeChart.setData(observableListChart);
    }
    

}
