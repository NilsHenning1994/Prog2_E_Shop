package eshop.Exceptions;

import eshop.Datenstrukturen.User;

public class BenutzerExistiertBereitsException extends Exception{
	
	/**
	 * 
	 * @param User wird geprueft ob er schon vorhanden ist.
	 */
	public  BenutzerExistiertBereitsException(User be){
		super ("Benutzer mit dem Namen: "+ be.getVorname()+" " +be.getNachname()+ " existiert bereits ");
		
	}

}
