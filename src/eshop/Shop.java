package eshop;

import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Anwendungslogik.KundenVerwaltung;
import eshop.Anwendungslogik.MitarbeiterVerwaltung;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Datenstrukturen.Rechnung;

public class Shop {

	private ArtikelVerwaltung av;
	private MitarbeiterVerwaltung mv;
	private KundenVerwaltung kv;

	Artikel testArtikel = new Artikel("Apfel",1,2,10);
	Artikel testArtikel1 = new Artikel("Birne",1,3,11);
	Artikel testArtikel2 = new Artikel("Kokusnuss",4,5,6);
	Artikel testArtikel3 = new Artikel("Banane",6,7,4);


	public Shop() {
		av = new ArtikelVerwaltung();
		mv = new MitarbeiterVerwaltung();
		kv = new KundenVerwaltung();
	}

	public void artikelInWarenkorb(Kunde k, Artikel a, int anz){

	}

	public Rechnung warenkorbKaufen(Kunde k){

		return null;
	}

	public void artikelAnlegen(Mitarbeiter mitarbeiter, Artikel artikel){
		av.getArtikelListe().add(artikel);
	}

	//	Mitarbeiter Methoden ----->

	// Mitarbeiter Registrieren 
	public boolean mitarbeiterRegi(String vorname,String nachname,String mail,String passwort){
		return mv.registrieren(vorname, nachname, mail, passwort);
	}

	// Mitarbeiter einloggen
	public Mitarbeiter mitarbeiterEinloggen(String mail, String passwort){
		return mv.einloggen(mail, passwort);
	}

	// Mitarbeiter ausloggen
	public void mitarbeiterAusloggen(Mitarbeiter mitarbeiter){
		mv.ausloggen(mitarbeiter);
	}

	// Mitarbeiter Bestand von Artikel erhoehen

	public void mitBestandErhoehen(Mitarbeiter mitarbeiter,Artikel artikel,int anz){
		av.bestandErhoehen(mitarbeiter, artikel, anz);
	}


	//	 Kunden Methoden ----->

	// Kunde registrieren
	public boolean kundeRegi(String vorname, String nachname, String mail, String passwort, Adresse adresse){
		return kv.registrieren(vorname, nachname, mail, passwort, adresse);
	}

	// Kunde einloggen
	public Kunde kundeEinloggen(String mail, String passwort){
		return kv.einloggen(mail, passwort);
	}

	// Kunde ausloggen
	public void kundeAusloggen(Kunde kunde){
		kv.ausloggen(kunde);
	}

	//	Artikel Methoden ---->

	public Artikel bestandAendern(Mitarbeiter ma, Artikel ar, int anz){
		av.bestandErhoehen(ma, ar, anz);

		return ar;
	}

	public void artikelAnlegen(Mitarbeiter mitarbeiter, String bez, int nummer, int preis, int bestand){
		
	}

}