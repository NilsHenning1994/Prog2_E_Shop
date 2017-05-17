package eshop.Datenstrukturen;

public class Massengutartikel extends Artikel{

	private int packungsgroeße;

	public Massengutartikel(String bez, int nr, int preis, int bestand, int packungsgroeße) {
		super(bez, nr, preis, bestand);
		this.setPackungsgroeße(packungsgroeße);
	}
	
	public String toString() {
		return ( "Nummer: "+ getNummer() + " | Bezeichnung: " + getBez() + " | Preis: "+ getPreis() + " | Bestand: " + getBestand() + " | Packungsgroeße: " + getPackungsgroeße() );
	}

	public int getPackungsgroeße() {
		return packungsgroeße;
	}

	public void setPackungsgroeße(int packungsgroeße) {
		this.packungsgroeße = packungsgroeße;
	}
	
}
