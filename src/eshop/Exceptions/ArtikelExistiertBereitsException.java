package eshop.Exceptions;

import java.rmi.RemoteException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
	
	// Create an instance of SimpleDateFormat used for formatting 
	// the string representation of date (month/day/year)
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	// Get the date today using Calendar object.
	Date today = Calendar.getInstance().getTime();        
	// Using DateFormat format method we can create a string 
	// representation of a date with the defined format.
	String reportDate = df.format(today);

	// Print what date is today!
	System.out.println("Report Date: " + reportDate);
}
