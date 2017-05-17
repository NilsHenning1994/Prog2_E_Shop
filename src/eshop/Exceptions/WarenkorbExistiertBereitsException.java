/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.Exceptions;

import valueobjects.Warenkorb;

/**
 *
 * @author Gruppe A4(Patrick, Oleksandra, Walter)
 */
public class WarenkorbExistiertBereitsException extends Exception{
    
    
    
    
    public WarenkorbExistiertBereitsException(Warenkorb warenkorb, String zusatzMsg) {
		super("Warenkorb mit Warenkorbnr " + warenkorb.getWknr() + " existiert bereits" + zusatzMsg);
    }
}
    


