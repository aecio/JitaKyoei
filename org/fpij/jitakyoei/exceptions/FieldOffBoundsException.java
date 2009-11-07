package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class FieldOffBoundsException extends Exception{
    
    @Override
    public String toString() {
        return "Cadeia caracteres fora do tamanho permitido";
    }

}
