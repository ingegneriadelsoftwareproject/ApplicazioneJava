package application.entity;

import java.util.LinkedList;

/**
 * classe per settare i valori della table view delle statistiche sugli ordine dell'utente
 * @author UTENTE
 *
 */
public class OrderStaticsUser {
	
	private Order ordine; 
	private LinkedList<Category> categorie;
	
	
	public Order getOrdine() {
		return ordine;
	}
	public void setOrdine(Order ordine) {
		this.ordine = ordine;
	}
	public LinkedList<Category> getCategorie() {
		return categorie;
	}
	public void setCategorie(LinkedList<Category> categorie) {
		this.categorie = categorie;
	} 

}
