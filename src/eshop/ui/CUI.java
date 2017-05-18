package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import eshop.Shop;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Exceptions.BenutzerExistiertBereitsException;
import eshop.Exceptions.EinloggenFehlgeschlagenException;


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
	public float getInputFloat(){
		return Float.parseFloat(getInputLine());
	}







	// Methode zum Starten des EShops
	public void run() throws IOException {

		do{
			try {
				System.out.println("Mitarbeiter[M] oder Kunde[K]?");
				String input = br.readLine();

				//					---- Mitarbeiter ----

				if(input.equals("M")) {
					mitarbeiterStartMenü();
				} 

				//					---- Kunde ----

				if(input.equals("K")){
					kundenStartMenü();
				}

			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}while(true);
	}

	private void mitarbeiterStartMenü() throws IOException {
		do {
			System.out.println("Mitarbeiter");
			System.out.println("Registrieren   	-> R");
			System.out.println("Einloggen   	-> E");
			System.out.println("Abbruch			-> A");
			String input = br.readLine();

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

					try {
						success = shop.mitarbeiterRegi(vorname, nachname, mail, passwort);
						shop.speicherMitarbeiter();
					} catch (BenutzerExistiertBereitsException e) {
						System.out.println(e.getMessage());
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

				//							if(shop.mitarbeiterVorhanden(mail, passwort) == false){
				//								System.out.println("LOGIN FEHLGESCHLAGEN. LOGINDATEN FALSCH");
				//								return;
				//							}					

				try {
					eingeloggterMitarbeiter = shop.mitarbeiterEinloggen(mail, passwort);
				} catch (EinloggenFehlgeschlagenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				input = mitarbeiterMenü();

			}

			//						---- Abbrechen ---

			if(input.equals("A")){
				break;
			}		
		} while (true);
	}
	private String mitarbeiterMenü() throws IOException {
		String input;
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
				float fl = getInputFloat();				
				float preis = fl;

				System.out.println("Bestand:");
				int inputt = getInputInt();					
				int bestand = inputt;
				shop.artikelAnlegen(eingeloggterMitarbeiter, bez, preis, bestand);
				shop.printArtikelListe();
			}


			//								---- Mitarbeiter Ausloggen ---

			if (input.equals("Logout")){
				shop.mitarbeiterAusloggen(eingeloggterMitarbeiter);
			}
		}while(eingeloggterMitarbeiter.isLogin() == true);
		return input;
	}

	private void kundenStartMenü() throws IOException {
		String input;
		do {
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

					try {
						success = shop.kundeRegi(vorname, nachname, mail, passwort, adresse);
						shop.speicherKunde();
					} catch (BenutzerExistiertBereitsException e) {
						System.out.println(e.getMessage());
						System.out.println("Bittet noch mal!");
					}
					if (!success) {
					}
					if(success){
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
				try {
					eingeloggterKunde = shop.kundeEinloggen(mail, passwort);
					kundenMenü();
				} catch (EinloggenFehlgeschlagenException e) {
					System.out.println(e.getMessage());
				} // Methode zum Einloggen von Kunden 
			}

			//						---- Abbrechen ----

			if(input.equals("A")){
				break;
			}
		} while (true);
	}

	private void kundenMenü() throws IOException {
		String input;
		do{
			System.out.println("Artikel in den Warenkorb legen  	-> AW");
			System.out.println("Artikel kaufen  		-> AK");
			System.out.println("Warenkorb leeren  		-> WL");
			System.out.println("Warenkorb aendern  		-> WA");
			System.out.println("Warenkorbinhalt kaufen 	-> WK");
			System.out.println("Ausloggen			  -> Logout");
			input = br.readLine();

			//								---- Artikel in den Warenkorb legen ----

			switch (input) {
			case "AW": 
				break;
			case "AK":
				System.out.println("Artikel anhand ID auswählen");
				Artikel ar = shop.artikelSuchenNachID(getInputInt());
				int anz =  getInputInt();
				shop.artikelKaufen(eingeloggterKunde, ar, anz);
				break;
			case "WL":
				shop.warenkorbLeeren(eingeloggterKunde);
				break;
			case "Logout":
				shop.kundeAusloggen(eingeloggterKunde);
			}

			//			//if(input.equals("MAW")){
			//			//shop.MassengutartikelInWarenkorb(eingeloggterKunde, ma, anz);
			//			//}
			//
			//			//								---- einzelnen Artikel kaufen ----
			//
		}while(eingeloggterKunde.isLogin() == true);
	}

	public CUI() {

		this.br =  new BufferedReader(new InputStreamReader(System.in));
		try {
			this.shop = new Shop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	//	public boolean isAlpha(String text) throws EingabeException {
	//		for (char c : text.toCharArray()) {
	//
	//			// a - z
	//			if (c >= 'a' && c <= 'z')
	//				continue;
	//
	//			// A - Z
	//			if (c >= 'A' && c <= 'Z')
	//				continue;
	//
	//			// ï¿½, ï¿½, ï¿½, ï¿½
	//			if (c == 'ï¿½' || c == 'ï¿½' || c == 'ï¿½' || c == 'ï¿½')
	//				continue;
	//
	//			throw new EingabeException(text);
	//			//            return false;
	//		}
	//		return true;
	//	}



	public static void main(String[] args) {

		CUI cui = new CUI();
		try {
			cui.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
