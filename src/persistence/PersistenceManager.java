package persistence;


import java.io.IOException;

import eshop.Shop;

public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle) throws IOException;
	
	public void openForWriting(String datenquelle) throws IOException;
	
	public boolean close();
		
	public Shop ladeShop(String datenQuelle) throws IOException;
	
	public void  speichereShop(Shop s, String datenQuelle) throws IOException;


	
}
