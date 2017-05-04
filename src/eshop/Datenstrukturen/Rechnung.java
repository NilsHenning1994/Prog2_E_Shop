package eshop.Datenstrukturen;

import java.util.Date;
import java.util.List;

import javax.print.attribute.DateTimeSyntax;

public class Rechnung {

	private Kunde kunde;
	private Warenkorb warenkorb;
//	private WarenkorbEintrag we;
	private Date datum;
	private List<Artikel> artikelListe;
	private Artikel artikel;
	private int bestand;
	private int preisinfo;
	private int gesamtpreis;
	
	
	
	public Rechnung(Kunde kunde, Warenkorb warenkorb, WarenkorbEintrag we, Date datum, List<Artikel> artikelListe,
			Artikel artikel, int bestand, int preisinfo, int gesamtpreis) {
		super();
		this.kunde = kunde;
		this.warenkorb = warenkorb;
		this.we = we;
		this.datum = datum;
		this.artikelListe = artikelListe;
		this.artikel = artikel;
		this.bestand = bestand;
		this.preisinfo = preisinfo;
		this.gesamtpreis = gesamtpreis;
	}
	
	
	
	public Kunde getKunde() {
		return kunde;
	}
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	public Warenkorb getWarenkorb() {
		return warenkorb;
	}
	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}
	public WarenkorbEintrag getWe() {
		return we;
	}
	public void setWe(WarenkorbEintrag we) {
		this.we = we;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public List<Artikel> getArtikelListe() {
		return artikelListe;
	}
	public void setArtikelListe(List<Artikel> artikelListe) {
		this.artikelListe = artikelListe;
	}
	public Artikel getArtikel() {
		return artikel;
	}
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	public int getBestand() {
		return bestand;
	}
	public void setBestand(int bestand) {
		this.bestand = bestand;
	}
	public float getPreisinfo() {
		return preisinfo;
	}
	public void setPreisinfo(int preisinfo) {
		this.preisinfo = preisinfo;
	}
	public float getGesamtpreis() {
		return gesamtpreis;
	}
	public void setGesamtpreis(int gesamtpreis) {
		this.gesamtpreis = gesamtpreis;
	}
	
	
	
}