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
        //super((char) 27 + "Wenn du das lesen kannst funktioniert die Exception" + (char) 27);
        super("Wenn du das lesen kannst funktioniert die Exception");
    }
}
