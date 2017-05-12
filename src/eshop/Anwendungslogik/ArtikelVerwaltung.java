package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Mitarbeiter;
import persistence.PersistenceManager;
import java.util.Iterator;
import java.util.Vector;
import java.io.Serializable;




/**
 * Klasse zur Verwaltung von Artikel.
 * 
 */
public class ArtikelVerwaltung {




	private Vector<Artikel> artikelListe = new Vector<Artikel>();
	//       private Map<Artikel, Integer> bestandsListe = null;

	// Persistenz-Schnittstelle, die fuer die Details des Dateizugriffs verantwortlich ist
		private PersistenceManager pm = null; // = new FilePersistenceManager();



//	/**
//	 * Methode zum Schreiben eines Artikels in eine Liste.
//	 * 
//	 */
//	public void schreibeArtikel(Artikel artikel)  {
//
//
//		Artikel einArtikel = new Artikel("Test Nummer",11 ,4,3);
//
//		Iterator<Artikel> it = artikelListe.iterator();
//		while (it.hasNext()) {
//			einArtikel = it.next();
//
//		}
//
//
//	}

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

		// Set<Artikel> artikelListe = bestandsListe.keySet();

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
	
	
	
	/**
	 * Methode, die alle Artikel zurueck gibt.
	 * 
	 */

	public Vector<Artikel> getArtikelliste() {
		// return new Vector<Artikel>(bestandsListe.keySet());
		System.out.println(artikelListe);
		return artikelListe;
	}


	//	Methode, um �ber die Shopklasse neue Artikel anzulegen.
	public void artikelAnlegen(Mitarbeiter mitarbeiter, String bez, int preis, int bestand){

		for(int i = 0; i<artikelListe.size(); i++){
			if(artikelListe.get(i).getBez().equals(bez)){
				System.out.println("Dieser Artikel existiert bereits!");
			}
		}
		int id = artikelListe.size() + 1;
		Artikel artikel = new Artikel(bez, id, preis, bestand);
		artikelListe.add(artikel);
		System.out.println("Artikel wurde erfolgreich hinzugef�gt!");

	}



	//	Methode, um den Bestand eines Artikels zu erh�hen.
	public void bestandErhoehen(Mitarbeiter ma, Artikel artikel, int anz){
		artikel.getBestand();
		if(artikel.getBestand()-anz < 0){
			System.out.println("Es sind nicht ausreichend Artikel vorhanden!");
			return; // besser Exception
		}
		artikel.setBestand(artikel.getBestand()+anz);
	}
	
	public Artikel createArtikel(String bez, int nummer, int preis, int bestand){
		Artikel ar = new Artikel(bez, nummer, preis, bestand);
		return ar;
	}
	
	
	
	

}
