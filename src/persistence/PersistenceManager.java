package persistence;


import java.io.IOException;
import java.util.List;
import java.util.Vector;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Warenkorb;


public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle) throws IOException;
	public void openForWriting(String datenquelle) throws IOException;
	public boolean close();
		
	
	public Shop ladeShop(String datenQuelle) throws IOException;
	public Warenkorb ladeWarenkorb(Vector<Artikel> artikelListe, List<Kunde> kundenListe) throws IOException;


	
	public void  speichereShop(Shop s, String datenQuelle) throws IOException;
	public boolean speichereWarenkorb(Warenkorb w) throws IOException;
	
}
