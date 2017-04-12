package eshop;

public class Warenkorb {

	private Artikel artikel;
	private int stueckzahl;
	public Warenkorb(Artikel artikel, int stueckzahl) {
		super();
		this.artikel = artikel;
		this.stueckzahl = stueckzahl;
	}
	
	
	
	
	public Artikel getArtikel() {
		return artikel;
	}
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	public int getStueckzahl() {
		return stueckzahl;
	}
	public void setStueckzahl(int stueckzahl) {
		this.stueckzahl = stueckzahl;
	}
	
	
}
