package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Rechnung;
import eshop.Datenstrukturen.Warenkorb;
import eshop.Datenstrukturen.WarenkorbEintrag;

public class ShoppingServices {

	private ArtikelVerwaltung av = null;
	private Rechnung rechnung;
//	
	public void artikelInWarenkorb(Kunde kunde, Artikel artikel, int anz){
		
		if(artikel.getBestand()>=anz){
			artikel.setBestand(artikel.getBestand()-anz);
			WarenkorbEintrag eintrag = new WarenkorbEintrag(artikel, anz);
			kunde.getCart().addEintrag(eintrag);
			
			
		}else{
//			Fehlermeldung werfen
			return;
		}
	}
	

	
	public void warenkorbAendern(Kunde kunde, Artikel artikel, int anz){
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
		if(kunde.getCart().getEintraege().contains(artikel)){
			int stueck = kunde.getCart().getEintraege().get(i).getStueckzahl() + anz;
			kunde.getCart().getEintraege().get(i).setStueckzahl(stueck);
		}
		}
		
	}
	
	
//	Warenkorb wird geleert und reservierte Artikel wieder freigegeben.
	public void warenkorbLeeren(Kunde kunde){
		kunde.getCart().getEintraege().clear();
	}
	
	public Rechnung rechnungErstellen(Kunde kunde, Date date, Artikel artikel, int bestand, int preisinfo, int gesamt){
		int summe = 0;
		rechnung.setKunde(kunde);
		rechnung.setDatum(date);
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
			rechnung.getArtikelListe().set(i, artikel);
			rechnung.getArtikelListe().get(i).setBestand(bestand);
			rechnung.getArtikelListe().get(i).setPreis(preisinfo);
			summe = summe + (int) rechnung.getArtikelListe().get(i).getPreis();
		}
		rechnung.setGesamtpreis(summe);
		return rechnung;
	}
	
	
	
//	Kunden können im Warenkorb enthaltene Artikel kaufen, wobei der Warenkorb geleert wird und
//	die Artikel aus dem Bestand genommen werden. Es wird ein Rechnungsobjekt erzeugt und auf
//	dem Bildschirm ausgegeben. Das Rechnungsobjekt enthält u.a. Kunde, Datum, die gekauften
//	Artikel inkl. Stückzahl und Preisinformation sowie den Gesamtpreis. 
	
	public Rechnung artikelKaufen(Kunde kunde){
		Rechnung rechnung = null;
		int stueck;
		int bestand;
		int id;
		
		Warenkorb cart = kunde.getCart();
		List<WarenkorbEintrag> eintraege = cart.getEintraege();
		for (WarenkorbEintrag eintrag: eintraege) {
			// eintrag auslesen
		}
		
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
			stueck = kunde.getCart().getEintraege().get(i).getStueckzahl();
			id = kunde.getCart().getEintraege().get(i).getArtikel().getNummer();
			for(int j = 0; j< av.getArtikelListe().size();j++){
				if(av.getArtikelListe().get(j).getNummer() == id){
					bestand = av.getArtikelListe().get(j).getBestand();
					av.getArtikelListe().get(j).setBestand(bestand-stueck);
				}
			}
		}
		warenkorbLeeren(kunde);
		return rechnung;
//		Wie werden Werte übergeben???
//		rechnungErstellen(kunde, Date date, kunde.getCart().getEintraege().getClass())
	}
}











































































