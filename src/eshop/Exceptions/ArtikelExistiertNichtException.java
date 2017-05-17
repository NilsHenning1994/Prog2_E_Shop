package eshop.Exceptions;

public class ArtikelExistiertNichtException extends Exception{

	public ArtikelExistiertNichtException(String text) {
		super("Der Artikel existiert nicht!");
	}
}
