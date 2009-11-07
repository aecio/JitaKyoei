package org.fpij.jitakyoei.controle;

import java.util.StringTokenizer;

import org.fpij.jitakyoei.beandeprecated.Filiado;
import org.fpij.jitakyoei.exceptions.FieldOffBoundsException;
import org.fpij.jitakyoei.exceptions.IsEmptyException;
import org.fpij.jitakyoei.exceptions.NotDigitException;
import org.fpij.jitakyoei.exceptions.NotLetterException;
@Deprecated
public class Validar {
	
	/**
	 * Verifica se entrada � vazia
	 * 
	 * @param entrada
	 * @return
	 */
	public static boolean ehVazio(String entrada) {
        boolean ehVazio = true;

        if (entrada == null) {
            entrada = "";
        }

        if (!entrada.isEmpty()) {
            ehVazio = false;
        }

        return ehVazio;
    }
	
	/**
	 * Verifica se entrada � composto apenas de n�mero
	 * 
	 * @param entrada
	 * @return
	 */
    public static boolean ehNumero(String entrada) {
        boolean ehNumero = true;

        for (int indice = 0; indice < entrada.length(); indice++) {

            if (!Character.isDigit(entrada.charAt(indice))) {
                ehNumero = false;
                break;
            }
        }
        return ehNumero;
    }
    
    /**
     * Verifica se entrada � composto apenas de letras
     * 
     * @param entrada
     * @return
     */
    public static boolean ehLetra(String entrada) {
        boolean ehLetra = true;

        for (int indice = 0; indice < entrada.length(); indice++) {

            if ((!Character.isLetter(entrada.charAt(indice))) && (!Character.isWhitespace(entrada.charAt(indice))) ){
                
                ehLetra = false;
                break;
            }
        }
        return ehLetra;
    }
    
    /**
     * Verifica se entrada � de fato um email v�lido
     * 
     * @param entrada
     * @return
     */
    public static boolean ehEmail(String entrada) {
        boolean ehEmail = false;

        StringTokenizer st = new StringTokenizer(entrada, "@");
        if (st.countTokens() == 2) {
            entrada = st.nextToken();
            entrada = st.nextToken();

            st = new StringTokenizer(entrada, ".");

            if ((st.countTokens() >= 2) && (st.countTokens() <= 3)) {
                ehEmail = true;
            }
        }

        return ehEmail;
    }
    
    /**
     * Verifica se entrada tem tamanho v�lido
     * 
     * @param entrada
     * @param tamnhoMinimo
     * @param tamanhoMaximo
     * @return
     */
    public static boolean tamanhoValido(String entrada, int tamnhoMinimo, int tamanhoMaximo) {
        boolean tamanhoValido = true;

        if ((entrada.length() < tamnhoMinimo) || (entrada.length() > tamanhoMaximo)) {
            tamanhoValido = false;
        }
        return tamanhoValido;
    }
	
	/**
	 * Valida dados de um poss�vel filiado.
	 * 
	 * @param filiado
	 * @throws NotLetterException
	 * @throws NotDigitException
	 * @throws FieldOffBoundsException
	 * @throws IsEmptyException 
	 */
    public static boolean umFiliado( Filiado filiado) throws NotLetterException, NotDigitException, FieldOffBoundsException, IsEmptyException{
    	boolean ehValido = true;
    	
		//valida nome
		if( filiado.getNome().isEmpty() ){
			ehValido = false;
			throw new IsEmptyException();
		}
    	if (!ehLetra(filiado.getNome())) {
    		ehValido = false;
    		throw new NotLetterException();
        }
		
		//valida cpf
    	if( filiado.getCpf().isEmpty() ){
    		ehValido = false;
    		throw new IsEmptyException();
		}
    	if(!ehNumero(filiado.getCpf())){
    		ehValido = false;
    		throw new NotDigitException();
		}
		if( !tamanhoValido(filiado.getCpf(), 11, 11) ){
			ehValido = false;
			throw new FieldOffBoundsException();
		}
		
		//validar rg
		if( filiado.getRg().isEmpty() ){
			ehValido = false;
			throw new IsEmptyException();
		}
		if(!ehNumero(filiado.getRg())){
			ehValido = false;
			throw new NotDigitException();
		}
		if(!tamanhoValido(filiado.getRg(), 4,12)){
			ehValido = false;
			throw new FieldOffBoundsException();
		}
	
		//validar telefone
		if( filiado.getTelefone().isEmpty() ){
			ehValido = false;
			throw new IsEmptyException();
		}
		if(!ehNumero(filiado.getTelefone())){
			ehValido = false;
			throw new NotDigitException();
		}
		if(!tamanhoValido(filiado.getTelefone(), 8, 10)){
			ehValido = false;
			throw new FieldOffBoundsException();
		}
		
		//validar celular
		if( filiado.getCelular().isEmpty() ){
			ehValido = false;
			throw new IsEmptyException();
		}
		if(!ehNumero(filiado.getCelular())){
			ehValido = false;
			throw new NotDigitException();
		}
		if(!tamanhoValido(filiado.getCelular(), 8, 10)){
			ehValido = false;
			throw new FieldOffBoundsException();
		}
		
		return ehValido;
		
		//validar email
//		if(!ehEmail(email)){
//    		throw new NotEmailException();
//    	}
		
	}
    
}
