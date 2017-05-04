package eshop.Datenstrukturen;

public abstract class Benutzer {

	private int id;
	private  String vorname;
	private String nachname;
	private String email;
	
	public Benutzer(int id, String vorname, String nachname, String email) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
	}

	public String getVorname() {
		return vorname;
	}

	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Benutzer) {
			Benutzer andererBenutzer = (Benutzer) obj;
			return (this.email.equals(andererBenutzer.email));
		}
		
		return false;
	}
}