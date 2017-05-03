package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;

public class ArtikelVerwaltung {



	private Artikel kartoffel = new Artikel(152,"Tuerkische Kartoffel");
	private Artikel mais = new Artikel(153,"Griechischer Mais");
	private Artikel erbeere = new Artikel(154,"Deutsche Erdbeere");
	private Artikel hund = new Artikel(155,"Kleiner Hund");
	private Artikel katze = new Artikel(156,"Hauskatze");
	private Artikel pferd = new Artikel(157,"Araber");
	private Artikel kuh = new Artikel(158,"Hausrind");
	private Artikel fisch = new Artikel(159,"Hering");
	private Artikel fernseher = new Artikel(160,"LED Smart TV ");
	private Artikel schrank = new Artikel(161,"PAX Kleiderschrank");


	public ArtikelVerwaltung() {

	}

	Artikel[] artikelArray = new Artikel[10];
	// Artikel in Array einlesen
	public Artikel[] artikelEinlesen(){
		
		for(int i = 0; i < artikelArray.length; i ++){
			artikelArray[i] = kartoffel;
			i++;
			artikelArray[i] = mais;
			i++;
			artikelArray[i] = erbeere;
			i++;
			artikelArray[i] = hund;
			i++;
			artikelArray[i] = katze;
			i++;
			artikelArray[i] = pferd;
			i++;
			artikelArray[i] = kuh;
			i++;
			artikelArray[i] = fisch;
			i++;
			artikelArray[i] = fernseher;
			i++;
			artikelArray[i] = schrank;
			
		}return (artikelArray);
		
		
		
	}
	// Artikel in Array sortieren
	public void artikelSortieren(){

	}
	// alten Artikel auslagern
	public void artikelAuslagern(){

	}
	// neuen Artikel einlagern
	public void artikelEinlagern(){

	}
	// alle Artikel anzeigen
	public void alleArtikelAnzeigen(){

	}
	// einen bestimmten Artikel anzeigen " ID "
	public void artikelAnzeigenID(){

	}
	// einen bestimmten Artikel anzeigen " Name "
	public void artikelAnzeigenName(){

	}
	//


}
