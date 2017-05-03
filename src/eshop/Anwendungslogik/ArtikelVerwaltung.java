package eshop.Anwendungslogik;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Vector;



/**
 * Klasse zur Verwaltung von Artikel.
 * 
 */
public class ArtikelVerwaltung {


	private Artikel kartoffel = new Artikel("Tuerkische Kartoffel",4 , 1000, 35);
	private Shop shop;
	


	// Verwaltung des Buchbestands
	private Vector<Artikel> artikelListe = new Vector<Artikel>();
	

	//       private Map<Artikel, Integer> bestandsListe = null;



	

	/**
	 * Methode zum Schreiben eines Artikels in eine Liste.
	 * 
	 */
	public void schreibeArtikel(Artikel artikel) throws IOException  {

		
		Artikel einArtikel = new Artikel("Test Nummer",11 ,4,3);
		
		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			einArtikel = it.next();

		}


	}

	public Vector<Artikel> getArtikelListe() {
		return artikelListe;
	}

	public void setArtikelListe(Vector<Artikel> artikelListe) {
		this.artikelListe = artikelListe;
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
	
	
//	Methode, um �ber die Shopklasse neue Artikel anzulegen.
	public void artikelAnlegen(String bez, int nummer, float preis, int bestand){
		Artikel artikel = new Artikel(bez, nummer, preis, bestand);
		shop.artikelAnlegen(artikel);
	}
	
//	Methode, um den Bestand eines Artikels zu erh�hen.
	public void bestandErhoehen(Artikel artikel){
		
	}


}
