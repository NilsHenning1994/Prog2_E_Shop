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
	public FalschePackungsgroeßeException() {
		super("Dieser Artikel existiert nicht in der gewünschten Packungsgroeße!");
	}
}
