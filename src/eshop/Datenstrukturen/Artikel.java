package eshop.Datenstrukturen;

public class Artikel {
	
	private int artikelnr;
	private String name;
	private float preis;
	private int bestand;
	private boolean verfuegbar;
	


	public Artikel(int artikelnr, String name, float preis, boolean verfuegbar) {
		super();
		this.artikelnr = artikelnr;
		this.name = name;
		this.preis = preis;
		this.verfuegbar = verfuegbar;
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


}
