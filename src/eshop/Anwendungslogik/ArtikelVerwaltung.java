package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Mitarbeiter;
import persistence.FilePersistenceManager;
import persistence.PersistenceManager;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;




/**
 * Klasse zur Verwaltung von Artikel.
 * 
 */
public class ArtikelVerwaltung {

	public ArtikelVerwaltung (FilePersistenceManager fp) throws IOException {
		this.fp = fp;
	}



	private Vector<Artikel> artikelListe = new Vector<Artikel>();
	//       private Map<Artikel, Integer> bestandsListe = null;

	// Persistenz-Schnittstelle, die fuer die Details des Dateizugriffs verantwortlich ist
	private PersistenceManager fp = null; // = new FilePersistenceManager();


	public void ladeArtikel() throws IOException {
		fp.openForReading("SHOP_A.txt");
		Artikel a = null;
		do {
			a = fp.ladeArtikel();
			if (a != null)
				artikelListe.add(a);
		} while (a != null);
		fp.close();
	}


	public Vector<Artikel> getArtikelListe() {
		return artikelListe;
	}

	public void setArtikelListe(Vector<Artikel> artikelListe) {
		this.artikelListe = artikelListe;
	}



	/**
	 * Methode zum loeschen eines Artikel aus dem Lager. 
	 * 
	 * @param einArtikel das loeschende Artikel
	 */

	public void loeschen(Artikel einArtikel) {
		artikelListe.remove(einArtikel);
	}


	/**
	 * Methode, die anhand eines Titels nach Artikel sucht. Es wird ein Vector von Artikel
	 * zurueckgegeben, die alle Artikel mit exakt uebereinstimmendem Titel enthaelt.
	 * 
	 * @param bez Titel des gesuchten Artikels
	 * @return Vector der Artikel mit gesuchtem Titel (evtl. leer)
	 */

	public Vector<Artikel> artikelVorhanden(String bez) {
		Vector<Artikel> suchErg = new Vector<Artikel>();

		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel einArtikel = it.next();
			if (einArtikel.getBez().equals(bez))
				suchErg.add(einArtikel);
		}

		return suchErg;
	}

	//	Methode, die einen Artikel aus der Artikelliste anhand einer genau uebereinstimmenden ID Nummer heraussucht.

	public Artikel artikelNachID(int id) {
		Artikel suchErg = null;

		// Set<Artikel> artikelListe = bestandsListe.keySet();

		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel einArtikel = it.next();
			if (einArtikel.getNummer() == id)
				suchErg = einArtikel;
		}

		return suchErg;
	}

	// Artikel anhand Bezeichnung finden

	public Artikel artikelNachBez(String bez) {
		Artikel suchErg = null;

		// Set<Artikel> artikelListe = bestandsListe.keySet();

		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel einArtikel = it.next();
			if (einArtikel.equals(bez)){
				suchErg = einArtikel;
			}
		}

		return suchErg;
	}


	/**
	 * Methode, die alle Artikel zurueck gibt.
	 * 
	 */
	public Vector<Artikel> sortierenNachBezeichnung(){
		Vector<Artikel> artikelListeBezeichnung = new Vector<Artikel>();
		artikelListe.sort();
		
	}
	



	//	Methode, um den Bestand eines Artikels zu erh�hen.
	public void bestandAendern(Benutzer be, Artikel artikel, int anz){
		// artikel.getBestand();
		if(artikel.getBestand()-anz < 0){
			System.out.println("Es sind nicht ausreichend Artikel vorhanden!");
			return; // besser Exception
		}
		artikel.setBestand(artikel.getBestand()+anz);
	}


	// Artikel erstellen
	public Artikel createArtikel(String bez, float preis, int bestand){
		int id = 0;

		// Set<Artikel> artikelListe = bestandsListe.keySet();

		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel einArtikel = it.next();
			if (einArtikel.getNummer() > id){
				id = einArtikel.getNummer();
			}

		}
		id ++;
		Artikel ar = new Artikel(bez, id, preis, bestand);
		artikelListe.add(ar);
		return ar;
	}

	public void artikelInWarenkorb(){
		
	}
	
	public void warenkorbKaufen(){
		
	}


}
