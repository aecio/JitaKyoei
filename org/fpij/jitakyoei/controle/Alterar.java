package org.fpij.jitakyoei.controle;


import java.math.BigDecimal;

import org.fpij.jitakyoei.beandeprecated.Classificacao;
import org.fpij.jitakyoei.beandeprecated.Entidade;
import org.fpij.jitakyoei.beandeprecated.Filiado;
import org.fpij.jitakyoei.beandeprecated.Funcionario;
import org.fpij.jitakyoei.enums.Graduacao;
import org.fpij.jitakyoei.enums.TipoFiliado;
import org.fpij.jitakyoei.exceptions.FieldOffBoundsException;
import org.fpij.jitakyoei.exceptions.IsEmptyException;
import org.fpij.jitakyoei.exceptions.NotDigitException;
import org.fpij.jitakyoei.exceptions.NotFoundAtletaException;
import org.fpij.jitakyoei.exceptions.NotFoundEntidadeException;
import org.fpij.jitakyoei.exceptions.NotFoundFuncionarioException;
import org.fpij.jitakyoei.exceptions.NotFoundProfessorException;
import org.fpij.jitakyoei.exceptions.NotLetterException;
import org.fpij.jitakyoei.persistencia.BaseDeDados;
@Deprecated
public class Alterar {

	/**
	 * Este m�todo altera um Filiado da base de dados.
	 * Este Filiado pode ser do tipo ATLETA ou PROFESSOR. 
	 * 
	 * @param RegistroFPIJFiliadoAlterar
	 * @param tipoFiliadoAlterar
	 * @param novoRegistroFPIJ
	 * @param novoNome
	 * @param novoRG
	 * @param novoCPF
	 * @param novaFaixa
	 * @param novaClassificacao
	 * @param novoEndereco
	 * @param novoTelefone
	 * @param novoCelular
	 * 
	 * @throws NotFoundAtletaException 
	 * @throws NotFoundProfessorException 
	 * @throws IsEmptyException 
	 * @throws FieldOffBoundsException 
	 * @throws NotDigitException 
	 * @throws NotLetterException 
	 */
	public static void umFiliado(int registroFPIJFiliadoAlterar, TipoFiliado tipoFiliadoAlterar, int novoRegistroFPIJ,String novoNome,
			String novoRG,	String novoCPF, TipoFiliado novoTipo, Graduacao novaFaixa,Classificacao novaClassificacao, String novoEndereco,
			String novoTelefone, String novoCelular) throws NotFoundAtletaException, NotFoundProfessorException, NotLetterException, NotDigitException, FieldOffBoundsException, IsEmptyException{
		
		Filiado filiadoAntigo = null;
		
		switch (tipoFiliadoAlterar) {
		case ATLETA:
			// acha atleta a ser alterado
			filiadoAntigo = BaseDeDados.getAtleta(registroFPIJFiliadoAlterar);
			//remove atleta antigo
			BaseDeDados.removeAtleta( filiadoAntigo );
			break;
		case PROFESSOR:
			//acha professor a ser alterado
			filiadoAntigo = BaseDeDados.getProfessor(registroFPIJFiliadoAlterar);
			//remove professor antigo
			BaseDeDados.removeProfessor( filiadoAntigo );
		}
				
		Inserir.novoFiliado(novoRegistroFPIJ, novoNome, novoRG, novoCPF, novoTipo, novaFaixa, novaClassificacao, novoEndereco, novoTelefone, novoCelular);
			
	}
	/**
	 * Este m�todo altera um funcionario de acordo com o 
	 * 
	 * @param idFuncionarioAlterar
	 * @param novoIdFuncionario
	 * @param novoNome
	 * @param novoRG
	 * @param novoCPF
	 * @param novoEndereco
	 * @param novoTelefone
	 * @param novoCelular
	 * @param novoSalario
	 * 
	 * @throws NotFoundFuncionarioException
	 */
	public static void umFuncionario(int idFuncionarioAlterar, int novoIdFuncionario, String novoNome,int novoRG,int novoCPF,
			String novoEndereco, int novoTelefone, int novoCelular, BigDecimal novoSalario) throws NotFoundFuncionarioException{
		
		Funcionario funcionarioAntigo =  BaseDeDados.getFuncionario(idFuncionarioAlterar);
		BaseDeDados.removeFuncionario( funcionarioAntigo );
		
		Inserir.novoFuncionario(novoIdFuncionario, novoNome, novoRG, novoCPF, novoEndereco, novoTelefone, novoCelular, novoSalario);
	}
	
	/**
	 * Este m�todo altera uma academia da base de dados.
	 * 
	 * 
	 * @param idAcademiaAlterar
	 * @param novoIdAcademia
	 * @param novoNome
	 * @param novoTelefone
	 * @param novoEmail
	 * 
	 * @throws NotFoundEntidadeException 
	 */
	public static void umaAcademia(int idAcademiaAlterar, int novoIdAcademia, String novoNome, int novoTelefone, String novoEmail) throws NotFoundEntidadeException{
		
		Entidade academiaAntiga = BaseDeDados.getAcademia(idAcademiaAlterar);
		
		BaseDeDados.removeAcademia(academiaAntiga);
		
		Inserir.novaAcademia(novoIdAcademia, novoNome, novoTelefone, novoEmail);
		
	}
	
	
}
