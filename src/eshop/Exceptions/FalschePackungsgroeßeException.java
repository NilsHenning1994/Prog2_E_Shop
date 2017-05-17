package eshop.Exceptions;

//import java.rmi.RemoteException;

import eshop.Datenstrukturen.Massengutartikel;

/**
 * Exception zur Signalisierung, dass ein Artikel bereits existiert (z.B. bei einem Einfügevorgang).
 * 
 */
public class FalschePackungsgroeßeException extends Exception {

	/**
	 * Konstruktor
	 * 
	 * @param artikel Das bereits existierende Artikel
	 * @param zusatzMsg zusätzlicher Text für die Fehlermeldung
	 */
	public FalschePackungsgroeßeException(Massengutartikel ma, String zusatzMsg) {
		super("Artikel mit Titel " + ma.getBez() + " und Artikelnr " + ma.getNummer()
				+ " ist nur in einer anderen Packungsgroeße vorhanden. " + zusatzMsg);
	}
}
