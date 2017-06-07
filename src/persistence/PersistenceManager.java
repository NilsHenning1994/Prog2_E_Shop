package persistence;


import java.io.IOException;
import java.util.List;
import java.util.Vector;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Ereignis;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Datenstrukturen.Warenkorb;


public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle) throws IOException;
	public void openForWriting(String datenquelle) throws IOException;
	public boolean close();
		
	
	public Shop ladeShop(String datenQuelle) throws IOException;

	public Kunde ladeKunde() throws IOException;
	public Mitarbeiter ladeMitarbeiter() throws IOException;
	public Artikel ladeArtikel() throws IOException;
	public Ereignis ladeEreignis() throws IOException;
//	public String ladeLog() throws IOException;
	
	public void  speichereShop(Shop s, String datenQuelle) throws IOException;
	public boolean speichereWarenkorb(Warenkorb w) throws IOException;
	public void speicherEreignis(List<Ereignis> ereignisListe) throws IOException;
	
	
}
