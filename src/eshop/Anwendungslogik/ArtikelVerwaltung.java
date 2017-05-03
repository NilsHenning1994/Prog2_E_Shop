package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;



/**
 * Klasse zur Verwaltung von Artikel.
 * 
 */
public class ArtikelVerwaltung {


	private Artikel kartoffel = new Artikel("152","Tuerkische Kartoffel","");
	private Artikel mais = new Artikel("153","Griechischer Mais","");
	private Artikel erbeere = new Artikel("154","Deutsche Erdbeere","");
	private Artikel hund = new Artikel("155","Kleiner Hund","");
	private Artikel katze = new Artikel("156","Hauskatze","");
	private Artikel pferd = new Artikel("157","Araber","");
	private Artikel kuh = new Artikel("158","Hausrind","");
	private Artikel fisch = new Artikel("159","Hering","");
	private Artikel fernseher = new Artikel("160","LED Smart TV ","");
	private Artikel schrank = new Artikel("161","PAX Kleiderschrank","");



	// Verwaltung des Buchbestands
	private Vector<Artikel> artikelListe = new Vector<Artikel>();

	//       private Map<Artikel, Integer> bestandsListe = null;



	

	/**
	 * Methode zum Schreiben eines Artikels in eine Liste.
	 * 
	 */
	public void schreibeArtikel(Artikel artikel) throws IOException  {

		
		Artikel einArtikel = new Artikel("Test Nummer","Test Bezeichnung","Test Preis");
		
		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			einArtikel = it.next();

		}


	}

	/**
	 * Methode, die ein Artikel an das Ende der Artikelliste einf¸gt.
	 * 
	 * @param einArtikel das einzuf¸gende Artikel
	 */

	public void artikelAnlegen(Artikel einArtikel) {
		if (artikelListe.contains(einArtikel)) {
			// Artikel fehlermeldung

		} else artikelListe.add(einArtikel); 

	}

	/**
	 * Methode zum Lˆschen eines Artikel aus dem Lager. 
	 * 
	 * @param einArtikel das lˆschende Artikel
	 */

	public void loeschen(Artikel einArtikel) {
		artikelListe.remove(einArtikel);
	}


	/**
	 * Methode, die anhand eines Titels nach Artikel sucht. Es wird einen Vector von Artikel
	 * zur¸ckgegeben, die alle Artikel mit exakt ¸bereinstimmendem Titel enth‰lt.
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

	/**
	 * Methode, die alle Artikel zur¸ck gibt.
	 * 
	 */

	public Vector<Artikel> getArtikelliste() {
		// return new Vector<Artikel>(bestandsListe.keySet());
		System.out.println(artikelListe);
		return artikelListe;
	}


}
