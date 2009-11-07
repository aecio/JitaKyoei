package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotLetterException extends Exception {

    @Override
    public String toString() {
        return "Cadeia de caract�res inv�lida! A entrada deve conter apenas letras. ";
    }
}
