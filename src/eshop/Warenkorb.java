package eshop;

public class Warenkorb {

	private Artikel artikel;
	private int st�ckzahl;
	public Warenkorb(Artikel artikel, int st�ckzahl) {
		super();
		this.artikel = artikel;
		this.st�ckzahl = st�ckzahl;
	}
	
	
	
	
	public Artikel getArtikel() {
		return artikel;
	}
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	public int getSt�ckzahl() {
		return st�ckzahl;
	}
	public void setSt�ckzahl(int st�ckzahl) {
		this.st�ckzahl = st�ckzahl;
	}
	
	
}
