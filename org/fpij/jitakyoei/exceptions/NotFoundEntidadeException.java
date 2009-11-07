package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotFoundEntidadeException extends NotFoundException {

    @Override
    public String toString() {
        return "A Entidade buscada parece n�o existir!";
    }
}
