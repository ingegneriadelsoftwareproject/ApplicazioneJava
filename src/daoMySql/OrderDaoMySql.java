package daoMySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import application.entity.VenditeMensili;
import dao.OrderDao;

public class OrderDaoMySql extends OrderDao {

	@Override
	public List<VenditeMensili> readVenditeMensili(String categoryName) {
		List<VenditeMensili> l = new LinkedList<>();  
		ResultSet st = null; 
		String statement = "SELECT month("+ DbsSchema.ORDER_DATE_COLUMN + "),"+ "SUM(" + DbsSchema.ARTICLE_PRICE_COLUMN + ")" +
							" FROM " + DbsSchema.DBS_NAME + "." + DbsSchema.ORDER_TABLE+ " JOIN " + DbsSchema.DBS_NAME + "." + DbsSchema.ORDER_LIST_TABLE +
							" ON " + DbsSchema.ORDER_CODE_COLUMN + "=" + DbsSchema.ORDER_LIST_CODE_ORDER_COLUMN + " JOIN " +
							DbsSchema.ARTICLE_TABLE + " ON " + DbsSchema.ARTICLE_TABLE+ "." + DbsSchema.ARTICLE_CODE_COLUMN + "=" + DbsSchema.ORDER_LIST_TABLE + "." + DbsSchema.ORDER_LIST_CODE_ARTICLE_COLUMN +
							" JOIN " + DbsSchema.CATEGORY_TABLE + " ON " + DbsSchema.ARTICLE_TABLE + "." + DbsSchema.ARTICLE_CATEGORYCODE_COLUMN + " = " + DbsSchema.CATEGORY_TABLE + "." + DbsSchema.CATEGORY_CODE_COLUMN +
							" WHERE " + DbsSchema.CATEGORY_TABLE + "." + DbsSchema.CATEGORY_NAME_COLUMN + " = " +  "\"" + categoryName + "\""; 
		System.out.println(statement); 
		st=DatabaseManagerMySql.getInstance().query(statement); 
		try {
			while(st.next()) {
				st.first(); 
				l.add(new VenditeMensili(VenditeMensili.readMese(st.getInt(1)), st.getFloat(2))); 
			}
		   }catch(SQLException e ) {
			   e.printStackTrace();
		}
		
		
		
		
		
		return l;
	}

}
