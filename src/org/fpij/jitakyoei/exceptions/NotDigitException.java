
package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotDigitException extends Exception{
    
    @Override
    public String toString() {
        return "Cadeia pura de digitos inv�lida. Voc� deve digitar apenas d�gitos.";
    }
}
