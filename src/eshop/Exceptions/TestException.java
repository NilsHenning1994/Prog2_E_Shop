package eshop.Exceptions;

public class TestException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Konstruktor der Klasse TestException
     * @param name
     */
    public TestException() {
        //super((char) 27 + "Ein Fehler ist aufgetreten!" + (char) 27);
        super("Ein Fehler ist aufgetreten!");
    }
}
