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
