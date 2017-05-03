package eshop.Datenstrukturen;

public class Mitarbeiter extends Benutzer {
	
	private String passwort;
	private boolean login;
	
	public Mitarbeiter(int id, String vorname, String nachname, String email, String passwort, boolean login) {
		super(id, vorname, nachname, email);
		this.passwort = passwort;
		this.login = login;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
	
	
	
}
