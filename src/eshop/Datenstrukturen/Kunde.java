package eshop.Datenstrukturen;

public class Kunde extends Benutzer {

//	private int kundennr;		// Die Kundennummer die einem Kunden zugewiesen wird
//	private String vorname;		// Vorname des Kunden
//	private String nachname;	// Nachname des Kunden
	private String adresse;		// Adresse des Kunden
		// -> Adresse-Klasse
	private Warenkorb cart;	// Artikelobjekt
	
	// Konstruktor der Klasse Kunde
	public Kunde(int id, String vorname, String nachname, String email, String adresse) {
		super(id, vorname, nachname, email);
//		this.kundennr = kundennr;
//		this.vorname = vorname;
//		this.nachname = nachname;
		this.adresse = adresse;
//		this.artikel = artikel;
//		this.stueckzahl = stueckzahl;
		this.cart = new Warenkorb();
	}
	
//	public void WarenkorbAendern(Artikel artikel, int stueckzahl) {
//		
//	}
//	
//	public void WarenkorbLoeschen() {
//		
//	}
//	
//	public void ArtikelInWarenkorbLegen() {
//		
//	}
	
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
