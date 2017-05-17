package eshop.Datenstrukturen;

import java.util.List;

public class Warenkorb {

	private List<WarenkorbEintrag> eintraege = null;

	public Warenkorb(List<WarenkorbEintrag> eintraege) {
		super();
		this.eintraege = eintraege;
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


	
	
}
