package eshop.Datenstrukturen;

import java.util.Date;

public class Ereignis {

	
	private Artikel artikel;
	private int anz;
	private Date einlagerung;
	private Date auslagerung;
	private Mitarbeiter mitarbeiter;
	private Kunde kunde;
	
	
	
	
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
	
	
	
}
