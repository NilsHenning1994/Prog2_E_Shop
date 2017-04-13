package eshop.Datenstrukturen;

public class Warenkorb {

	private List<WarenkorbEintrag> eintraege = null;
//	private Artikel artikel;
//	private int stueckzahl;
	
	public Warenkorb() {
		// Liste erzeugen
	}

	public List<WarenkorbEintrag> getEintraege() {
		return eintraege;
	}

	public void setEintraege(List<WarenkorbEintrag> eintraege) {
		this.eintraege = eintraege;
	}
	
	public void addEintrag(WarenkorbEintrag eintrag) {
		this.eintraege.add(eintrag);
	}
	
//	public Artikel getArtikel() {
//		return artikel;
//	}
//	public void setArtikel(Artikel artikel) {
//		this.artikel = artikel;
//	}
//	public int getStueckzahl() {
//		return stueckzahl;
//	}
//	public void setStueckzahl(int stueckzahl) {
//		this.stueckzahl = stueckzahl;
//	}
	
	
}
