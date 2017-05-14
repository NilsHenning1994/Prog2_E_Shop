package eshop.Exceptions;

public class EingabeException extends Exception{
	public EingabeException(String text) {
		super("Fehlerhafte Eingabe: " + text + ". Es duerfen keine Zahlen sowie die Zeichen !, /, _, ?, € enthalten sein!");
	}
}

