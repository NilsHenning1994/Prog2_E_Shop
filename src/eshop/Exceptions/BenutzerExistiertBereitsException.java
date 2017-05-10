package eshop.Exceptions;

import eshop.Datenstrukturen.Benutzer;

public class BenutzerExistiertBereitsException extends Exception{
	
	/**
	 * 
	 * @param Benutzer wird geprüft ob er schon vorhanden ist.
	 */
	public  BenutzerExistiertBereitsException(Benutzer be){
		super ("Benutzer mit dem Namen: "+ be.getVorname()+" " +be.getNachname()+ " existiert bereits ");
		
	}

}
