package eshop.Datenstrukturen;

public class Kunde {

	private int kundennr;		// Die Kundennummer die einem Kunden zugewiesen wird
	private String vorname;		// Vorname des Kunden
	private String nachname;	// Nachname des Kunden
	private String adresse;		// Adresse des Kunden
	private Artikel artikel;	// Artikelobjekt
	private int stueckzahl;		// Anzahl des Artikelobjektes
	
	// Konstruktor der Klasse Kunde
	public Kunde(int kundennr, String vorname, String nachname, String adresse, Artikel artikel, int stueckzahl) {
		super();
		this.kundennr = kundennr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
		this.artikel = artikel;
		this.stueckzahl = stueckzahl;
	}
	
	public void WarenkorbAendern(Artikel artikel, int stueckzahl) {
		
	}
	
	public void WarenkorbLoeschen() {
		
	}
	
	public void ArtikelInWarenkorbLegen() {
		
	}
	
	
	public int getKundennr() {
		return kundennr;
	}


	public void setKundennr(int kundennr) {
		this.kundennr = kundennr;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


}
