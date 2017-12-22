package br.ufpi.pdsi2.test;

import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.junit.Before;
import org.junit.Test;

public class Testes {
	
	AppView view = new MainAppView();
	
	AppFacade facade = new AppFacadeImpl(view);
	
	Aluno aluno;
	Filiado filiado;
	@Before
	public void setup() {
		
		aluno = new Aluno();
		filiado = new Filiado();
	}
	
	
	
	
	
	//CPF
		@Test
		public void cpfValido() throws Exception{
			String  cpf = "03779108305";
			filiado.setCpf(cpf);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String cpfcadastro = facade.searchAluno(aluno).get(0).getFiliado().getCpf();
			assertEquals("Não são iguai!!!",cpf,cpfcadastro);
		}
		

		@Test(expected=Exception.class)
		public void cpfVazio() {
		filiado.setCpf("");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}

		
		@Test(expected=Exception.class)
		public void cpfComMaisDe11Digitos() {
		filiado.setCpf("037791083054");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}

		
		@Test(expected=Exception.class)
		public void cpfLetra() {
		filiado.setCpf("037791083ro");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}
		
		@Test(expected=Exception.class)
		public void cpfCracteresEspeciais() {
		filiado.setCpf("**7791083##");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}

	
	//Nome
	
	@Test
	public void nomeValido()throws Exception {
		String  nome = "Ronildo Ferreira";
		filiado.setNome(nome);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		String nomecadastro = facade.searchAluno(aluno).get(0).getFiliado().getNome();
		assertEquals("Não são iguai!!!",nome,nomecadastro);
	}
	
	@Test(expected=Exception.class)
	public void nomeVazio(){
	filiado.setNome("");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}

	
	@Test(expected=Exception.class)
	public void nomeNumero() {
	filiado.setNome("Ronildo123");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void nomeCaracterEspecial() {
	filiado.setNome("Ronildo@Ferreira");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}

	
		
	//Email
	@Test
	public void emailValido()throws Exception {
		String  email = "ronildo.ufpi@gmail.com";
		filiado.setEmail(email);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		String emailcadastro = facade.searchAluno(aluno).get(0).getFiliado().getEmail();
		assertEquals("Não são iguai!!!",email,emailcadastro);
	}
	

	@Test(expected=Exception.class)
	public void emailVazio(){
	filiado.setEmail("");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void emailSemArroba(){
	filiado.setEmail("ronildo.ufpigmail.com");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void emailSemDominio(){
	filiado.setEmail("ronildo.ufpi@.com");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void emailCoractereEspecial(){
	filiado.setEmail("ronildo-ufpi@.com");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	

	@Test(expected=Exception.class)
	public void emailRepetido(){
	filiado.setEmail("ronildo.ufpi@gmail.com = ronildo.ufpi@gmail.com");
	aluno.setFiliado(filiado);
	facade.createAluno(aluno);
	}
	
	
	//Telefone
		@Test
		public void TelefoneValido() throws Exception{
			String  telefone = "994025622";
			filiado.setTelefone1(telefone);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String telefonecadastro = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Não são iguai!!!",telefone,telefonecadastro);
		}
	
	
		

		@Test(expected=Exception.class)
		public void telefoneVazio(){
		filiado.setTelefone1("");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}
	
		
		@Test(expected=Exception.class)
		public void telefoneLetras(){
		filiado.setTelefone1("994r226t4");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}
		

		@Test(expected=Exception.class)
		public void telefone10Digitos(){
		filiado.setTelefone1("9940256331");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}
		
		@Test(expected=Exception.class)
		public void telefoneCracteresEspeciais(){
		filiado.setTelefone1("@9402563**");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		}
	
	
			
}

