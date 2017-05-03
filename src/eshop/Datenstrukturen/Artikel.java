package eshop.Datenstrukturen;


/**
 * Klasse zur Repr‰sentation einzelner Artikel.
 * 
 * 
 */

public class Artikel {

	// Attribute zur Beschreibung eines Artikels:
	private String bez;
	private String nummer;
	private String preis;
	private boolean verfuegbar; 

	// nr, bez, preis, bestand
	public Artikel(String nr, String bez,  String preis) {
		nummer = nr;
		this.preis = preis;
		this.bez = bez;
	}

	/**
	 * Standard-Methode von Object ¸berschrieben.
	 * Methode wird immer automatisch aufgerufen, wenn ein Artikel-Objekt als String
     * benutzt wird (z.B. in println(buch);)
	 */

	public String toString() {

		return ( "Nummer: "+ getNummer() + " | Bezeichnung: " + getBez() + " | Preis: "+ getPreis() );
	}

	/**
	 * Standard-Methode von Object ¸berschrieben.
	 * Methode dient Vergleich von zwei Artikel-Objekten anhand ihrer Werte,
           d.h. Titel und Nummer.
	 */

	public boolean equals(Object andererArtikel) {
		if (andererArtikel instanceof Artikel) 
			return ((this.getNummer().equals(((Artikel) andererArtikel).getNummer())) 
					&& (this.getBez().equals(((Artikel) andererArtikel).getBez())));
		else
			return false;
	}

	/*
	 * Ab hier Accessor-Methoden
	 */

	public String getNummer() {
		return nummer;
	}

	public String getBez() {
		return bez;
	}

	public String getPreis(){
		return preis;
	}

	public void setBez(String bez) {
		this.bez = bez;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public void setPreis(String preis) {
		this.preis = preis;
	}

	public boolean isVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(boolean verfuegbar) {
		this.verfuegbar = verfuegbar;
	}


}