package application.entity;
/**
 * classe per settare i valori della table view sulle preferenze dell'utente
 * @author UTENTE
 *
 */
public class PreferencesStaticsUser {
	
	private Category categoria; 
	private Float importo;
	
	public PreferencesStaticsUser(Category categoria, Float importo) {
		super();
		this.categoria = categoria;
		this.importo = importo;
	}
	
	public Category getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}
	
	public Float getImporto() {
		return importo;
	}
	
	public void setImporto(Float importo) {
		this.importo = importo;
	}

}
