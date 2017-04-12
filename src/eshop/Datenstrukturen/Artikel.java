package eshop.Datenstrukturen;

public class Artikel {
	
	private int artikelnr;
	private String name;
	private int bestand;
	
	
	public Artikel(int artikelnr, String name, int bestand) {
		super();
		this.artikelnr = artikelnr;
		this.name = name;
		this.bestand = bestand;
	}
	
	
	
	
	


	public int getArtikelnr() {
		return artikelnr;
	}


	public void setArtikelnr(int artikelnr) {
		this.artikelnr = artikelnr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBestand() {
		return bestand;
	}


	public void setBestand(int bestand) {
		this.bestand = bestand;
	}
}
