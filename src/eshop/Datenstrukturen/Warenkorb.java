package eshop.Datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	private Kunde kunde;
	private List<WarenkorbEintrag> eintraege = null;


	public Warenkorb(Kunde kunde) {
		this.kunde = kunde;
		this.eintraege = new ArrayList<>();
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

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}


	
	
}
