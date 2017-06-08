package eshop.Datenstrukturen;


/**
 * Klasse zur Repr‰sentation einzelner Artikel.
 * 
 * 
 */

public class Artikel {

	// Attribute zur Beschreibung eines Artikels:
	private String bez;
	private int nummer;
	private float preis;
	private int bestand;

	// nr, bez, preis, bestand
	public Artikel(String bez, int nr, float preis, int bestand) {
		this.nummer = nr;
		this.preis = preis;
		this.bez = bez;
		this.bestand = bestand;
	}

	/**
	 * Standard-Methode von Object ¸berschrieben.
	 * Methode wird immer automatisch aufgerufen, wenn ein Artikel-Objekt als String
     * benutzt wird (z.B. in println(buch);)
	 */

	public String toString() {

		return ( "Nummer: "+ getNummer() + " | Bezeichnung: " + getBez() + " | Preis: "+ getPreis() + " | Bestand: " + getBestand() );
	}

	/**
	 * Standard-Methode von Object ¸berschrieben.
	 * Methode dient Vergleich von zwei Artikel-Objekten anhand ihrer Werte,
           d.h. Titel und Nummer.
	 */

	public boolean equals(Object andererArtikel) {
		if (andererArtikel instanceof Artikel) 
			return ((this.getNummer() ==(((Artikel) andererArtikel).getNummer())) 
					&& (this.getBez().equals(((Artikel) andererArtikel).getBez())));
		else
			return false;
	}

	/*
	 * Ab hier Accessor-Methoden
	 */

	
	

	

	public String getBez() {
		return bez;
	}

	public void setBez(String bez) {
		this.bez = bez;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preisinfo) {
		this.preis = preisinfo;
	}

	public int getBestand() {
		return bestand;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
	}




}