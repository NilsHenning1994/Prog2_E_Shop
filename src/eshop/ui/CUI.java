package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;


public class CUI {

	private Shop shop;

	private Benutzer eingeloggterBenutzer = null;



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

			System.out.println("Mitarbeiter[M] oder Kunde[K]?");
			try {
				String input = br.readLine();
				if(input.equals("M")){
					System.out.println("Mitarbeiter");
					System.out.println("Registrieren   	-> R");
					System.out.println("Einloggen   	-> E");
					System.out.println("Abbruch			-> A");
					input = br.readLine();
					if(input.equals("R")){ // Methode zum Registrieren von Mitarbeitern

						boolean success = false;
						do {
							System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
							System.out.println("Vorname:");
							input = br.readLine();					
							String vorname = input;

							System.out.println("Nachname:");
							input = br.readLine();					
							String nachname = input;

							System.out.println("Mail:");
							input = br.readLine();					
							String mail = input;

							System.out.println("Passwort:");
							input = br.readLine();					
							String passwort = input;

							success = shop.mitarbeiterRegi(vorname, nachname, mail, passwort);
							if (!success) {
								System.out.println("Bittet noch mal!");
							}
						} while (!success);
						System.out.println("Erfolgreich registriert");
					}
					if(input.equals("E")){ // Methode zum Einloggen von Mitarbeitern
						System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
						System.out.println("Email Adresse:");
						input = br.readLine();					
						String mail = input;

						System.out.println("Passwort:");
						input = br.readLine();					
						String passwort = input;
						eingeloggterBenutzer = shop.mitarbeiterEinloggen(mail, passwort);
						
						System.out.println("Bestand von Artikel ändern  	-> BA");
						System.out.println("Neuen Artikel anlegen  			-> AA");
						if(input.equals("BA")){
							
						
						}
						if(input.equals("AA")){
							//	next operation
						}
					}
					if(input.equals("E")){  // Methode zum Einloggen von Mitarbeitern einfuegen
						System.out.println("Sie sind eingeloggt");
						input = br.readLine();
						System.out.println("Bestand von Artikel ändern  	-> BA");
						System.out.println("Neuen Artikel anlegen  			-> AA");
						if(input.equals("BA")){
							//	next operation
						}
						if(input.equals("AA")){
							//	next operation
						}
					}
					if(input.equals("A")){
						break;
					}else{
						break;
					}
				}

				if(input.equals("K")){
					System.out.println("Kunde");	
					System.out.println("Registrieren   	-> R");
					System.out.println("Einloggen   	-> E");
					System.out.println("Abbruch			-> A");
					input = br.readLine();
					if(input.equals("R")){  // Methode zum Registrieren von Kunden einfuegen
						//	next operation
					}
					if(input.equals("E")){
						//	Shop.mv.einloggen // Methode zum Einloggen von Kunden einfuegen
						System.out.println("Methode zum einloggen fehlt noch");
					}
					if(input.equals("A")){
						break;
					}else{
						break;
					}
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


	}

	public static void main(String[] args) {

		CUI cui = new CUI();
		cui.run(null);
	}

}