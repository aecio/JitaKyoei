package org.fpij.jitakyoei.controle;


import org.fpij.jitakyoei.enums.TipoFiliado;
import org.fpij.jitakyoei.exceptions.NotFoundAtletaException;
import org.fpij.jitakyoei.exceptions.NotFoundEntidadeException;
import org.fpij.jitakyoei.exceptions.NotFoundFuncionarioException;
import org.fpij.jitakyoei.exceptions.NotFoundProfessorException;
import org.fpij.jitakyoei.persistencia.BaseDeDados;
@Deprecated
public class Remover {

	
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
	 * Este m�todo remove um fliado do tipo setado como par�mtro indexado com o par�metro id
	 * 
	 * @param tipo
	 * @param id
	 */
	public static void umFiliadoPorId (TipoFiliado tipo,int id) throws NotFoundAtletaException, NotFoundProfessorException{
		switch(tipo){
			case ATLETA: 
				try{
					BaseDeDados.removeAtleta( BaseDeDados.getAtleta(id) );
				}catch(NotFoundAtletaException e){
					
				}
			case PROFESSOR:
				try {
					BaseDeDados.removeProfessor( BaseDeDados.getProfessor(id) );
				} catch (NotFoundProfessorException e) {
					
				}
				
		}
	}	
	
	/**
	 * Este m�todo remove a academia buscada pelo par�metro idAcademia passado. 
	 * 
	 * @param idAcademia
	 */
	public static void umaAcademiaPorId(int idAcademia) throws NotFoundEntidadeException{
		try {
			BaseDeDados.removeAcademia( BaseDeDados.getAcademia(idAcademia) );
		} catch (NotFoundEntidadeException e) {
			
		}
	}
	
	/**
	 * Este m�todo remove um funcionario buscado pelo par�metro idFuncionario passado. 
	 * 
	 * @param idFuncionario
	 */
	public static void umFuncionariorioPorId(int idFuncionario) throws NotFoundFuncionarioException{
		try {
			BaseDeDados.removeFuncionario( BaseDeDados.getFuncionario(idFuncionario) );
		} catch (NotFoundFuncionarioException e) {
			
		}				
	}
}
