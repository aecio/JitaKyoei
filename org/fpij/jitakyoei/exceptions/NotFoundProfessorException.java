package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotFoundProfessorException extends NotFoundException {

    @Override
    public String toString() {
        return "O Professor buscado parece n�o existir!";
    }
}
