package eshop.Datenstrukturen;

import java.util.List;
import java.util.Vector;

public class Warenkorb {

	private String warenkorbNr;
	private Kunde kunde;
	private List<WarenkorbEintrag> eintraege = null;

	public Warenkorb(List<WarenkorbEintrag> eintraege) {
		this.warenkorbNr = warenkorbNr;
		this.kunde = kunde;
		this.eintraege = eintraege;
		
	}
	
	public Warenkorb(String wknr, Kunde kunde, List<Artikel> eintraege) {
		// TODO Auto-generated constructor stub
	}

	public void warenkorbLeeren(){
		
	}
	
	public void warenkorbKaufen(){
		
	}
	
	
	
	

	public List<WarenkorbEintrag> getEintraege() {
		return eintraege;
	}

	public void setEintraege(List<WarenkorbEintrag> eintraege) {
		this.eintraege = eintraege;
	}
	
	public void addEintrag(WarenkorbEintrag eintrag) {
		this.eintraege.add(eintrag);
	}

	public String getWarenkorbNr() {
		return warenkorbNr;
	}

	public void setWarenkorbNr(String warenkorbNr) {
		this.warenkorbNr = warenkorbNr;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}


	
	
}
