package application.entity;


import java.util.Date;

public class Order {
	private String code; 
	private String usernameUser; 
	private Date date; 
	private Float total; 
	private Integer numeroArticoli;// DA AGGIUNGERE AL DATABASE
	


	

	public void setTotal(Float total) {
		this.total = total;
	}

	public Order (String cod, String name, Date data, float total, Integer numeroArt) {
		this.code=cod; 
		this.usernameUser=name; 
		this.date=data; 
		this.total= total; 
		this.numeroArticoli=numeroArt;
		
	}

	public Integer getNumeroArticoli() {
		return numeroArticoli;
	}

	public void setNumeroArticoli(Integer numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
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

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}
