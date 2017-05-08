package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.List;

import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Kunde;

public class KundenVerwaltung {

	private List<Kunde> kundenliste = new ArrayList<Kunde>();
	
	public Kunde einloggen(String mail, String passwort){
		for(int i = 0; i< kundenliste.size();i++){
			Kunde ku = kundenliste.get(i);
			if(ku.getEmail().equals(mail) && ku.getPasswort().equals(passwort)){
				ku.setLogin(true);
				return ku;
			}
			 
		}return null; // TODO: besser LoginFailedException
	}

	
	public void ausloggen(Benutzer kunde){
		kunde.setLogin(false);
	}
	
	
	
	public boolean registrieren(String vorname, String nachname, String mail, String passwort, Adresse adresse){
		
		int id = kundenliste.size()+1;
		Kunde ku = new Kunde(id, vorname, nachname, mail, adresse, passwort, false);
		if(!kundenliste.contains(ku)){
			kundenliste.add(ku);
			return true;
		}
		return false;	// TODO: besser UserAlreadyExistsException
	}


	public List<Kunde> getKundenliste() {
		return kundenliste;
	}


	public void setKundenliste(List<Kunde> kundenliste) {
		this.kundenliste = kundenliste;
	}
}
