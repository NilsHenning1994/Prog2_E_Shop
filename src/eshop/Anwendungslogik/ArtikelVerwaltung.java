package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Bestand;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Vector;



/**
 * Klasse zur Verwaltung von Artikel.
 * 
 */
public class ArtikelVerwaltung {


	private Artikel kartoffel = new Artikel("152","Tuerkische Kartoffel", "1000", "35");
	


	// Verwaltung des Buchbestands
	private Vector<Artikel> artikelListe = new Vector<Artikel>();
	

	//       private Map<Artikel, Integer> bestandsListe = null;



	

	/**
	 * Methode zum Schreiben eines Artikels in eine Liste.
	 * 
	 */
	public void schreibeArtikel(Artikel artikel) throws IOException  {

		
		Artikel einArtikel = new Artikel("Test Nummer","Test Bezeichnung","Test Preis", "Test Bestand");
		
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
	
	public void sortB(){
	
		
		Vector<Artikel> besListe = new Vector<Artikel>();
		
		
		int listenG = artikelListe.size();
		int[] sort = new int[listenG];
		
			int i = 0;
			int g = 0;
			while ( i < listenG +1){
				
				String bla = artikelListe.get(i).getBestand();
				int eins = Integer.parseInt(artikelListe.get(i).getBestand());
			    int zwei = Integer.parseInt(artikelListe.get(g+1).getBestand());
				
			   for(  eins > zwei)  {
				   artikelListe
			   }
				sort[i] = Integer.parseInt(bla);
				System.out.println(sort[i]);
				
				i++;
			}
	
	
	}

	public static void bubblesrt(Vector<Artikel> artikelListe)
	  {
	        Drink temp;
	        if (artikelListe.size()>1) // check if the number of orders is larger than 1
	        {
	            for (int x=0; x<artikelListe.size(); x++) // bubble sort outer loop
	            {
	            	for (int i=0; i < artikelListe.size() - x - 1; i++){
	                    if (artikelListe.get(i).getBestand().compareTo(artikelListe.get(i+1).getBestand()) > 0)
	                    {
	                        temp = artikelListe.get(i).getBestand();
	                        artikelListe.set(i,artikelListe.get(i+1) );
	                        artikelListe.set(i+1, temp);
	                    }
	                }
	            }
	        }

	  }

}
