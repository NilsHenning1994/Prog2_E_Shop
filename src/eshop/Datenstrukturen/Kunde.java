package eshop.Datenstrukturen;

public class Kunde extends Benutzer {

	private Adresse adresse;	// Adresse des Kunden
	private Warenkorb cart;		// Artikelobjekt
	private boolean login;
	
	// Konstruktor der Klasse Kunde
	public Kunde(int id, String vorname, String nachname, String email, Adresse adresse, String passwort, boolean login) {
		super(id, vorname, nachname, email, passwort);
		this.adresse = adresse;
		this.cart = new Warenkorb(null);
		this.login = login;
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

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
	
	
}
