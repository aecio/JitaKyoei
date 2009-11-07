
package org.fpij.jitakyoei.exceptions;
/*
 * Entidade n�o existe
 */

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotFoundException extends Exception {

    @Override
    public String toString() {
        return "O item solicitado parece n�o existir!";
    }
}
