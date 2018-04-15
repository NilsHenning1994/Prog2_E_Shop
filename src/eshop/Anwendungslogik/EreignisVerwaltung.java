package eshop.Anwendungslogik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.User;
import eshop.Datenstrukturen.Ereignis;
import eshop.Datenstrukturen.Mitarbeiter;
import persistence.FilePersistenceManager;
import persistence.PersistenceManager;

public class EreignisVerwaltung {
	
	public EreignisVerwaltung (FilePersistenceManager fp) throws IOException {
		this.fp = fp;
	}

	private List<Ereignis> ereignisListe = new ArrayList<Ereignis>();
	private List<String> log = new ArrayList<String>();
	private PersistenceManager fp = null; // = new FilePersistenceManager();
	
	public void ladeEreignis(ArtikelVerwaltung av, KundenVerwaltung kv, MitarbeiterVerwaltung mv) throws IOException {
		fp.openForReading("SHOP_E.txt");
		Ereignis e;
		do {
			e = fp.ladeEreignis(av, kv, mv);
			if (e != null)
				ereignisListe.add(e);
		} while (e != null);
		fp.close();
	}
	
	
	
	
	
	public void addEreignis(User be, Artikel ar, int anz){
//		Date date = new Date();
		Ereignis er = new Ereignis( ar,anz, be);
		ereignisListe.add(er);
	}
	
	
	

	public List<Ereignis> getEreignisListe() {
		return ereignisListe;
	}

	public void setEreignisListe(List<Ereignis> ereignisListe) {
		this.ereignisListe = ereignisListe;
	}
	public void addEreignisArtikelAnlegen(Mitarbeiter m, Artikel ar,int anz ){
//		Date date = new Date();
		Ereignis er = new Ereignis(ar, anz, m );
		ereignisListe.add(er);
	}

	
}
