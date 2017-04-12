package eshop.Datenstrukturen;
import java.util.Date;

public class Bestand {
	
	private Artikel artikel;
	private int anzahl;
	private Date einlagerung;
	private Date auslagerung;
	private int[] Artikelbestand = new int[15];
	
	
	public Bestand(Artikel artikel, int anzahl, Date einlagerung,
			Date auslagerung) {
		super();
		this.artikel = artikel;
		this.anzahl = anzahl;
		this.einlagerung = einlagerung;
		this.auslagerung = auslagerung;
	}


	public Artikel getArtikel() {
		return artikel;
	}


	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}


	public int getAnzahl() {
		return anzahl;
	}


	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
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


	public void setArtikelbestand(int artikel) {
		this.Artikelbestand[0] = artikel;
	}


	public int[] getArtikelbestand() {
		return Artikelbestand;
	}
	
	
	
	
}
