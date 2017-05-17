package eshop.Exceptions;

import eshop.Datenstrukturen.Benutzer;

public class EinloggenFehlgeschlagenException extends Exception{
	
	/**
	 * 
	 * @param Einlogdaten werden ueberprueft 
	 */
	public  EinloggenFehlgeschlagenException(){
		super ("Beim Einloggen ist ein Fehler aufgetreten!");
	}

}
