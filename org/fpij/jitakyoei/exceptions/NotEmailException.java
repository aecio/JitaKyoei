
package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotEmailException  extends Exception {
    @Override
    public String toString() {
        return "Email inv�lido. Siga este exemplo: usuario@dominio.tipo ";
    }
}
