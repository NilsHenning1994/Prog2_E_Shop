package eshop;

import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Anwendungslogik.KundenVerwaltung;
import eshop.Anwendungslogik.MitarbeiterVerwaltung;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
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
	public void mitarbeiterAusloggen(Benutzer mitarbeiter){
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
	public void kundeAusloggen(Benutzer user){
		kv.ausloggen(user);
	}

	//	Artikel Methoden ---->

	public Artikel bestandAendern(Mitarbeiter ma, Artikel ar, int anz){
		av.bestandErhoehen(ma, ar, anz);

		return ar;
	}

	public void artikelAnlegen(Mitarbeiter mitarbeiter, String bez, int preis, int bestand){
		av.artikelAnlegen(mitarbeiter, bez, preis, bestand);
	}


	//	---------- test -----------

	public void printArtikelListe(){
		for(int i = 0; i< av.getArtikelListe().size();i++){
			System.out.println(av.getArtikelListe().get(i).getNummer());
		}
	}

	public void printMitarbeiterListe(){
		for(int i = 0; i< mv.getMitarbeiterliste().size();i++){
			System.out.println(mv.getMitarbeiterliste().get(i).getId());
		}
	}

	public void printKundenListe(){
		for(int i = 0; i< kv.getKundenliste().size();i++){
			System.out.println(kv.getKundenliste().get(i).getId());
		}
	}
}