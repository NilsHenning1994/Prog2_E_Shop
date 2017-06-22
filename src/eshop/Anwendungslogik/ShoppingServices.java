package eshop.Anwendungslogik;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Massengutartikel;
import eshop.Datenstrukturen.Rechnung;
import eshop.Datenstrukturen.Warenkorb;
import eshop.Datenstrukturen.WarenkorbEintrag;
import eshop.Exceptions.ArtikelExistiertBereitsException;
import eshop.Exceptions.FehlerException;
import persistence.PersistenceManager;

public class ShoppingServices {

	private ArtikelVerwaltung av = null;
	


	// Ein Artikel wird in den Warenkorb gelegt z.B. ein Buch
	public void artikelInWarenkorb(Kunde kunde, Artikel artikel, int anz) throws FehlerException{

		if(artikel.getBestand()>=anz){
			artikel.setBestand(artikel.getBestand()-anz);
			WarenkorbEintrag eintrag = new WarenkorbEintrag(artikel, anz);
			kunde.getCart().addEintrag(eintrag);


		}else{
			throw new FehlerException();
		}
	}

	// Ein Massengutartikel wird in den Warenkorb gelegt z.B. ein 6er sprich 6 einzelne Flaschen Bier
	public void MartikelInWarenkorb(Kunde kunde, Massengutartikel ma, int anz) {

		int packungsgroesse = ma.getPackungsgroesse();
		if(anz % packungsgroesse != 0){
			System.out.println("Hier fehlt eine exception");
		} else {
			WarenkorbEintrag eintrag = new WarenkorbEintrag(ma, anz);
			kunde.getCart().addEintrag(eintrag);
		}

	}
	
	


	// Aendert die Stueckzahl im Warenkorb
	public void warenkorbAendern(Kunde kunde, Artikel artikel, int anz){
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
			if(kunde.getCart().getEintraege().contains(artikel)){
				int stueck = kunde.getCart().getEintraege().get(i).getStueckzahl() + anz;
				kunde.getCart().getEintraege().get(i).setStueckzahl(stueck);
				if(kunde.getCart().getEintraege().get(i).getStueckzahl() == 0){
					kunde.getCart().getEintraege().remove(i);
				}
			}
		}

	}
	
	public void bestandAendern(Artikel ar, int anz){
		for(int i = 0; i< av.getArtikelListe().size();i++){
			ar.setBestand(ar.getBestand()-anz);
		}
	}


	//Warenkorb wird geleert und reservierte Artikel wieder freigegeben.
	public void warenkorbLeeren(Kunde kunde){
		kunde.getCart().getEintraege().clear();
	}

	public float WarenkorbGesamtpreis(Kunde kunde){
		
		float summe = 0.0f;
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
			summe = summe + kunde.getCart().getEintraege().get(i).getArtikel().getPreis();
			
		}return summe;
	}
	
	// Warenkorb anzeigen lassen
	public void warenkorbAnzeigen(Kunde kunde) {
		for(int i = 0; i < kunde.getCart().getEintraege().size(); i++){
			System.out.println(kunde.getCart().getEintraege().get(i).getStueckzahl() + " " + kunde.getCart().getEintraege().get(i).getArtikel().getBez()); 
		}
		
	}
	
	
	public Rechnung rechnungErstellen(Kunde kunde, Date date){
		float summe = 0;
		Rechnung rechnung = new Rechnung(kunde, null, date, null, null, 0, summe, summe);
		rechnung.setKunde(kunde);
		rechnung.setDatum(date);
		int bestand2 = 0;
		Artikel artikel;
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
			artikel = kunde.getCart().getEintraege().get(i).getArtikel();
			rechnung.getArtikelListe().set(i, artikel);
			bestand2 = bestand2 -kunde.getCart().getEintraege().get(i).getStueckzahl();
			rechnung.getArtikelListe().get(i).setBestand(bestand2);
			rechnung.getArtikelListe().get(i).setPreis(kunde.getCart().getEintraege().get(i).getArtikel().getPreis());
			summe = summe + (float) rechnung.getArtikelListe().get(i).getPreis();
			
			bestand2 = 0;
		}
		rechnung.setGesamtpreis(summe);
		return rechnung;
	}



	//	Kunden k�nnen im Warenkorb enthaltene Artikel kaufen, wobei der Warenkorb geleert wird und
	//	die Artikel aus dem Bestand genommen werden. Es wird ein Rechnungsobjekt erzeugt und auf
	//	dem Bildschirm ausgegeben. Das Rechnungsobjekt enth�lt u.a. Kunde, Datum, die gekauften
	//	Artikel inkl. St�ckzahl und Preisinformation sowie den Gesamtpreis. 

	public Rechnung warenkorbKaufen(Kunde kunde){
		Rechnung rechnung = null;
		Warenkorb cart = kunde.getCart();
		List<WarenkorbEintrag> eintraege = cart.getEintraege();

		for (WarenkorbEintrag eintrag: eintraege) {
//			av.g// eintrag auslesen
		}
		warenkorbLeeren(kunde);
		return rechnung;
	}

}

