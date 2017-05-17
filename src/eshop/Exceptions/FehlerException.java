package eshop.Exceptions;

public class FehlerException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Konstruktor der Klasse TestException
     * @param name
     */
    public FehlerException() {
        //super((char) 27 + "Ein Fehler ist aufgetreten!" + (char) 27);
        super("Ein Fehler ist aufgetreten!");
    }
}
