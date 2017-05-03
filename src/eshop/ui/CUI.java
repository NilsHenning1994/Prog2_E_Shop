package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import eshop.Shop;
import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Datenstrukturen.Artikel;


public class CUI {
	
	private Shop shop;
	private Artikel ar;
	private ArtikelVerwaltung av;

	Artikel testArtikel = new Artikel("a",1,2,10);
	Artikel testArtikel1 = new Artikel("d",1,3,11);
	Artikel testArtikel2 = new Artikel("k",4,5,6);
	Artikel testArtikel3 = new Artikel("l",6,7,4);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void setConsoleLine(String s){
		System.out.println(s);
	}
	public String getInputLine(){
		String s = "";
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	public int getInputInt(){
		return Integer.parseInt(getInputLine());
	}


	// Methode zum Starten des EShops
	public void run(Vector<Artikel> artikelListe){

		do{
			
			av.artikelAnlegen(testArtikel);
			av.artikelAnlegen(testArtikel1);
			av.artikelAnlegen(testArtikel2);
			av.artikelAnlegen(testArtikel3);
			av.getArtikelliste();
<<<<<<< HEAD
			av.bubblesrt(artikelListe);
			av.getArtikelliste();
=======
>>>>>>> ef530011337fa70d6df471eed597dd3bafba2d65
			System.out.println("Mitarbeiter[M] oder Kunde[K]?");
			try {
				String input = br.readLine();
				if(input.equals("M")){
					System.out.println("Mitarbeiter");
					System.out.println("Artikel anzeigen[S]");
					String inputt = br.readLine();
					if(inputt.equals("S")){
					//	next operation
					}
				}
				
				if(input.equals("K")){
					System.out.println("Kunde");					
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(true);
	}

	public CUI() {

		super();
		this.br =  new BufferedReader(new InputStreamReader(System.in));
		this.shop = new Shop();
		this.av = new ArtikelVerwaltung();

	}
	
	public static void main(String[] args) {

		CUI cui = new CUI();
		cui.run(null);
}

}