package eshop.Datenstrukturen;

public class Massengutartikel extends Artikel{

	private int packungsgroesse;

	public Massengutartikel(String bez, int nr, int preis, int bestand, int packungsgroesse) {
		super(bez, nr, preis, bestand);
		this.setPackungsgroesse(packungsgroesse);
	}
	
	public String toString() {
		return ( "Nummer: "+ getNummer() + " | Bezeichnung: " + getBez() + " | Preis: "+ getPreis() + " | Bestand: " + getBestand() + " | Packungsgroeße: " + getPackungsgroesse() );
	}

	public int getPackungsgroesse() {
		return packungsgroesse;
	}

	public void setPackungsgroesse(int packungsgroesse) {
		this.packungsgroesse = packungsgroesse;
	}
	
}
