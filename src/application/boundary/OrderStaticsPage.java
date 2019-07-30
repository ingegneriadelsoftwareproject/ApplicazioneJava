package application.boundary;

import java.util.List;
import application.entity.Article;
import application.entity.ArticleCategoryName;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
	
	/**
	 * pagina che visualizza gli articoli e le informazioni dettagliate di un articolo 
	 * @author UTENTE
	 *
	 */
	public class OrderStaticsPage {

	    @FXML
	    private Label orderNumCode;

	    @FXML
	    private TableView<ArticleCategoryName> articleTable;

	    @FXML
	    private TableColumn<ArticleCategoryName, Integer> codeColumn;

	    @FXML
	    private TableColumn<ArticleCategoryName,String> categoryColumn;

	    @FXML
	    private TableColumn<ArticleCategoryName, Float> prezzoColumn;

	    @FXML
	    private TableColumn<ArticleCategoryName, String> descColumn;

	    @FXML
	    private TableColumn<ArticleCategoryName, String> dimColumn;

	    @FXML
	    private TableColumn<ArticleCategoryName, Integer> pesoColumn;
	    
	    @FXML
	    private TableColumn<ArticleCategoryName, String> nameColumn;

	    public void showOrderStaticsPage(MouseEvent event, String orderCode, List<ArticleCategoryName> l2 ) {
	     	try {
				FXMLLoader loader = new FXMLLoader(); 
				loader.setLocation(getClass().getResource("../fxml/OrderStaticsPage.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage s = new Stage();
				s.setScene(scene);
				s.setTitle("User List Page");
				OrderStaticsPage p = loader.getController(); 
				p.initData(l2, orderCode); 
				s.show();
				
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	    }
	
	
	public void initData ( List<ArticleCategoryName> ArticleList, String orderCode) {
		orderNumCode.setText(orderCode.toString());
		codeColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,Integer>("code"));
		categoryColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,String>("categoryName"));
		prezzoColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,Float>("price"));
		descColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,String>("description"));
		dimColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,String>("dimension"));
		pesoColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,Integer>("weight"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<ArticleCategoryName,String>("name"));
		articleTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		ObservableList<ArticleCategoryName> observableArticleList = FXCollections.observableArrayList(ArticleList);
		articleTable.setItems(observableArticleList);
		
	}
	
	
	
	
	
	
	
	
	}




