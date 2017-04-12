package eshop;

public class Warenkorb {

	private Artikel artikel;
	private int stückzahl;
	public Warenkorb(Artikel artikel, int stückzahl) {
		super();
		this.artikel = artikel;
		this.stückzahl = stückzahl;
	}
	
	
	
	
	public Artikel getArtikel() {
		return artikel;
	}
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	public int getStückzahl() {
		return stückzahl;
	}
	public void setStückzahl(int stückzahl) {
		this.stückzahl = stückzahl;
	}
	
	
}
