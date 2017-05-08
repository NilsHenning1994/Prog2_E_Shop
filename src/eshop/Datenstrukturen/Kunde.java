package eshop.Datenstrukturen;

public class Kunde extends Benutzer {

	private Adresse adresse;	// Adresse des Kunden
	private Warenkorb cart;		// Artikelobjekt
	
	// Konstruktor der Klasse Kunde
	public Kunde(int id, String vorname, String nachname, String email, Adresse adresse, String passwort, boolean login) {
		super(id, vorname, nachname, email, passwort, login);
		this.adresse = adresse;
		this.cart = new Warenkorb(null);

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
	
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Warenkorb getCart() {
		return cart;
	}

	public void setCart(Warenkorb cart) {
		this.cart = cart;
	}

	
	
}
