package eshop.Datenstrukturen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ereignis {

	private Artikel artikel;
	private int anz;
	private Date wann;
	private User user;
	
	public Ereignis( Artikel artikel, int anz, User user) {
		super();
		this.artikel = artikel;
		this.anz = anz;
		this.user = user;
	}

//	public Ereignis( Date wann, Artikel artikel, int anz, Benutzer user) {
//		super();
//		this.wann = wann;
//		this.artikel = artikel;
//		this.anz = anz;
//		this.user = user;
//	}

	public int getAnz() {
		return anz;
	}

	public void setAnz(int anz) {
		this.anz = anz;
	}

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public Date getWann() {
		return wann;
	}

	public void setWann(Date wann) {
		this.wann = wann;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
