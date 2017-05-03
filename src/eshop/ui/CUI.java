package eshop.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import eshop.Shop;
import eshop.Datenstrukturen.Artikel;


public class CUI {
	
	private Shop shop;
	private Artikel ar;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void setConsoleLine(String s){
		System.out.println(s);
	}
	public String getInputLine(){
		String s = "";
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	public int getInputInt(){
		return Integer.parseInt(getInputLine());
	}


	// Methode zum Starten des EShops
	public void run(){

		do{
			
			System.out.println("Mitarbeiter[M] oder Kunde[K]?");
			try {
				String input = br.readLine();
				if(input.equals("M")){
					System.out.println("Mitarbeiter");
					System.out.println("Artikel anzeigen[S]");
					String inputt = br.readLine();
					if(inputt.equals("S")){
					//	next operation
					}
				}
				
				if(input.equals("K")){
					System.out.println("Kunde");					
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(true);
	}

	public CUI() {

		super();
		this.br =  new BufferedReader(new InputStreamReader(System.in));
		this.shop = new Shop();

	}
	
	public static void main(String[] args) {

		CUI cui = new CUI();
		cui.run();
}

}