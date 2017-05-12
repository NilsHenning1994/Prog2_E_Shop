package eshop.Exceptions;

import java.rmi.RemoteException;

import eshop.Datenstrukturen.Artikel;



/**
 * Exception zur Signalisierung, dass ein Artikel bereits existiert (z.B. bei einem Einfügevorgang).
 * 
 */
public class ArtikelExistiertBereitsException extends Exception {

	/**
	 * Konstruktor
	 * 
	 * @param artikel Das bereits existierende Artikel
	 * @param zusatzMsg zusätzlicher Text für die Fehlermeldung
	 */
	public ArtikelExistiertBereitsException(Artikel artikel, String zusatzMsg) throws RemoteException {
		super("Artikel mit Titel " + artikel.getBez() + " und Artikelnr " + artikel.getNummer()
				+ " existiert bereits. " + zusatzMsg);
	}
}
