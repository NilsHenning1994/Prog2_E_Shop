package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import eshop.Anwendungslogik.ArtikelVerwaltung;
import eshop.Anwendungslogik.KundenVerwaltung;
import eshop.Anwendungslogik.MitarbeiterVerwaltung;


public class CUI {
	private ArtikelVerwaltung av;
	private MitarbeiterVerwaltung mv;
	private KundenVerwaltung kv;

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



	public void run(){

		do{
			System.out.println("Mitarbeiter[M] oder Kunde[K]?");
			try {
				String input = br.readLine();
				if(input.equals("M")){
					System.out.println("Mitarbeiter");
					System.out.println("Artikel nach Artikelnr sortieren[S]");
					String inputt = br.readLine();
					if(inputt.equals("S")){
						mv.artikelSortierenNr();
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
		av = new ArtikelVerwaltung();
		mv = new MitarbeiterVerwaltung();
		kv = new KundenVerwaltung();

	}
}