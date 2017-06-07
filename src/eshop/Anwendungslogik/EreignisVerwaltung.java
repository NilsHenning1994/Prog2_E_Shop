package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Ereignis;
import eshop.Datenstrukturen.Mitarbeiter;

public class EreignisVerwaltung {

	private List<Ereignis> ereignisListe = new ArrayList<Ereignis>();
	
	
	
	public void addEreignis(Benutzer be, Artikel ar, int anz){
		Date date = new Date();
		Ereignis er = new Ereignis(date, ar,anz, be);
		ereignisListe.add(er);
	}
	
	
	

	public List<Ereignis> getEreignisListe() {
		return ereignisListe;
	}

	public void setEreignisListe(List<Ereignis> ereignisListe) {
		this.ereignisListe = ereignisListe;
	}
	public void addEreignisArtikelAnlegen(Mitarbeiter m, Artikel ar,int anz ){
		Date date = new Date();
		Ereignis er = new Ereignis(date, ar, anz, m );
		ereignisListe.add(er);
	}
	
	
	
	
	
	
	
}
