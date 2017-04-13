package eshop.Anwendungslogik;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Mitarbeiter;

public class MitarbeiterVerwaltung {
	

	private Mitarbeiter mi;
	private Artikel ar;


	public Artikel[] artikelSortierenNr(){
		Artikel [] sort = new Artikel[ar.getArtikelArray().length];
		Artikel[] array = ar.getArtikelArray();
		int safe = array[0].getArtikelnr();
		int count = 0;
		
		for(int i = 0; i<array.length; i++){
			if(array[i].getArtikelnr() < safe){
				sort[count] = array[i];
				count ++;
				i = 0;
			}
		}
		for(int j = 0; j<sort.length; j++){
			System.out.println(sort[j].getName()+", ");
			}
		return sort;
		
	}

	public void artikelAnlegen(){
	
	}
	
	public void artikelAdden(){
	
	}
}
