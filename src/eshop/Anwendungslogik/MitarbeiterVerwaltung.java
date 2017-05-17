package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.List;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import persistence.PersistenceManager;
import eshop.Exceptions.EinloggenFehlgeschlagenException;


public class MitarbeiterVerwaltung {

	//  Mitarbeiter (mit Name und eindeutiger Nummer) koennen neue Artikel anlegen und den Bestand
	//  existierender Artikel erhoehen
	private List<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
	private PersistenceManager pm = null;

	public MitarbeiterVerwaltung(PersistenceManager pm) {
		this.pm = pm;
	}

	//  Mitarbeiter wird eingeloggt mittels E-Mail und Passwort
	public Mitarbeiter einloggen(String mail, String passwort) throws EinloggenFehlgeschlagenException{
		for(int i = 0; i< mitarbeiterliste.size(); i++){
			Mitarbeiter ma = mitarbeiterliste.get(i);
			//			if(mitarbeiterliste.contains(mail)){
			if (ma.getEmail().equals(mail) && ma.getPasswort().equals(passwort)){
				ma.setLogin(true);
				return ma;
			}
		} throw new EinloggenFehlgeschlagenException();
	}


	//  Mitarbeiter wird ausgeloggt
	public void ausloggen(Benutzer mitarbeiter){
		mitarbeiter.setLogin(false);
	}


	//  Mitarbeiter wird registriert ---> TODO Abfrage  oder feste Anzahl von Mitarbeitern 
	//  damit sich nicht einfach so ein neuer Mitarbeiter registrieren kann
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

	public boolean mitarbeiterVorhanden(String mail, String pw){

		for(int i = 0; i< mitarbeiterliste.size(); i++){
			if(mitarbeiterliste.get(i).getEmail().equals(mail) && mitarbeiterliste.get(i).getPasswort().equals(pw)){
				return true;
			}
		}
		return false;
	}
	public void setMitarbeiterliste(List<Mitarbeiter> mitarbeiterliste) {
		this.mitarbeiterliste = mitarbeiterliste;
	}	


}
