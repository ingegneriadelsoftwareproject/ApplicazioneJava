package application.boundary;


import java.util.List;
import application.entity.ArticleProfit;
import application.entity.VenditeMensili;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.chart.XYChart;
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
    
    @FXML
    private CategoryAxis mounthAxis;

    @FXML
    private NumberAxis numberAxis;
    
    public void showStaticsProductPage(ActionEvent event, List<ArticleProfit> l, List<VenditeMensili> l2 ) {
    	try {
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("../fxml/StaticsProductPage.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage s = new Stage();
			s.setScene(scene);
			s.setTitle("Statics Product Page");
			StaticsProductPage p = loader.getController(); 
			p.InitData(l, l2);
			s.show();
	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    
    public void InitData(List<ArticleProfit> l , List<VenditeMensili> l2) {
    	
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
    	XYChart.Series serie = new XYChart.Series<>(); 
    	int i = 0 ; 
    	for ( i = 0; i<l2.size(); i++ ) {
    		
    		serie.getData().add(new XYChart.Data<>( l2.get(i).getMese().toString(), l2.get(i).getImporto() )); 
    	}
    
    	venditeMensiliChart.getData().add(serie); 
    	
    }

}
