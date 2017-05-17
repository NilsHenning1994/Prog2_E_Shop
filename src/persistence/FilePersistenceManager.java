package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import eshop.Shop;
import eshop.Datenstrukturen.Adresse;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Mitarbeiter;

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
		int intid = Integer.parseInt(id);
		if (id == null) {
			// keine Daten mehr vorhanden
			return null;
		}
		String Name = liesZeile();	
		String Nachname = liesZeile();
		String Mail = liesZeile();
		String Passwort = liesZeile();


		return new Mitarbeiter(intid, Name, Nachname,Mail,Passwort,true);
	}

	public Kunde ladeKunde() throws IOException {
		// id einlesen
		String id = liesZeile();
		// ... und von String in int konvertieren
		int intid = Integer.parseInt(id);
		if (id == null) {
			// keine Daten mehr vorhanden
			return null;
		}
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
		// Nummer des Artikels mit parse
		String nr = liesZeile(); 
		int intnr = Integer.parseInt(nr);
		// Preis des Artikels mit parse
		String preis = liesZeile();
		int intpreis = Integer.parseInt(preis);
		// Bestand des Artikels mit parse
		String bestand = liesZeile();
		int intbestand = Integer.parseInt(bestand);

		return new Artikel(bez,intnr,intpreis,intbestand);
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
			schreibeZeile("false");

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
}
