package org.fpij.jitakyoei.controle;

import org.fpij.jitakyoei.beandeprecated.Entidade;
import org.fpij.jitakyoei.beandeprecated.Filiado;
import org.fpij.jitakyoei.beandeprecated.Funcionario;
import org.fpij.jitakyoei.enums.TipoFiliado;
import org.fpij.jitakyoei.exceptions.NotFoundAtletaException;
import org.fpij.jitakyoei.exceptions.NotFoundEntidadeException;
import org.fpij.jitakyoei.exceptions.NotFoundFuncionarioException;
import org.fpij.jitakyoei.exceptions.NotFoundProfessorException;
import org.fpij.jitakyoei.persistencia.BaseDeDados;
@Deprecated
public class Consultar {

	
//	public static Filiado umAtleta(int registroFPIJ) throws NotFoundAtletaException{
//		try{
//
//			return BaseDeDados.getAtleta(registroFPIJ);
//			
//		}catch (NotFoundAtletaException e) {
//			e.toString();
//		}
//	}
//	
//	public static Filiado umProfessor(int registroFPIJ) throws NotFoundProfessorException{
//		try{
//			
//			return BaseDeDados.getProfessor(registroFPIJ);
//			
//		}catch (NotFoundProfessorException e) {
//			e.toString();
//		}
//	}
	/**
	 * Este m�todo retorna um fliado do tipo setado como par�mtro indexado com o par�metro id
	 * 
	 * @param tipo
	 * @param id
	 */
	public static Filiado umFiliadoPorId (TipoFiliado tipo,int id){
		switch(tipo){
			case ATLETA: 
				try{
					return BaseDeDados.getAtleta(id);
				}catch (NotFoundAtletaException e) {
					System.out.println("erro: "+ e.toString());
				}
				break;
			case PROFESSOR:
				try {
					return BaseDeDados.getProfessor(id);
				} catch (NotFoundProfessorException e) {
					System.out.println("erro: "+ e.toString());
				}
				break;
			default:
				break;
		}
		return null;
		
	}	
	
	/**
	 * Este m�todo retorna a academia buscada pelo par�metro idAcademia passado. 
	 * 
	 * @param idAcademia
	 */
	public static Entidade umaAcademiaPorId(int idAcademia){
		try {
			return BaseDeDados.getAcademia(idAcademia);
		} catch (NotFoundEntidadeException e) {
			System.out.println("erro: "+ e.toString());
		}
		return null;
	}
	
	/**
	 * Este m�todo retorna um funcionario buscado pelo par�metro idFuncionario passado. 
	 * 
	 * @param idFuncionario
	 */
	public static Funcionario umFuncionarioPorId(int idFuncionario){
		try {
			return BaseDeDados.getFuncionario(idFuncionario);
		} catch (NotFoundFuncionarioException e) {
			System.out.println("erro: "+ e.toString());
		}				
		return null;
	}
}
