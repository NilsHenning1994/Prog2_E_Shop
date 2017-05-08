package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import eshop.Shop;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;


public class CUI {

	private Shop shop;

	private Mitarbeiter eingeloggterMitarbeiter = null;
	private Kunde eingeloggterKunde = null;



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
				do{
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
								shop.printMitarbeiterListe();

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
							shop.printMitarbeiterListe();
						}

						if(input.equals("E")){ // Methode zum Einloggen von Mitarbeitern
							System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
							System.out.println("Email Adresse:");
							input = br.readLine();					
							String mail = input;

							System.out.println("Passwort:");
							input = br.readLine();					
							String passwort = input;
							eingeloggterMitarbeiter = shop.mitarbeiterEinloggen(mail, passwort);

							if(eingeloggterMitarbeiter != null){
								System.out.println("Bestand von Artikel ‰ndern  	-> BA");
								System.out.println("Neuen Artikel anlegen  			-> AA");
								System.out.println("Ausloggen			  			-> Logout");
								if(input.equals("BA")){


								}
//								------> kommt nicht bis hier her! <-------
								if(input.equals("AA")){


									System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
									System.out.println("Bezeichnung:");
									input = br.readLine();					
									String bez = input;

									System.out.println("Preis:");
									int inputt = getInputInt();				
									int preis = inputt;

									System.out.println("Bestand:");
									inputt = getInputInt();					
									int bestand = inputt;
									shop.artikelAnlegen(eingeloggterMitarbeiter, bez, preis, bestand);
								}
								if (input.equals("Logout")){
									shop.mitarbeiterAusloggen(eingeloggterMitarbeiter);
								}
							}while(eingeloggterMitarbeiter != null);
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

						if(input.equals("R")){ // Methode zum Registrieren von Kunden

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


								System.out.println("Adresse");
								System.out.println("Straﬂe:");
								input = br.readLine();					
								String strasse = input;

								System.out.println("Hausnummer:");
								input = br.readLine();					
								String hnr = input;

								System.out.println("PLZ:");
								input = br.readLine();					
								String plz = input;

								System.out.println("Stadt:");
								input = br.readLine();					
								String stadt = input;
								Adresse adresse = new Adresse(strasse, hnr, plz, stadt);

								System.out.println("Passwort:");
								input = br.readLine();					
								String passwort = input;

								success = shop.kundeRegi(vorname, nachname, mail, passwort, adresse);
								if (!success) {
									System.out.println("Bittet noch mal!");
								}
							} while (!success);
							System.out.println("Erfolgreich registriert");
							shop.printKundenListe();
						}
						if(input.equals("E")){
							System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
							System.out.println("Email Adresse:");
							input = br.readLine();					
							String mail = input;

							System.out.println("Passwort:");
							input = br.readLine();					
							String passwort = input;
							eingeloggterKunde = shop.kundeEinloggen(mail, passwort); // Methode zum Einloggen von Kunden 
						}
						if(input.equals("A")){
							break;
						}else{
							break;
						}
					}
				}while(true);
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