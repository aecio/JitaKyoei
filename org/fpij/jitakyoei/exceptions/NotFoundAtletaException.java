package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotFoundAtletaException extends NotFoundException {

    @Override
    public String toString() {
        return "O Atleta buscado parece n�o existir!";
    }
}
