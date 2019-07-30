package application.boundary;

import java.util.List;

import application.entity.Article;
import application.entity.ArticleProfit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class StaticsProductPage {

    @FXML
    private Tab venditeTab;

    @FXML
    private TableView<ArticleProfit> venditeTable;

    @FXML
    private TableColumn<ArticleProfit, String> articoloColumn;

    @FXML
    private TableColumn<ArticleProfit, Float> importoColumn;

    @FXML
    private PieChart venditeChart;

    @FXML
    private Tab venditeMensiliTab;

    @FXML
    private LineChart<?, ?> venditeMensiliChart;
    
    public void showStaticsProductPage(ActionEvent event, List<ArticleProfit> l ) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/StaticsProductPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Statics Product Page");
			StaticsProductPage p = loader.getController(); 
			p.InitData(l);
			s.show();
	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    
    public void InitData(List<ArticleProfit> l ) {
    	
    	articoloColumn.setCellValueFactory(new PropertyValueFactory<ArticleProfit,String>("articleName"));
    	importoColumn.setCellValueFactory(new PropertyValueFactory<ArticleProfit,Float>("profit"));
    	venditeTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY); 
    	ObservableList<ArticleProfit> observableArticleProfitList = FXCollections.observableArrayList(l);
    	venditeTable.setItems(observableArticleProfitList);
    	ObservableList<Data> pieChartObservableList = FXCollections.observableArrayList(); 
    	for(ArticleProfit x : l ) {
    		PieChart.Data data = new Data(x.getArticleName(), x.getProfit()); 
    		pieChartObservableList.add(data); 
    	}
    	venditeChart.setData(pieChartObservableList);
    	
    }

}
