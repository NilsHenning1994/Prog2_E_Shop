package eshop.Datenstrukturen;

import java.util.Date;
import javax.print.attribute.DateTimeSyntax;

public class Rechnung {

	private Kunde kunde;
	private Warenkorb warenkorb;
	private Date datum;
	private float preisinfo;
	private float gesamtpreis;
	
	public Rechnung(Kunde kunde, Warenkorb warenkorb, Date datum, float preisinfo, float gesamtpreis) {
		super();
		this.kunde = kunde;
		this.warenkorb = warenkorb;
		this.datum = datum;
		this.preisinfo = preisinfo;
		this.gesamtpreis = gesamtpreis;
	}

	
	
	
	
	
	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public float getPreisinfo() {
		return preisinfo;
	}

	public void setPreisinfo(float preisinfo) {
		this.preisinfo = preisinfo;
	}

	public float getGesamtpreis() {
		return gesamtpreis;
	}

	public void setGesamtpreis(float gesamtpreis) {
		this.gesamtpreis = gesamtpreis;
	}
	
	
	
}
