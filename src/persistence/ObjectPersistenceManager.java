package persistence;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import eshop.Shop;

public class ObjectPersistenceManager implements PersistenceManager {

	// Buffer zum schreiben des Objekt alles was ich übergebe der ganze Shop
	ObjectOutputStream outputStream= null;
	//Buffer zum ausgabe des Shops
	ObjectInputStream inputStream= null;



	@Override

	//Der Lese Stream wird geöffnet vom gespeicherten Shop 
	public void openForReading(String datenquelle) throws IOException {
		inputStream= new ObjectInputStream(new BufferedInputStream(new FileInputStream(datenquelle)));

	}

	@Override
	// bauen die verbindung zur Shopdatei auf  ... input greift auf Shop , Shop gibt es an  output zum speichert weiter // input >Shop> output 
	public void openForWriting(String datenquelle) throws IOException {
		outputStream= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datenquelle)));

	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}




	//	public User ladeUser(List<Station> stationen) throws IOException {


	@Override
	public void speichereShop(Shop shop,String datenQuelle){

		try {
			openForWriting("src/"+datenQuelle);
			outputStream.writeObject(shop);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}		
	@Override
	public  Shop ladeShop(String datenQuelle){
		Shop shop= null;
		try {
			openForReading("src/"+datenQuelle);
			shop = (Shop)inputStream.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	

		return shop;
	}









}


