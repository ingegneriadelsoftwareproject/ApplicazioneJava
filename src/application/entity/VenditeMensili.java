package application.entity;



public class VenditeMensili {
	
	
	public enum Mese {
		Gennaio,
		Febbraio, 
		Marzo, 
		Aprile, 
		Maggio, 
		Giugno, 
		Luglio, 
		Agosto, 
		Settembre, 
		Ottobre, 
		Novembre, 
		Dicembre
	}
	
	Mese mese; 
	Float importo;

	public VenditeMensili(Mese mese, Float importo) {
		super();
		this.mese = mese;
		this.importo = importo;
	}
	public Mese getMese() {
		return mese;
	}
	public void setMese(Mese mese) {
		this.mese = mese;
	}
	public Float getImporto() {
		return importo;
	}
	public void setImporto(Float importo) {
		this.importo = importo;
	} 
	public static Mese readMese  (Integer i ) {
		
		switch(i) {
		case 1 :
			return Mese.valueOf("Gennaio"); 
		case 2 : 
			return Mese.valueOf("Febbraio"); 
		case 3 : 
			return Mese.valueOf("Marzo"); 
		case 4 : 
			return Mese.valueOf("Aprile"); 
		case 5 : 
			return Mese.valueOf("Maggio"); 
		case 6 :
			return Mese.valueOf("Giugno"); 
		case 7 :
			return Mese.valueOf("Luglio");  
		case 8: 
			return Mese.valueOf("Agosto");   
		case 9: 
			return Mese.valueOf("Settembre");   
		case 10: 
			return Mese.valueOf("Ottobre"); 
		case 11: 
			return Mese.valueOf("Novembre");
		case 12: 
			return Mese.valueOf("Dicembre");   
		
		}
		return null;
		
		
	}
}
