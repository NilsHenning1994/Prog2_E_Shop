package eshop;

import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Anwendungslogik.KundenVerwaltung;
import eshop.Anwendungslogik.MitarbeiterVerwaltung;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Datenstrukturen.Rechnung;

public class Shop {

	private ArtikelVerwaltung av;
	private MitarbeiterVerwaltung mv;
	private KundenVerwaltung kv;
	
	public Shop() {
		av = new ArtikelVerwaltung();
		mv = new MitarbeiterVerwaltung(null, null, av, null);
		kv = new KundenVerwaltung();
	}
	
	public void artikelInWarenkorb(Kunde k, Artikel a, int anz){
		
	}
	
	public Rechnung warenkorbKaufen(Kunde k){
		return null;
	}
	
	public void artikelAnlegen(Artikel artikel){
		av.getArtikelListe().add(artikel);
	}
}