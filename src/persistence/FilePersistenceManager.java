package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import eshop.Shop;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
import eshop.Datenstrukturen.Ereignis;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;
import eshop.Datenstrukturen.Warenkorb;

/**
 * @author teschke
 *
 * Realisierung einer Schnittstelle zur persistenten Speicherung von
 * Daten in Dateien.
 * @see bib.local.persistence.PersistenceManager
 */
public class FilePersistenceManager implements PersistenceManager {

	private BufferedReader reader = null;
	private PrintWriter writer = null;

	public void openForReading(String datei) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(datei));
	}

	public void openForWriting(String datei) throws IOException {
		writer = new PrintWriter(new BufferedWriter(new FileWriter(datei)));
	}

	public boolean close() {
		if (writer != null)
			writer.close();

		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return false;
			}
		}

		return true;
	}

	public Mitarbeiter ladeMitarbeiter() throws IOException {

		// id einlesen
		String id = liesZeile();

		// ... und von String in int konvertieren

		if (id == null) {
			// keine Daten mehr vorhanden
			return null;
		}
		int intid = Integer.parseInt(id);
		String Name = liesZeile();	
		String Nachname = liesZeile();
		String Mail = liesZeile();
		String Passwort = liesZeile();
		liesZeile();

		Mitarbeiter m = new Mitarbeiter(intid, Name, Nachname, Mail, Passwort, false);
		if(reader != null){
			return m;
		}
		else{
			return m;
		}

	}

	public Kunde ladeKunde() throws IOException {
		// id einlesen
		String id = liesZeile();
		if (id == null) {
			// keine Daten mehr vorhanden
			return null;
		}
		// ... und von String in int konvertieren
		int intid = Integer.parseInt(id);
		String Name = liesZeile();	
		String Nachname = liesZeile();
		String strasse = liesZeile();
		String hausnummer = liesZeile();
		String plz = liesZeile();
		String stadt = liesZeile();
		Adresse adress = new Adresse(strasse,hausnummer,plz,stadt);
		String Mail = liesZeile();
		String Passwort = liesZeile();

		return new Kunde(intid, Name, Nachname,Mail,adress,Passwort,true);
	}

	public Artikel ladeArtikel() throws IOException {
		// Bezeichnung des Artikels
		String bez = liesZeile();
		if (bez == null) {
			// keine Daten mehr vorhanden
			return null;
		}
		// Nummer des Artikels mit parse
		String nr = liesZeile(); 
		int intnr = Integer.parseInt(nr);
		// Preis des Artikels mit parse
		String preis = liesZeile();
		float floatpreis = Float.parseFloat(preis);
		// Bestand des Artikels mit parse
		String bestand = liesZeile();
		int intbestand = Integer.parseInt(bestand);

		return new Artikel(bez,intnr,floatpreis,intbestand);
	}

	public Ereignis ladeEreignis() throws IOException {
		
		String inhalt = liesZeile();
		StringTokenizer token = new StringTokenizer(inhalt);
		int length = token.countTokens();  // Anzahl Teile, die gefunden werden.
		String[] array = new String[6];  // Den Array herstellen
		for( int i = 0; i < length; i++ ){
		  array[i] = token.nextToken();  // Die einzelnen Teile abspeichern.
		  
		  
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		int intMonth = Integer.parseInt(array[0]);
		int intDay	  = Integer.parseInt(array[0+1]);
		int intYear  = Integer.parseInt(array[0+2]);
		int intHour  = Integer.parseInt(array[0+3]);
		int intMinute = Integer.parseInt(array[0+4]);
		int intSecond = Integer.parseInt(array[0+5]);		
		Calendar wann;
		
		//System.out.println(wann);
		return null;
		
		
		/*		Artikel artikel;
		int anz;
		Benutzer user;

		// Artikel
		String bez = liesZeile();
		int nummer;
		float preis;
		int bestand;


		Date date;

		Artikel art = new Artikel(bez, nummer, preis, bestand);

		return new Ereignis(wann, artikel, anz, user);*/
	}


	public boolean speichereMitarbeiterliste(List<Mitarbeiter> m) throws IOException {
		System.out.println("List size:" + m.size());

		for(int i = 0; i < m.size(); i++){
			int id = 	m.get(i).getId();
			String stringid = Integer.toString(id);
			schreibeZeile(stringid);
			schreibeZeile(m.get(i).getVorname());
			schreibeZeile(m.get(i).getNachname());
			schreibeZeile(m.get(i).getEmail());
			schreibeZeile(m.get(i).getPasswort());
			schreibeZeile("false");

		}

		return true;

	}

	public boolean speichereKundeliste(List<Kunde> k) throws IOException {
		System.out.println("List size:" + k.size());

		for(int i = 0; i < k.size(); i++){
			int id = 	k.get(i).getId();
			String stringid = Integer.toString(id);
			schreibeZeile(stringid);
			schreibeZeile(k.get(i).getVorname());
			schreibeZeile(k.get(i).getNachname());
			schreibeZeile(k.get(i).getAdresse().getStrasse());
			schreibeZeile(k.get(i).getAdresse().getHausnummer());
			schreibeZeile(k.get(i).getAdresse().getPlz());
			schreibeZeile(k.get(i).getAdresse().getStadt());
			schreibeZeile(k.get(i).getEmail());
			schreibeZeile(k.get(i).getPasswort());

		}

		return true;

	}

	public boolean speichereArtikelliste(List<Artikel> a) throws IOException {
		System.out.println("List size:" + a.size());

		for(int i = 0; i < a.size(); i++){

			schreibeZeile(a.get(i).getBez());

			String nummer = Integer.toString(a.get(i).getNummer());
			schreibeZeile(nummer);

			String preis = Float.toString(a.get(i).getPreis());
			schreibeZeile(preis);

			String bestand = Integer.toString(a.get(i).getBestand());
			schreibeZeile(bestand);


		}

		return true;

	}
	public void speicherEreignis(List<Ereignis> e) {
		System.out.println("List size:" + e.size());

		for(int i = 0; i < e.size(); i++){

			// Date to String
			
			int intMonth = e.get(i).getWann().getMonth();
			int intDay	  = e.get(i).getWann().getDay();
			int intYear  = e.get(i).getWann().getYear();
			int intHour  = e.get(i).getWann().getHours();
			int intMinute = e.get(i).getWann().getMinutes();
			int intSecond = e.get(i).getWann().getSeconds();
			String Month = Integer.toString(intMonth);
			String Day	  = Integer.toString(intDay);
			String Year  = Integer.toString(intYear);
			String Hour  = Integer.toString(intHour);
			String Minute = Integer.toString(intMinute);
			String Second = Integer.toString(intSecond);
			String Date = "!"+ Month +"!"+ Day+ "!" + Year +"!"+ Hour +"!"+ Minute +"!"+ Second;
			
			
			schreibeZeile(Date);
			// Artikel
			schreibeZeile(e.get(i).getArtikel().getBez());
			// Int to String
			int nr = 	e.get(i).getArtikel().getNummer();
			String stringnr = Integer.toString(nr);
			schreibeZeile(stringnr);
			// Float to String
			float pr = 	e.get(i).getArtikel().getPreis();
			String stringpr = Float.toString(pr);
			schreibeZeile(stringpr);
			// Int to String
			int bes = 	e.get(i).getArtikel().getBestand();
			String stringbes = Integer.toString(bes);
			schreibeZeile(stringbes);

			int id = 	e.get(i).getUser().getId();
			String stringid = Integer.toString(id);
			schreibeZeile(stringid);
			schreibeZeile(e.get(i).getUser().getVorname());
			schreibeZeile(e.get(i).getUser().getNachname());

			//			schreibeZeile(e.get(i).getUser().getAdresse().getStrasse());
			//			schreibeZeile(e.get(i).getUser().getAdresse().getHausnummer());
			//			schreibeZeile(e.get(i).getUser().getAdresse().getPlz());
			//			schreibeZeile(e.get(i).getUser().getAdresse().getStadt());

			schreibeZeile(e.get(i).getUser().getEmail());
			schreibeZeile(e.get(i).getUser().getPasswort());
		}

		// Ereignis Date wann, Artikel artikel, int anz, Benutzer user



	}





	private String liesZeile() throws IOException {
		if (reader != null)
			return reader.readLine();
		else
			return "";
	}

	private void schreibeZeile(String daten) {
		if (writer != null)
			writer.println(daten);
	}

	@Override
	public Shop ladeShop(String datenQuelle) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void speichereShop(Shop s, String datenQuelle) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean speichereWarenkorb(Warenkorb w) throws IOException {
		// Titel, Nummer und Verfuegbarkeit schreiben
		schreibeZeile("" + w.getKunde().getId());
		for(int i = 0; i<w.getEintraege().size(); i++){
			schreibeZeile("" + w.getEintraege().get(i));
		}

		return true;
	}







	//	// Warenkorb
	//
	//	/**
	//	 * Methode zum Einlesen der Warenkorbdatei aus einer externen Datenquelle.
	//	 * 
	//	 * @return Warenkorb-Objekt, wenn Einlesen erfolgreich, false null
	//	 * @throws java.io.IOException
	//	 */
	//
	//	public Warenkorb ladeWarenkorb(Vector<Artikel> artikelListe, List<Kunde> kundenListe) throws IOException {
	//		Vector<Artikel> artikel = artikelListe;
	//		List<Kunde> kunden = kundenListe;
	//		Kunde kunde = null;
	//		Vector<Artikel> artikels = null;
	//
	//		String wknr = liesZeile();
	//		if (wknr == null) {
	//			// keine Daten mehr vorhanden
	//			return null;
	//		}
	//		String kundennr = liesZeile();
	//		if (kundennr == null) {
	//			// keine Daten mehr vorhanden
	//			return null;
	//		}
	//
	//		int knr = Integer.parseInt(kundennr);
	//		for (Kunde k : kunden) {
	//			if (k.getId() == knr) {
	//				kunde = k;
	//				break;
	//			}
	//		}
	//		int lel;
	//		while(liesZeile() != null){
	//			String artikelnr = liesZeile();
	//			for(Artikel a : artikel){
	//				lel = Integer.parseInt(artikelnr);
	//				if(a.getNummer() ==(lel)){
	//					artikels.add(a);
	//				}
	//
	//			}
	//		}
	//
	//		return new Warenkorb(kunde);
	//	}


}
