package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.List;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Mitarbeiter;

public class MitarbeiterVerwaltung {
	
//	 	Mitarbeiter (mit Name und eindeutiger Nummer) können neue Artikel anlegen und den Bestand
//		existierender Artikel erhöhen.
	
	
//	private Mitarbeiter mitarbeiter;
	private List<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
//	private ArtikelVerwaltung av;
//	private Shop shop;
	

//public MitarbeiterVerwaltung() {
//		super();
//	}

	
	
//	Methode, um sich als Mitarbeiter einzuloggen
	public Mitarbeiter einloggen(String mail, String passwort){
		for(int i = 0; i< mitarbeiterliste.size(); i++){
			Mitarbeiter ma = mitarbeiterliste.get(i);
//			if(mitarbeiterliste.contains(mail)){
			if (ma.getEmail().equals(mail) && ma.getPasswort().equals(passwort)){
				ma.setLogin(true);
				return ma;
			}
		}
		return null; 	// TODO: besser LoginFailedException
	}
	
//	Methode, um sich als Mitarbeiter auszuloggen
	public void ausloggen(Mitarbeiter mitarbeiter){
		mitarbeiter.setLogin(false);
	}

//	Methoden, um sich als Mitarbeiter zu registrieren
	public boolean registrieren(String vorname, String nachname, String mail, String passwort){
		int id = mitarbeiterliste.size() + 1;
		Mitarbeiter ma = new Mitarbeiter(id, vorname, nachname, mail, passwort);
		
		if (!mitarbeiterliste.contains(ma)) {
			mitarbeiterliste.add(ma);		
			return true;
		}

		return false; 	// TODO: besser UserAlreadyExistsException
	}	
}
