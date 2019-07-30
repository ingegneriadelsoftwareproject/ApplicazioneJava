package application.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * classe per settare i valori della table view delle statistiche sugli ordine dell'utente
 * @author UTENTE
 *
 */
public class OrderStaticsUser {
	
	private String code; 
	private String usernameUser; 
	private Date date; 
	private Float total; 
	private Integer numeroArticoli;
	private List<String> categorie;
	
	
	
	

	public OrderStaticsUser(String code, String usernameUser, Date date, Float total, Integer numeroArticoli,
			List<String> categorie) {
		super();
		this.code = code;
		this.usernameUser = usernameUser;
		this.date = date;
		this.total = total;
		this.numeroArticoli = numeroArticoli;
		this.categorie = categorie;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public String getUsernameUser() {
		return usernameUser;
	}
	public void setUsernameUser(String usernameUser) {
		this.usernameUser = usernameUser;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Integer getNumeroArticoli() {
		return numeroArticoli;
	}
	public void setNumeroArticoli(Integer numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
	}
	public List<String> getCategorie() {
		return categorie;
	}
	public void setCategorie(List<String> categorie) {
		this.categorie = categorie;
	}
	


	



}
