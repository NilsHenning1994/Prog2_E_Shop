package eshop;

public class Mitarbeiter {

	private int code;
	private String vorname;
	private String nachname;
	private String email;
	public Mitarbeiter(int mitarbeiternr, String vorname, String nachname, String email) {
		super();
		this.code = code;
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
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
