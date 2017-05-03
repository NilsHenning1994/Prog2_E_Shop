package eshop.Datenstrukturen;

public class WarenkorbEintrag {

	private Artikel artikel;
	private int stueckzahl;
	
	public WarenkorbEintrag(Artikel artikel, int stueckzahl) {
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
