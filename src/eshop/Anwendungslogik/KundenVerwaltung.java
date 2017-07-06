package eshop.Anwendungslogik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Kunde;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import eshop.Exceptions.EinloggenFehlgeschlagenException;
import persistence.FilePersistenceManager;
import persistence.PersistenceManager;

public class KundenVerwaltung {

	private List<Kunde> kundenliste = new ArrayList<Kunde>();
	private PersistenceManager fp = null;
	
	public KundenVerwaltung(FilePersistenceManager fp) throws IOException {
		this.fp = fp;
//		ladeKunden();
	}

	public void ladeKunden() throws IOException {
		fp.openForReading("SHOP_K.txt");
		Kunde k = null;
		do {
			k = fp.ladeKunde();
			if (k != null)
				kundenliste.add(k);
		} while (k != null);
		fp.close();
	}

	//  Kunde wird eingeloggt mittels E-Mail und Passwort
	public Kunde einloggen(String mail, String passwort) throws EinloggenFehlgeschlagenException{
		for (Kunde ku: kundenliste) {
			if(ku.getEmail().equals(mail) && ku.getPasswort().equals(passwort)){
				ku.setLogin(true);
				return ku;
			}			
		}
		throw new EinloggenFehlgeschlagenException(); 
	}

	
	//  Kunde wird ausgeloggt
	public void ausloggen(Benutzer kunde){
		kunde.setLogin(false);
	}
	
	
	//  Kunde wird registriert mittels Vorname, Nachname, E-Mail, Passwort und Adresse
	public boolean registrieren(String vorname, String nachname, String mail, String passwort, Adresse adresse) throws BenutzerExistiertBereitsException{
		
		int id = kundenliste.size()+1;
		Kunde ku = new Kunde(id, vorname, nachname, mail, adresse, passwort, false);
		if(!kundenliste.contains(ku)){
			kundenliste.add(ku);
			return true;
		} else{
			for (int i = 0; i < kundenliste.size(); i++) {
				System.out.println(kundenliste.get(i).getVorname() + kundenliste.get(i).getNachname());
			}
			
			throw new BenutzerExistiertBereitsException(ku); 
		}
	}

	
	public List<Kunde> getKundenliste() {
		return kundenliste;
	}


	public void setKundenliste(List<Kunde> kundenliste) {
		this.kundenliste = kundenliste;
	}
}
