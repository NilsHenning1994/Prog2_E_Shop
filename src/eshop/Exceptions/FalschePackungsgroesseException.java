package eshop.Exceptions;

//import java.rmi.RemoteException;

import eshop.Datenstrukturen.Massengutartikel;

/**
 * Exception zur Signalisierung, dass ein Artikel bereits existiert (z.B. bei einem Einfügevorgang).
 * 
 */
public class FalschePackungsgroesseException extends Exception {

	/**
	 * Konstruktor
	 * 
	 * @param artikel Das bereits existierende Artikel
	 * @param zusatzMsg zusätzlicher Text für die Fehlermeldung
	 */
	public FalschePackungsgroesseException() {
		super("Dieser Artikel existiert nicht in der gewuenschten Packungsgroesse!");
	}
}
