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
	
	
	private Mitarbeiter mitarbeiter;
	private List<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
	private ArtikelVerwaltung av;
	private Shop shop;
	

	public MitarbeiterVerwaltung(Mitarbeiter mitarbeiter, List<Mitarbeiter> mitarbeiterliste) {
		super();
		this.mitarbeiter = mitarbeiter;
		this.mitarbeiterliste = mitarbeiterliste;
	}

	public void einloggen(String mail, String passwort){
		for(int i = 0; i< mitarbeiterliste.size(); i++){
			if(mitarbeiterliste.contains(mail)){
				if(mitarbeiterliste.get(i).getEmail().equals(mail)){
					if(mitarbeiterliste.get(i).getPasswort().equals(passwort)){
						mitarbeiterliste.set(i, mitarbeiter).setLogin(true);
					}
				}
			}
			
			
		}
	}
	
	public void ausloggen(Mitarbeiter mitarbeiter){
		mitarbeiter.setLogin(false);
		
	}

	public void registrieren(String vorname, String nachname, String mail, String passwort){
		int id = mitarbeiterliste.size() + 1;
		mitarbeiterliste.add(new Mitarbeiter(id, vorname, nachname, mail, passwort, false));		
		
	}
	
	public void artikelAnlegen(Mitarbeiter mitarbeiter, String bez, String nummer, String preis, boolean verfuegbar){
		List<Artikel> artikelliste = new ArrayList<Artikel>();
		artikelliste = av.getArtikelliste();
		shop.artikelAnlegen(mitarbeiter, bez, nummer, preis, verfuegbar)
	}
	
	public void bestandErhoehen(Artikel artikel){
		
	}
	
}
