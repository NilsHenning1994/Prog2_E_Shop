package domain;

import domain.exceptions.ArtikelExistiertBereitsException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import persistence.FilePersistenceManager;
import persistence.PersistenceManager;
import valueobjects.Artikel;


/**
 * Klasse zur Verwaltung von Artikel.
 * 
 * @author Gruppe A4(Patrick, Oleksandra, Walter)
 * 
 */
public class ArtikelVerwaltung {

	// Verwaltung des Buchbestands
	private Vector<Artikel> artikelListe = new Vector<Artikel>();
        
 //       private Map<Artikel, Integer> bestandsListe = null;

	// Persistenz-Schnittstelle, die für die Details des Dateizugriffs verantwortlich ist
	private PersistenceManager pm = null; // = new FilePersistenceManager();
	
        public ArtikelVerwaltung(PersistenceManager pm) {
            this.pm = pm;
        }
	/**
	 * Methode zum Einlesen von Artikeldaten aus einer Datei.
	 * 
	 * @param datei Datei, die einzulesenden Artikeldaten enthält
	 * @throws IOException
	 */
	public void liesArtikel(String datei) throws IOException {
		// PersistenzManager für Lesevorgänge öffnen
		pm.openForReading(datei);

		Artikel einArtikel;
		do {
			// Artikel-Objekt einlesen
			einArtikel = pm.ladeArtikel();
			if (einArtikel != null) {
				// Artikel in Liste einfügen
				try {
					artikelAnlegen(einArtikel);
				} catch (ArtikelExistiertBereitsException e1) {
					
				}
			}
		} while (einArtikel != null);

		// Persistenz-Schnittstelle wieder schließen
		pm.close();
	}

	/**
	 * Methode zum Schreiben der Artikeldaten in eine Datei.
	 * 
	 * @param datei Datei, in die der Bücherbestand geschrieben werden soll
	 * @throws IOException
	 */
	public void schreibeArtikel(String datei) throws IOException  {
		// PersistenzManager für Schreibvorgänge öffnen
		pm.openForWriting(datei);

		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel a = it.next();
			pm.speichereArtikel(a);			
		}

		// Persistenz-Schnittstelle wieder schließen
		pm.close();
                
	}
		
	/**
	 * Methode, die ein Artikel an das Ende der Artikelliste einfügt.
	 * 
	 * @param einArtikel das einzufügende Artikel
	 * 
         * 
	 */
	public void artikelAnlegen(Artikel einArtikel) throws ArtikelExistiertBereitsException {
		if (artikelListe.contains(einArtikel)) {
                    // Artikel fehlermeldung
                    throw new ArtikelExistiertBereitsException(einArtikel, "");
                } else artikelListe.add(einArtikel); 
		               
	}

	/**
	 * Methode zum Löschen eines Artikel aus dem Lager. 
	 * 
	 * @param einArtikel das löschende Artikel
	 */
	public void loeschen(Artikel einArtikel) {
		artikelListe.remove(einArtikel);
	}
        

	/**
	 * Methode, die anhand eines Titels nach Artikel sucht. Es wird einen Vector von Artikel
	 * zurückgegeben, die alle Artikel mit exakt übereinstimmendem Titel enthält.
	 * 
	 * @param bez Titel des gesuchten Artikels
	 * @return Vector der Artikel mit gesuchtem Titel (evtl. leer)
	 */
	public Vector<Artikel> artikelVorhanden(String bez) {
		Vector<Artikel> suchErg = new Vector<Artikel>();
		
 //               Set<Artikel> artikelListe = bestandsListe.keySet();
                
		Iterator<Artikel> it = artikelListe.iterator();
		while (it.hasNext()) {
			Artikel einArtikel = it.next();
			if (einArtikel.getBez().equals(bez))
				suchErg.add(einArtikel);
		}

		return suchErg;
	}
	
	/**
	 * Methode, die alle Artikel zurück gibt.
     * @return 
	 */
	public Vector<Artikel> getArtikelliste() {
//            return new Vector<Artikel>(bestandsListe.keySet());
            return artikelListe;
	}
	
	
}
