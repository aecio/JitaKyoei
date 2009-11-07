package org.fpij.jitakyoei.testes;

import java.math.BigDecimal;

import org.fpij.jitakyoei.beandeprecated.Classificacao;
import org.fpij.jitakyoei.beandeprecated.Entidade;
import org.fpij.jitakyoei.beandeprecated.Filiado;
import org.fpij.jitakyoei.beandeprecated.Funcionario;
import org.fpij.jitakyoei.controle.Alterar;
import org.fpij.jitakyoei.controle.Consultar;
import org.fpij.jitakyoei.controle.Inserir;
import org.fpij.jitakyoei.controle.Remover;
import org.fpij.jitakyoei.enums.Categoria;
import org.fpij.jitakyoei.enums.Classe;
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

@Deprecated
public class Main {

	/**
	 * @param args
	 * @throws NotFoundProfessorException 
	 * @throws NotFoundAtletaException 
	 * @throws NotFoundFuncionarioException 
	 * @throws NotFoundEntidadeException 
	 * @throws IsEmptyException 
	 * @throws FieldOffBoundsException 
	 * @throws NotDigitException 
	 * @throws NotLetterException 
	 */
	public static void main(String[] args) throws NotFoundAtletaException, NotFoundProfessorException, NotFoundFuncionarioException, NotFoundEntidadeException, NotLetterException, NotDigitException, FieldOffBoundsException, IsEmptyException {
		

		Classificacao classificacao = new Classificacao(Classe.SENIOR, Categoria.MEIOMEDIO);
		
		/*
		 *	TESTES DE INSER��O 
		 */
		
		//TODO ajeitar lan�amento de exce��es. 
		
		//add um atleta	
		//(int registroFPIJ, String nome, String rg,tring cpf, TipoFiliado tipo, Graduacao faixa, Classificacao classificacao, String endereco, String telefone, String celular)
		Inserir.novoFiliado(1, "Alcemir", "1235689", "98765432133", TipoFiliado.ATLETA, Graduacao.SHODAN, classificacao, "Rua daqui de casa", "54323456", "87654567");		
		//add um professor
		Inserir.novoFiliado(1, "Renato", "124456789", "98976446621", TipoFiliado.PROFESSOR, Graduacao.NIDAN, classificacao, "Rua daqui de casa", "54323456", "87654567");		
		//add um funcionario
		Inserir.novoFuncionario(1, "Ruan", 33333333, 44444444, "endereco do ruan", 234523, 234534, BigDecimal.valueOf(10000,99) );		
		//add uma academia
		Inserir.novaAcademia(1, "Eugnio", 33233434, "email da academia");
		

		/*
		 * 	TESTES DE CONSULTA 1
		 */
		
		System.out.println("Teste de consulta 1: ");
		
		//get um atleta
		Filiado result = Consultar.umFiliadoPorId(TipoFiliado.ATLETA, 1);
		System.out.println("\nNome: "+result.getNome()+"\tRegistro: "+result.getIdFiliado());

		//get um professor
		result = Consultar.umFiliadoPorId(TipoFiliado.PROFESSOR, 1);
		System.out.println("\nNome: "+result.getNome()+"\tRegistro: "+result.getIdFiliado());

		//get um funcionario
		Funcionario func = Consultar.umFuncionarioPorId(1);
		System.out.println("\nNome: "+func.getNome()+"\tID: "+func.getIdFuncionario());
		
		//get uma academia
		Entidade acad = Consultar.umaAcademiaPorId(1);
		System.out.println("\nNome: "+acad.getNome()+"\tID: "+acad.getIdEntidade() );
		
		/*
		 *	TESTES DE ALTERA��O  
		 */
		
		//altera um atleta
		Alterar.umFiliado(1, TipoFiliado.ATLETA, 2, "Alcemirs", "1234323", "65652244654", TipoFiliado.ATLETA, Graduacao.SHODAN, classificacao, "rua taraararar", "65456765", "34544543"); 
		//altera um professor
		Alterar.umFiliado(1, TipoFiliado.PROFESSOR, 2, "Renatos", "76534323", "65667675654", TipoFiliado.PROFESSOR, Graduacao.NIDAN, classificacao, "rua taraarytrt", "64456765", "34544443");
		//altera um funcionario
		Alterar.umFuncionario(1, 2, "Ruan2", 43234432, 54345234, "rua efigenia", 7653456, 345676, BigDecimal.valueOf(123.767));
		//altera uma academia
		Alterar.umaAcademia(1, 2, "Ricardo", 8787656, "345654567");
		
		/*
		 * 	TESTES DE CONSULTA 2
		 */
		
		System.out.println("\nTeste de consulta 2: ");
		
		//get um atleta
		result = Consultar.umFiliadoPorId(TipoFiliado.ATLETA, 1);
		result = Consultar.umFiliadoPorId(TipoFiliado.ATLETA, 2);
		System.out.println("\nNome: "+result.getNome()+"\tRegistro: "+result.getIdFiliado());

		//get um professor
		result = Consultar.umFiliadoPorId(TipoFiliado.PROFESSOR, 1);
		result = Consultar.umFiliadoPorId(TipoFiliado.PROFESSOR, 2);
		System.out.println("\nNome: "+result.getNome()+"\tRegistro: "+result.getIdFiliado());

		//get um funcionario
		func = Consultar.umFuncionarioPorId(1);
		func = Consultar.umFuncionarioPorId(2);
		System.out.println("\nNome: "+func.getNome()+"\tID: "+func.getIdFuncionario());
		
		//get uma academia
		acad = Consultar.umaAcademiaPorId(1);
		acad = Consultar.umaAcademiaPorId(2);
		System.out.println("\nNome: "+acad.getNome()+"\tID: "+acad.getIdEntidade() );
		
		/*
		 * 	TESTES DE REMO��O
		 */

		//remove um atleta
		Remover.umFiliadoPorId(TipoFiliado.ATLETA, 2);
		//remove um professor
		Remover.umFiliadoPorId(TipoFiliado.PROFESSOR, 2);
		//remove um funcionario
		Remover.umFuncionariorioPorId(2);
		//remove uma academia
		Remover.umaAcademiaPorId(2);
	

		/*
		 * 	TESTES DE CONSULTA 3
		 */

		System.out.println("\nTeste de consulta 3: ");
		
		//get um atleta
		Consultar.umFiliadoPorId(TipoFiliado.ATLETA, 1);
		Consultar.umFiliadoPorId(TipoFiliado.ATLETA, 2);
		//get um professor
		Consultar.umFiliadoPorId(TipoFiliado.PROFESSOR, 1);
		Consultar.umFiliadoPorId(TipoFiliado.PROFESSOR, 2);
		//get um funcionario
		Consultar.umFuncionarioPorId(1);
		Consultar.umFuncionarioPorId(2);
		//get uma academia
		Consultar.umaAcademiaPorId(1);
		Consultar.umaAcademiaPorId(2);		
	}
}
