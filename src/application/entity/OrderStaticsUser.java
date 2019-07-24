package application.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * classe per settare i valori della table view delle statistiche sugli ordine dell'utente
 * @author UTENTE
 *
 */
public class OrderStaticsUser {
	
	private Order ordine; 
	private List<Category> categorie;
	

	public OrderStaticsUser(Order ordine, List<Category> categorie) {
		super();
		this.ordine = ordine;
		this.categorie = categorie;
	}
	public Order getOrdine() {
		return ordine;
	}
	public void setOrdine(Order ordine) {
		this.ordine = ordine;
	}
	public List<Category> getCategorie() {
		return categorie;
	}
	public void setCategorie(LinkedList<Category> categorie) {
		this.categorie = categorie;
	}
	



}
