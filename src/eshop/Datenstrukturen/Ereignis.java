package eshop.Datenstrukturen;

import java.util.Date;

public class Ereignis {

	
	private Artikel artikel;
	private int anz;
	private Date einlagerung;
	private Date auslagerung;
	private Mitarbeiter mitarbeiter;
	private Kunde kunde;
	
/*	
	private Date wann;
	private Benutzer user;
	private ??? aktion;	// -> enum!?
*/	
	
	
	public Ereignis(Artikel artikel, int anz, Date einlagerung, Date auslagerung, Mitarbeiter mitarbeiter,
			Kunde kunde) {
		super();
		this.artikel = artikel;
		this.anz = anz;
		this.einlagerung = einlagerung;
		this.auslagerung = auslagerung;
		this.mitarbeiter = mitarbeiter;
		this.kunde = kunde;
		
		
	}




	public int getAnz() {
		return anz;
	}




	public void setAnz(int anz) {
		this.anz = anz;
	}




	public Date getEinlagerung() {
		return einlagerung;
	}




	public void setEinlagerung(Date einlagerung) {
		this.einlagerung = einlagerung;
	}




	public Date getAuslagerung() {
		return auslagerung;
	}




	public void setAuslagerung(Date auslagerung) {
		this.auslagerung = auslagerung;
	}
	
	
	
	
}
