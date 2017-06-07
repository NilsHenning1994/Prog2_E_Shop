package eshop;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Anwendungslogik.EreignisVerwaltung;
import eshop.Anwendungslogik.KundenVerwaltung;
import eshop.Anwendungslogik.MitarbeiterVerwaltung;
import eshop.Anwendungslogik.ShoppingServices;
import eshop.Anwendungslogik.WarenkorbVerwaltung;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Datenstrukturen.Rechnung;
import eshop.Datenstrukturen.Warenkorb;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import eshop.Exceptions.EinloggenFehlgeschlagenException;
import persistence.FilePersistenceManager;

public class Shop {

	private ArtikelVerwaltung av;
	private MitarbeiterVerwaltung mv;
	private KundenVerwaltung kv;
	private EreignisVerwaltung ev;
	private WarenkorbVerwaltung wv;
	private FilePersistenceManager fp;
	private ShoppingServices ss;

	public Shop() throws IOException {
		fp = new FilePersistenceManager();
		av = new ArtikelVerwaltung(fp);
		mv = new MitarbeiterVerwaltung(fp);
		kv = new KundenVerwaltung(fp);
		ev = new EreignisVerwaltung();
		wv = new WarenkorbVerwaltung();
		ss = new ShoppingServices();
	}



	// Getter
	public Vector<Artikel> getArtikelListe(){
		return av.getArtikelListe();
	}






	//speichern
	public void speicherMitarbeiter() throws IOException{
		List<Mitarbeiter> newmitarbeiterliste = new ArrayList<Mitarbeiter>();
		newmitarbeiterliste = mv.getMitarbeiterliste();
		fp.openForWriting("SHOP_M.txt");
		fp.speichereMitarbeiterliste(newmitarbeiterliste);
		fp.close();
	}
	public void speicherKunde() throws IOException{
		List<Kunde> newkundenliste = new ArrayList<Kunde>();
		newkundenliste = kv.getKundenliste();
		fp.openForWriting("SHOP_K.txt");
		fp.speichereKundeliste(newkundenliste);
		fp.close();
	}
	public void speicherArtikel() throws IOException{
		List<Artikel> newartikelliste = new ArrayList<Artikel>();
		newartikelliste = av.getArtikelliste();
		fp.openForWriting("SHOP_A.txt");
		fp.speichereArtikelliste(newartikelliste);
		fp.close();
	}

	//laden
	public void ladeMitarbeiter() throws IOException{
		//		List<Mitarbeiter> newmitarbeiterliste = new ArrayList<Mitarbeiter>();
		fp.openForReading("SHOP_M.txt");
		mv.ladeMitarbeiter();
		fp.close();
		//		mv.setMitarbeiterliste(newmitarbeiterliste);
	}
	public void ladeKunden() throws IOException{
		fp.openForReading("SHOP_K.txt");
		kv.ladeKunden();
		fp.close();
	}
	public void ladeArtikel() throws IOException{
		fp.openForReading("SHOP_A.txt");
		av.ladeArtikel();
		fp.close();
	}





	//	Mitarbeiter Methoden ----->

	// Mitarbeiter Registrieren 
	public boolean mitarbeiterRegi(String vorname,String nachname,String mail,String passwort) throws BenutzerExistiertBereitsException{
		return mv.registrieren(vorname, nachname, mail, passwort);
	}
	// Mitarbeiter einloggen
	public Mitarbeiter mitarbeiterEinloggen(String mail, String passwort) throws EinloggenFehlgeschlagenException{
		return mv.einloggen(mail, passwort);
	}

	// Mitarbeiter ausloggen
	public void mitarbeiterAusloggen(Benutzer mitarbeiter){
		mv.ausloggen(mitarbeiter);
	}
	public boolean mitarbeiterVorhanden(String mail, String pw){
		boolean success = mv.mitarbeiterVorhanden(mail, pw);
		return success;
	}

	//	 Kunden Methoden ----->

	// Kunde registrieren
	public boolean kundeRegi(String vorname, String nachname, String mail, String passwort, Adresse adresse) throws BenutzerExistiertBereitsException{
		return kv.registrieren(vorname, nachname, mail, passwort, adresse);
	}
	// Kunde einloggen
	public Kunde kundeEinloggen(String mail, String passwort) throws EinloggenFehlgeschlagenException{
		return kv.einloggen(mail, passwort);
	}
	// Kunde ausloggen
	public void kundeAusloggen(Benutzer user){
		kv.ausloggen(user);
	}





	//	Artikel Methoden ---->

	// Mitarbeiter Bestand von Artikel erhoehen
	public Artikel bestandAendern(Mitarbeiter ma, Artikel ar, int anz){
		av.bestandAendern(ma, ar, anz);
		ev.addEreignis(ma, ar, anz);

		return ar;
	}
	public void artikelAnlegen(Mitarbeiter mitarbeiter, String bez, float preis, int bestand){
		//		av.createArtikel(bez, nummer, preis, bestand);
		Artikel art = av.createArtikel(bez, preis, bestand);
		ev.addEreignisArtikelAnlegen(mitarbeiter, art, bestand);
	}
	public Artikel artikelSuchenNachID(int id){
		return av.artikelNachID(id);
	}
	//TODO
	public void artikelInWarenkorb(Kunde k, Artikel a, int anz){
		av.artikelInWarenkorb();
	}
	//TODO
	public void artikelKaufen(Kunde ku, Artikel ar, int anz){

		av.bestandAendern(ku, ar, anz);
		ss.warenkorbAendern(ku, ar, anz);
		ev.addEreignis(ku, ar, anz);
	}
	public void warenkorbLeeren(Kunde ku){
		ss.warenkorbLeeren(ku);
	}
	public Warenkorb getWarenkorb(Kunde ku){
		return ku.getCart();
	}
	public void setWarenkorb(Kunde ku, Warenkorb wa){
		ku.setCart(wa);
	}


	// Ereignismethoden??





	//	---------- test/print -----------

	public void printArtikelListe(){
		for(int i = 0; i< av.getArtikelListe().size();i++){
			System.out.println(av.getArtikelListe().get(i).getNummer() + " | "+ av.getArtikelListe().get(i).getBez()+ " | "+ av.getArtikelliste().get(i).getBestand());
		}
	}

	public void printMitarbeiterListe(){
		System.out.println("Mitarbeiterliste: ");
		for(int i = 0; i< mv.getMitarbeiterliste().size();i++){

			System.out.println(mv.getMitarbeiterliste().get(i).getId() + " | " + mv.getMitarbeiterliste().get(i).getNachname()+", "+ mv.getMitarbeiterliste().get(i).getVorname());
		}
	}

	public void printKundenListe(){
		System.out.println("Kundenliste: ");
		for(int i = 0; i< kv.getKundenliste().size();i++){

			System.out.println(kv.getKundenliste().get(i).getId() + " | " + kv.getKundenliste().get(i).getNachname()+", "+ kv.getKundenliste().get(i).getVorname());
		}
	}

	public void printEreignisListe(){
		System.out.println("Ereignisliste: ");
		for(int i = 0; i< ev.getEreignisListe().size();i++){

			System.out.println("Der Bestand des Artikels  "+ 
					ev.getEreignisListe().get(i).getArtikel().getBez() + " wurde am " + 
					ev.getEreignisListe().get(i).getWann()+" von dem Mitarbeiter "+ 
					ev.getEreignisListe().get(i).getUser().getVorname()+ " "+ 
					ev.getEreignisListe().get(i).getUser().getNachname() + " auf " + 
					ev.getEreignisListe().get(i).getAnz() + " geaendert.");
		}
	}
}