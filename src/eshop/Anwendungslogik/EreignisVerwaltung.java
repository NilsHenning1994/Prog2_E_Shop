package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Ereignis;
import eshop.Datenstrukturen.Mitarbeiter;

public class EreignisVerwaltung {

	private List<Ereignis> ereignisListe = new ArrayList<Ereignis>();
	
	
	
	public void addEreignis(Mitarbeiter ma, Artikel ar, int anz){
		Date date = new Date();
		Ereignis er = new Ereignis(date, ar,anz, ma);
		ereignisListe.add(er);
	}
	
	
	

	public List<Ereignis> getEreignisListe() {
		return ereignisListe;
	}

	public void setEreignisListe(List<Ereignis> ereignisListe) {
		this.ereignisListe = ereignisListe;
	}
	
	
	
	
	
	
	
}
