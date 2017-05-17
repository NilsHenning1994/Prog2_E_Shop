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
import eshop.Exceptions.TestException;
import persistence.ObjectPersistenceManager;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import eshop.Exceptions.EingabeException;


public class CUI {

	private Shop shop;

	private Mitarbeiter eingeloggterMitarbeiter = null;
	private Kunde eingeloggterKunde = null;
	private int xnr = -1;




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
	public void run() throws IOException, BenutzerExistiertBereitsException{



		do{
			try {
				ObjectPersistenceManager ladeManager = new ObjectPersistenceManager();
				shop = ladeManager.ladeShop("test");
				setXnr(shop.getXnr());





				do{
					System.out.println("Mitarbeiter[M] oder Kunde[K]?");
					System.out.println("[S] um den aktuellen Stand zu speichern");
					String input = br.readLine();

					//					---- Mitarbeiter ----

					if(input.equals("M")){
						System.out.println("Mitarbeiter");
						System.out.println("Registrieren   	-> R");
						System.out.println("Einloggen   	-> E");
						System.out.println("Abbruch			-> A");
						input = br.readLine();

						//						---- Mitarbeiter Registrieren ---

						if(input.equals("R")){
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

						//						---- Mitarbeiter Einloggen ----

						if(input.equals("E")){ // Methode zum Einloggen von Mitarbeitern
							System.out.println("Bitte geben sie ihre Daten nacheinander ein!");
							System.out.println("Email Adresse:");
							input = br.readLine();					
							String mail = input;

							System.out.println("Passwort:");
							input = br.readLine();					
							String passwort = input;


							eingeloggterMitarbeiter = shop.mitarbeiterEinloggen(mail, passwort);

							do{
								System.out.println("Bestand von Artikel aendern  	-> BA");
								System.out.println("Neuen Artikel anlegen  		-> AA");
								System.out.println("Ereignisliste anzeigen 		-> EA");
								System.out.println("Ausloggen			  -> Logout");

								input = br.readLine();

								//								---- Ereignisliste Anzeigen ----

								if(input.equals("EA")){
									shop.printEreignisListe();
								}


								//								---- Bestand von Artikel aendern ----
								if(input.equals("BA")){
									System.out.println("Von welchem Artikel den Bestand aendern?");
									shop.printArtikelListe();
									System.out.println("Waehlen Sie den Artikel anhand der ID aus");
									int inputt =  getInputInt();
									int id = inputt;
									Artikel ar;
									if(!shop.artikelSuchenNachID(id).equals(null)){
										ar = shop.artikelSuchenNachID(id);
										System.out.println("Um wieviel wollen Sie den bestand des Artikels "+ ar.getBez() + " aendern?");

										inputt =  getInputInt();
										int anz = inputt;
										shop.bestandAendern(eingeloggterMitarbeiter, ar, anz);
										System.out.println("Artikel wurde erfolgreich geaendert!");
										shop.printArtikelListe();
									}else{
										//System.out.println("Artikelnummer existiert nicht"); // besser Exception
									}



								}

								//								---- Artikel Anlegen ---

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
									shop.printArtikelListe();
								}


								//								---- Mitarbeiter Ausloggen ---

								if (input.equals("Logout")){
									shop.mitarbeiterAusloggen(eingeloggterMitarbeiter);
								}
							}while(eingeloggterMitarbeiter.isLogin() == true);

						}

						//						---- Abbrechen ---

						if(input.equals("A")){
							break;
						}else{
							break;
						}
					}

					if(input.equals("S")){
						System.out.println("Spiel Speichern? (y/n)");
						//						BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						String speichern = br.readLine();
						if(speichern.equals("y")){
							ObjectPersistenceManager objectPersistenceManager = new ObjectPersistenceManager();
											objectPersistenceManager.speichereShop(shop, "test");

							System.out.println("");
							System.out.println("Spiel wurde gepeichert!");
							System.out.println("");
						}
					}

					//					---- Kunde ----

					if(input.equals("K")){
						System.out.println("Kunde");	
						System.out.println("Registrieren   	-> R");
						System.out.println("Einloggen   	-> E");
						System.out.println("Abbruch			-> A");
						input = br.readLine();

						//						---- Kunde Registrieren ----

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
								System.out.println("StraÃŸe:");
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

							//							---- Als Kunde Einloggen ----
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


							do{
								System.out.println("Artikel in den Warenkorb legen  	-> AW");
								System.out.println("Artikel kaufen  		-> AK");
								System.out.println("Warenkorb leeren  		-> WL");
								System.out.println("Warenkorb aendern  		-> WA");
								System.out.println("Warenkorbinhalt kaufen 	-> WK");
								System.out.println("Ausloggen			  -> Logout");
								input = br.readLine();

								//								---- Artikel in den Warenkorb legen ----

								if(input.equals("AW")){


								}

								//								---- einzelnen Artikel kaufen ----

								if(input.equals("AK")){

								}

								//								---- Warenkorb leeren ----

								if(input.equals("WL")){

									//										next operation
								}

								//								---- Warenkorb aendern (Artikel entfernen/ Anzahl von Artikeln aendern) ----

								if(input.equals("WA")){

									//										next operation
								}

								//								---- Warenkorbinhalt kaufen ----

								if(input.equals("WK")){

									//										next operation
								}

								//								---- Kunden ausloggen ----

								if (input.equals("Logout")){
									shop.kundeAusloggen(eingeloggterKunde);
								}
							}while(eingeloggterKunde.isLogin() == true);

						}

						//						---- Abbrechen ----

						if(input.equals("A")){
							break;
						}else{
							break;
						}



					}while(true);
				}while(true);

			}catch (IOException e) {
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


	public boolean isAlpha(String text) throws EingabeException {
		for (char c : text.toCharArray()) {

			// a - z
			if (c >= 'a' && c <= 'z')
				continue;

			// A - Z
			if (c >= 'A' && c <= 'Z')
				continue;

			// ö, ü, ä, ß
			if (c == 'ö' || c == 'ß' || c == 'ä' || c == 'ü')
				continue;

			throw new EingabeException(text);
			//            return false;
		}
		return true;
	}



	public static void main(String[] args) throws Exception {

		CUI cui = new CUI();
		cui.run();
	}



	public int getXnr() {
		return xnr;
	}
	public void setXnr(int xnr) {
		this.xnr = xnr;
	}

}
