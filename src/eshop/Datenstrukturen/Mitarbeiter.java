package eshop.Datenstrukturen;

public class Mitarbeiter extends Benutzer {
	
	private boolean login;
	
	
	public Mitarbeiter(int id, String vorname, String nachname, String email, String passwort, boolean login) {
		super(id, vorname, nachname, email, passwort);
		this.login = login;
	}


	public boolean isLogin() {
		return login;
	}


	public void setLogin(boolean login) {
		this.login = login;
	}

	
}
