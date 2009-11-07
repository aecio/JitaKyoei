package org.fpij.jitakyoei.exceptions;


@SuppressWarnings("serial")
public class NotFoundFiliadoException extends NotFoundException {
	
	@Override
	public String toString() {
		
		return "O Filiado buscado parece n�o existir!";
	}
}
