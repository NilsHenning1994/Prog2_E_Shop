package eshop.Anwendungslogik;

import java.util.ArrayList;
import java.util.List;

import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Kunde;
import eshop.Datenstrukturen.Rechnung;
import eshop.Datenstrukturen.WarenkorbEintrag;

public class ShoppingServices {

	
//	
	public void artikelInWarenkorb(Kunde kunde, Artikel artikel, int anz){
		
		if(artikel.getBestand()>=anz){
			artikel.setBestand(artikel.getBestand()-anz);
			WarenkorbEintrag eintrag = null;
			eintrag.setArtikel(artikel);
			eintrag.setStueckzahl(anz);
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
		for(int i = 0; i< kunde.getCart().getEintraege().size();i++){
//			Artikel bestand wieder auffüllen!
		}
		kunde.getCart().getEintraege().clear();
	}
	
	
	
//	Kunden können im Warenkorb enthaltene Artikel kaufen, wobei der Warenkorb geleert wird und
//	die Artikel aus dem Bestand genommen werden. Es wird ein Rechnungsobjekt erzeugt und auf
//	dem Bildschirm ausgegeben. Das Rechnungsobjekt enthält u.a. Kunde, Datum, die gekauften
//	Artikel inkl. Stückzahl und Preisinformation sowie den Gesamtpreis. 
	
	public Rechnung artikelKaufen(Kunde kunde){
		Rechnung rechnung = null;
		kunde.getCart().getEintraege().clear();
		return rechnung;
	}
}
