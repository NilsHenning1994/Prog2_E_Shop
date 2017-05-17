package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.List;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import persistence.PersistenceManager;

public class MitarbeiterVerwaltung {

	//	 	Mitarbeiter (mit Name und eindeutiger Nummer) können neue Artikel anlegen und den Bestand
	//		existierender Artikel erhöhen.


	private List<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
	private PersistenceManager pm = null;

public MitarbeiterVerwaltung(PersistenceManager pm) {
    this.pm = pm;
}

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

	//	Methode, um sich als Benutzer auszuloggen
	public void ausloggen(Benutzer benutzer){
		benutzer.setLogin(false);
	}

	//	Methoden, um sich als Mitarbeiter zu registrieren
	public boolean registrieren(String vorname, String nachname, String mail, String passwort) throws BenutzerExistiertBereitsException{
		int id = mitarbeiterliste.size() + 1;
		Mitarbeiter ma = new Mitarbeiter(id, vorname, nachname, mail, passwort, false);
		
		if (!mitarbeiterliste.contains(ma)) {
			mitarbeiterliste.add(ma);		
			return true;
		}else{
			throw new BenutzerExistiertBereitsException(ma);
		}
	}

	public List<Mitarbeiter> getMitarbeiterliste() {
		return mitarbeiterliste;
	}

	public void setMitarbeiterliste(List<Mitarbeiter> mitarbeiterliste) {
		this.mitarbeiterliste = mitarbeiterliste;
	}	


}
