package dao;

import java.util.List;

import application.entity.VenditeMensili;

public abstract class  OrderDao {
	
	/**
	 * metodo che legge  l'importo guadagnato per mese, in una data categoria 
	 * @param categoryName
	 * @return
	 */
	public abstract List<VenditeMensili> readVenditeMensili(String categoryName); 

}
