package eshop.Anwendungslogik;

import java.util.ArrayList;

import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Warenkorb;


public class WarenkorbVerwaltung {

//	// Verwaltung des Buchbestands
//	private Vector<Warenkorb> warenkorbListe = new Vector<Warenkorb>();
//
//	// Persistenz-Schnittstelle, die für die Details des Dateizugriffs verantwortlich ist
//	private PersistenceManager pm; //  = new FilePersistenceManager();
//	
//        
//        public WarenkorbVerwaltung(PersistenceManager pm) {
//            this.pm = pm;
//        }

	/**
	 * Methode zum Einlesen eines Warenkorbs aus einer Datei.
	 * 
	 * @param datei Datei, die alle Warenkörbe enthält.
	 * @throws IOException
	 */
//	public void liesWarenkorb(String datei,Vector<Artikel> artikelListe, Vector<Kunde> kundenListe) throws IOException {
//		// PersistenzManager für Lesevorgänge öffnen
//		pm.openForReading(datei);
//
//		Warenkorb einWarenkorb;
//		do {
//			// Warenkorb-Objekt einlesen
//			einWarenkorb = pm.ladeWarenkorb(artikelListe, kundenListe);
//			if (einWarenkorb != null) {
//				// Warenkorb in Liste einfügen
////				try {
//					warenkorbAnlegen(einWarenkorb);
////				} catch (WarenkorbExistiertBereitsException e1) {
////					
////				}
//			}
//		} while (einWarenkorb != null);
//
//		// Persistenz-Schnittstelle wieder schließen
//		pm.close();
//	}
//
//	/**
//	 * Methode zum Schreiben des Warenkorbs in eine Datei.
//	 * 
//	 * @param datei Datei, in den der Warenkorb geschrieben wird
//	 * @throws IOException
//	 */
//	public void schreibeWarenkorb(String datei) throws IOException  {
//		// PersistenzManager für Schreibvorgänge öffnen
//		pm.openForWriting(datei);
//
//		Iterator<Warenkorb> it = warenkorbListe.iterator();
//		while (it.hasNext()) {
//			Warenkorb a = it.next();
//			pm.speichereWarenkorb(a);			
//		}
//
//		// Persistenz-Schnittstelle wieder schließen
//		pm.close();
//	}
		
	/**
	 * Methode, die ein Warenkorb an das Ende der Bücherliste einfügt.
	 * 
	 * @param einWarenkorb das einzufügende Warenkorb
	 * @throws WarenkorbExistiertBereitsException wenn das Warenkorb bereits existiert(in Bearbeitung)
         * 
	 */
//	public void warenkorbAnlegen(Warenkorb einWarenkorb)  {
//		if (warenkorbListe.contains(einWarenkorb)) {
//                    // Warenkorb fehlermeldung
//                    // throw new WarenkorbExistiertBereitsException(...)
//                }else warenkorbListe.add(einWarenkorb);
//		                
//	}

	/**
	 * Methode zum Loeschen eines Warenkorbs 
	 * 
	 * @param einWarenkorb das löschende Warenkorb
	 */
//	public void loeschen(Warenkorb einWarenkorb) {
//		warenkorbListe.remove(einWarenkorb);
//	}
//
	/**
	 * Methode, die anhand einer Bezeichnung nach Artikeln sucht. Es wird eine Liste von Artikeln
	 * zurueckgegeben, die alle Artikel mit exakt Uebereinstimmendem Titel enthaelt.
	 * 
	 * @param wknr warenkorbnummer
	 * @return Warenkorb mit den dementsprechenden wknr.(Kann leer sein!)
	 */
//	public Vector<Warenkorb> warenkorbVorhanden(String wknr) {
//		Vector<Warenkorb> suchErg = new Vector<Warenkorb>();
//		
//		Iterator<Warenkorb> it = warenkorbListe.iterator();
//		while (it.hasNext()) {
//			Warenkorb einWarenkorb = it.next();
//			if (einWarenkorb.getWarenkorbNr().equals(wknr))
//				suchErg.add(einWarenkorb);
//		}
//
//		return suchErg;
//	}
	
	/**
	 * Methode, die den Bücherbestand zurückgibt.
	 */
//	public Vector<Warenkorb> getWarenkorbliste() {
//		return warenkorbListe;
//	}
	
	public void warenkorbLeeren(Kunde k){
		Warenkorb cart = k.getCart();
		cart.setEintraege(new ArrayList<>());
	}
	
	public void warenkorbKaufen(Kunde k){
		//TODO
	}
}
