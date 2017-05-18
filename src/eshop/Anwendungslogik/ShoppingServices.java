package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Massengutartikel;
import eshop.Datenstrukturen.Rechnung;
import eshop.Datenstrukturen.Warenkorb;
import eshop.Datenstrukturen.WarenkorbEintrag;
import eshop.Exceptions.FalschePackungsgroeßeException;
import eshop.Exceptions.FehlerException;

public class ShoppingServices {

	private ArtikelVerwaltung av = null;
	private Rechnung rechnung;


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
	public void MartikelInWarenkorb(Kunde kunde, Massengutartikel ma, int anz) throws FalschePackungsgroeßeException{

		int packungsgroeße = ma.getPackungsgroeße();
		if(anz % packungsgroeße != 0){
			throw new FalschePackungsgroeßeException();
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

	//
	public Rechnung rechnungErstellen(Kunde kunde, Date date, Artikel artikel, int bestand, int preisinfo, int gesamt){
		float summe = 0;
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



	//	Kunden k�nnen im Warenkorb enthaltene Artikel kaufen, wobei der Warenkorb geleert wird und
	//	die Artikel aus dem Bestand genommen werden. Es wird ein Rechnungsobjekt erzeugt und auf
	//	dem Bildschirm ausgegeben. Das Rechnungsobjekt enth�lt u.a. Kunde, Datum, die gekauften
	//	Artikel inkl. St�ckzahl und Preisinformation sowie den Gesamtpreis. 

	public Rechnung artikelKaufen(Kunde kunde){
		Rechnung rechnung = null;
		Warenkorb cart = kunde.getCart();
		List<WarenkorbEintrag> eintraege = cart.getEintraege();

		for (WarenkorbEintrag eintrag: eintraege) {
			av.g// eintrag auslesen
		}
		warenkorbLeeren(kunde);
		return rechnung;
	}
}

