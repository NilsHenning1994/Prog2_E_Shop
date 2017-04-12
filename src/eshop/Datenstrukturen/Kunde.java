package eshop.Datenstrukturen;

public class Kunde {

	private int kundennr;		// Die Kundennummer die einem Kunden zugewiesen wird
	private String vorname;		// Vorname des Kunden
	private String nachname;	// Nachname des Kunden
	private String adresse;		// Adresse des Kunden
		
	public Kunde() {
		
	}
	
	// Gibt eine Darstellung der Objekte als String zurück
	public String toString() {
        String ergebnis = "Name: " + vorname + nachname + "\n";
        ergebnis += "Kundennummer: " + kundennr + "\n";
        ergebnis += "Adresse: " + adresse;
        return ergebnis;
    }
	
	public void WarenkorbAendern() {
		
	}
	
	public void WarenkorbLoeschen() {
		
	}
	
	public void ArtikelInWarenkorbLegen() {
		
	}
	
	
	
}
