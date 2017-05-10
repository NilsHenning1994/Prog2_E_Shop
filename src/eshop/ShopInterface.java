package eshop;

import java.awt.Point;
import java.io.IOException;
import java.util.List;

import eshop.Exceptions.BenutzerExistiertBereitsException;
import eshop.Shop;
import eshop.Datenstrukturen.Artikel;
import eshop.Datenstrukturen.Benutzer;
/**
 * @return 
 * 
 *@throws IOException
 *
 *@throws ClassNotFoundException
 */
public interface ShopInterface  {

	public boolean connect();

	void BenutzerHinzufügen(Benutzer neuerBenutzer) throws BenutzerExistiertBereitsException, IOException;

	 List<Benutzer> getBenutzer() throws IOException;
	
	 Benutzer getBenutzerByIndex(int index)throws IOException;
	
	int getLength() throws IOException, ClassNotFoundException;
	
	 Artikel getStationByIndex(int index)throws IOException, ClassNotFoundException;
	
	int getRunde()throws IOException, ClassNotFoundException;
	
	int getNaechsteRunde() throws IOException, ClassNotFoundException;
	
	int  getGewonnen() throws IOException, ClassNotFoundException;
	
	int getXWin(List<Benutzer> be, Benutzer sh) throws IOException;
	
	int  getFarbe() throws IOException, ClassNotFoundException;
	
	 void setFarbe (int farbe)throws IOException, ClassNotFoundException;
	
	 int getDran() throws IOException, ClassNotFoundException;
	
	Benutzer getSpielBenutzer() throws IOException, ClassNotFoundException;
	 
	 void setSpielBenutzer(Benutzer be) throws IOException;
	 
	 boolean getZeigen() throws IOException, ClassNotFoundException;
	 
	 
	
	 void setAktb(boolean aktb)throws IOException;
	
	 void setAkt2(boolean akt2)throws IOException, ClassNotFoundException;
	 
	boolean getAktb() throws IOException, ClassNotFoundException;
	 
	 boolean getAkt2() throws IOException, ClassNotFoundException ;
	 
	 void setSonderchips(int sonderchips) throws IOException ;

	  int getSonderchips() throws IOException, ClassNotFoundException;
	
	  void setKfz(String kfz, int l)throws IOException;
	 
	  String getKfz(int l)throws IOException, ClassNotFoundException;
	
	  void setVerk(int verk)throws IOException;
	  
	  int getVerk()throws IOException, ClassNotFoundException;
	  
	  void setSpielbar(boolean spielbar)throws IOException;
	  
	boolean getSpielbar()throws IOException, ClassNotFoundException;
	  
	  void setDran(int dran)throws IOException;
	  
	  int getInRunden()throws IOException, ClassNotFoundException;
	  
	  void taxiAbziehen(Benutzer be, Shop sh)throws IOException, ClassNotFoundException;
	  
	  void busAbziehen(Benutzer be, Shop sh)throws IOException;
	  
	  void bahnAbziehen(Benutzer be, Shop sh)throws IOException;
	  
	  void taxiFahren(Artikel ar, Benutzer be, Shop sh) throws IOException;
	  
	  void busFahren(Artikel ar, Benutzer be, Shop sh)throws IOException;
	  
	  void bahnFahren(Artikel ar, Benutzer be, Shop sh)throws IOException;
	  
	  String getLetzterXZug()throws IOException, ClassNotFoundException;
	  
	  void setXnr(int xnr)throws IOException;
	  
	int getXnr() throws IOException, ClassNotFoundException;
	
	
	  
	 void setSp1Loc(Point point) throws IOException;
	 
	 void setSp2Loc(Point point) throws IOException;
	 
	 void setSp3Loc(Point point)throws IOException;
	 
	 void setSp4Loc(Point point)throws IOException;
	 
	 void setSp5Loc(Point point)throws IOException;
	 
	 void setSp6Loc(Point point)throws IOException;
	 
	 void setSp7Loc(Point point)throws IOException;
	 
	 void setSp8Loc(Point point)throws IOException;
	 
	 Point getSp1Loc() throws IOException, ClassNotFoundException;
	 
	 Point getSp2Loc() throws ClassNotFoundException, IOException;
	 
	Point getSp3Loc() throws IOException, ClassNotFoundException;
	 
	Point getSp4Loc() throws ClassNotFoundException, IOException;
	 
	Point getSp5Loc() throws ClassNotFoundException, IOException;
	 
	Point getSp6Loc() throws ClassNotFoundException, IOException;
	 
	Point getSp7Loc() throws ClassNotFoundException, IOException;
	 
	Point getSp8Loc() throws ClassNotFoundException, IOException;


	 
	 
	  
}