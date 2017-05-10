package eshop.Exceptions;

public class EingabeException extends Exception{
	public EingabeException(String text) {
		super("Fehlerhafte Eingabe: " + text + ". Es dürfen keine Zahlen sowie die Zeichen !, /, _, ?, € enthalten sein!");
	}
}
