package application.entity;

import javafx.scene.chart.PieChart;

/**
 * classe per settare i valori della table view sulle preferenze dell'utente
 * @author UTENTE
 *
 */
public class PreferencesStaticsUser  {
	
	private String categoria; 
	private Float importo;
	
	
	public PreferencesStaticsUser(String categoria, Float importo) {
		super();
		this.categoria = categoria;
		this.importo = importo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getImporto() {
		return importo;
	}
	
	public void setImporto(Float importo) {
		this.importo = importo;
	}

}
