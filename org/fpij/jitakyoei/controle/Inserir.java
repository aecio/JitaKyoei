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
import org.fpij.jitakyoei.exceptions.NotLetterException;
import org.fpij.jitakyoei.persistencia.BaseDeDados;
@Deprecated
public class Inserir {

	/**
	 * Este m�todo adiciona um novo Filiado � base de dados. Este Filiado pode
	 * ser do tipo ATLETA ou PROFESSOR.
	 * 
	 * @param registroFPIJ
	 * @param nome
	 * @param rg
	 * @param cpf
	 * @param faixa
	 * @param classificacao
	 * @param endereco
	 * @param telefone
	 * @param celular
	 * @throws IsEmptyException
	 * @throws FieldOffBoundsException
	 * @throws NotDigitException
	 * @throws NotLetterException
	 */
	public static void novoFiliado(int registroFPIJ, String nome, String rg,
			String cpf, TipoFiliado tipo, Graduacao faixa,
			Classificacao classificacao, String endereco, String telefone,
			String celular) throws NotLetterException, NotDigitException,
			FieldOffBoundsException, IsEmptyException {

		Filiado novoFiliado = new Filiado();

		novoFiliado.setIdFiliado(registroFPIJ);
		novoFiliado.setNome(nome);
		novoFiliado.setRg(rg);
		novoFiliado.setCpf(cpf);
		novoFiliado.setTipoFiliado(tipo);
		novoFiliado.setGraduacao(faixa);
		novoFiliado.setClasse(classificacao.getClasse());
		novoFiliado.setCategoria(classificacao.getCategoria());
		novoFiliado.setEndereco(endereco);
		novoFiliado.setTelefone(telefone);
		novoFiliado.setCelular(celular);

		try {
			Validar.umFiliado(novoFiliado);
		} catch (NotLetterException e) {
			System.out.println("Error: " + e.toString());
		} catch (NotDigitException e) {
			System.out.println("Error: " + e.toString());
		} catch (FieldOffBoundsException e) {
			System.out.println("Error: " + e.toString());
		} catch (IsEmptyException e) {
			System.out.println("Error: " + e.toString());
		}
		// TODO consertar o lan�amento de exce��es
		switch (tipo) {
		case ATLETA:
			BaseDeDados.putAtleta(novoFiliado);
			break;
		case PROFESSOR:
			BaseDeDados.putProfessor(novoFiliado);
			break;
		default:
			break;
		}
	}

	public static void novoFuncionario(int idFuncionario, String nome, int rg,
			int cpf, String endereco, int telefone, int celular,
			BigDecimal salario) {

		Funcionario novoFuncionario = new Funcionario();

		novoFuncionario.setIdFuncionario(idFuncionario);
		novoFuncionario.setNome(nome);
		novoFuncionario.setRg(rg);
		novoFuncionario.setCpf(cpf);
		novoFuncionario.setEndereco(endereco);
		novoFuncionario.setTelefone(telefone);
		novoFuncionario.setCelular(celular);
		novoFuncionario.setSalario(salario);

		BaseDeDados.putFuncionario(novoFuncionario);
	}

	/**
	 * Este m�todo adiciona uma nova academia
	 * 
	 * @param idAcademia
	 * @param nome
	 * @param telefone
	 * @param email
	 */
	public static void novaAcademia(int idAcademia, String nome, int telefone,
			String email) {

		Entidade AcademiaNova = new Entidade();

		AcademiaNova.setIdEntidade(idAcademia);
		AcademiaNova.setNome(nome);
		AcademiaNova.setTelefone(telefone);
		AcademiaNova.setEmail(email);

		BaseDeDados.putAcademia(AcademiaNova);
	}

}
