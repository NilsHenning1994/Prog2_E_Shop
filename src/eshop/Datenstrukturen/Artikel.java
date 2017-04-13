package eshop.Datenstrukturen;

public class Artikel {
	
	private int artikelnr;
	private String name;


	
	
	
	
	public Artikel(int artikelnr, String name) {
		super();
		this.artikelnr = artikelnr;
		this.name = name;
		
		
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
