package org.fpij.jitakyoei.pdsi2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.junit.Test;

public class TestAluno {

	AppView view = new MainAppView();
	AppFacade facade = new AppFacadeImpl(view);
		
	@Test(expected=Exception.class)
	public void testNomeInvalido() throws Exception {
	
		String nome = "123";
		
		Filiado filiado = new Filiado();
		filiado.setNome(nome);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
	}

	@Test
	public void testNomeValido() {
	
		String nome = "Márcio Silvano de Sousa";
	
		Filiado filiado = new Filiado();
		filiado.setNome(nome);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
		String nomecadastrado = facade.searchAluno(aluno).get(0).getFiliado().getNome();
		assertEquals("Nome válido", nome, nomecadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testCPFTem11DigitosInvalido() throws Exception{
		//Dado que eu tenho...
		Filiado filiado = new Filiado();
		filiado.setCpf("12345678910");
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		//Quando tentar criar cadastrar o aluno...
		facade.createAluno(aluno);
		//Então, espera que...
		
	}
	
	@Test
	public void testCPFTem11DigitosValidos() throws Exception{
		//Dado que eu tenho...
		String cpf = "12345678910";
		Filiado filiado = new Filiado();
		filiado.setCpf(cpf);
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		//Quando tentar criar cadastrar o aluno...
		facade.createAluno(aluno);
		String cpfcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getCpf();
		//Então, espera que...
		assertEquals("Não são iguais", cpf, cpfcadastrado);
		
	}
	
	@Test(expected=Exception.class)
	public void testRegistroCBJInvalido() throws Exception {
	
		String codigo = "abcd=-.";
		
		Filiado filiado = new Filiado();
		filiado.setRegistroCbj(codigo);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
	}

	@Test
	public void testRegistriCBJValido() {
	
		String codigo = "12345678";
	
		Filiado filiado = new Filiado();
		filiado.setRegistroCbj(codigo);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
		String codigocadastrado = facade.searchAluno(aluno).get(0).getFiliado().getRegistroCbj();
		assertEquals("Registro válido!", codigo, codigocadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testEmailInvalido() throws Exception{
		
		String email = "marciosilvano";
		
		Filiado filiado = new Filiado();
		filiado.setEmail(email);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	
	@Test
	public void testEmailValido() throws Exception {
		
		String email = "marciosilvano139@gmail.com";
		
		Filiado filiado = new Filiado();
		filiado.setEmail(email);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);

		String emailcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEmail();
		assertEquals("Email válido!", email, emailcadastrado);
		
	}
	
	@Test(expected=Exception.class)
	public void testDataNascimentoInvalida(){
		
		Date data = new Date();
		
		Filiado filiado = new Filiado();
		filiado.setDataNascimento(data);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
	}
	
	@Test
	public void testDataNascimentoValida(){
		
		Date data = new Date("23/10/2017");
		
		Filiado filiado = new Filiado();
		filiado.setDataNascimento(data);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		Date datacadastrada = facade.searchAluno(aluno).get(0).getFiliado().getDataNascimento();
		assertEquals("Data de nascimento válida!", data, datacadastrada);
		
	}
	
	@Test(expected=Exception.class)
	public void testRGInvalido(){
		
		String numero = "abcd";
		
		Rg rg = new Rg();
		rg.setNumero(numero);
		
		Filiado filiado = new Filiado();
		filiado.setRg(rg);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
	}
	
	@Test
	public void testRGValido(){
		
		String numero = "1234";
		//Rg rgcadastrado = new Rg();		
		
		Rg rg = new Rg();
		rg.setNumero(numero);
		
		Filiado filiado = new Filiado();
		filiado.setRg(rg);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String rgcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getRg().getNumero();
		assertEquals("Rg válido!", numero, rgcadastrado);
	}
	
	@Test(expected=Exception.class)
	public void testOrgaoExpedidorInvalido(){
		
		String orgao = "123";
		
		Rg rg = new Rg();
		rg.setOrgaoExpedidor(orgao);;
		
		Filiado filiado = new Filiado();
		filiado.setRg(rg);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
	}
	
	@Test
	public void testOrgaoExpedidorValido(){
		
		String orgao = "SSP";		
		
		Rg rg = new Rg();
		rg.setOrgaoExpedidor(orgao);;
		
		Filiado filiado = new Filiado();
		filiado.setRg(rg);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String rgcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getRg().getOrgaoExpedidor();
		assertEquals("Rg válido!", orgao, rgcadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testFone1Invalido() throws Exception{
			
			String fone = "abcd";
			
			Filiado filiado = new Filiado();
			filiado.setTelefone1(fone);
			
			Aluno aluno = new Aluno();
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
			
	}
	
	@Test
	public void testFone1Valido() throws Exception{
			
			String fone = "89999426321";
			
			Filiado filiado = new Filiado();
			filiado.setTelefone1(fone);
			
			Aluno aluno = new Aluno();
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
			
			String fonecadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Telefone válido!", fone, fonecadastrado);
		}
	
	@Test(expected=Exception.class)
	public void testFone2Invalido() throws Exception{
		
		String fone = "abcd";
		
		Filiado filiado = new Filiado();
		filiado.setTelefone2(fone);
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
			
	}
	
	@Test
	public void testFone2Valido() throws Exception{
			
			String fone = "89999426321";
			
			Filiado filiado = new Filiado();
			filiado.setTelefone2(fone);
			
			Aluno aluno = new Aluno();
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
			
			String fonecadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone2();
			assertEquals("Telefone válido!", fone, fonecadastrado);
		
	}

	@Test(expected=Exception.class)
	public void testRuaInvalido() {
		
		String rua = "Pedro 2";
		
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);

	}
	
	@Test
	public void testRuaValido() {
		
		String rua = "Pedro II";
		
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String ruacadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getRua();
		assertEquals("Rua válida", rua, ruacadastrado);

	}
	
	@Test(expected=Exception.class)
	public void testNumeroInvalido() throws Exception{
		
		String numero= "abcd";
		
		Endereco endereco = new Endereco();
		endereco.setNumero(numero);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);	
	
	}
	
	@Test
	public void testNumeroValido() {
		
		String numero = "106";
		
		Endereco endereco = new Endereco();
		endereco.setNumero(numero);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String numerocadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getNumero();
		assertEquals("Número válido!", numero, numerocadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testBairroInvalido() throws Exception{
		
		String bairro = "123";
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);	
	
	}
	
	@Test
	public void testBairroValido() {
		
		String bairro = "Junco";
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String bairrocadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getBairro();
		assertEquals("Bairro válido!", bairro, bairrocadastrado);

	}
	
	@Test(expected=Exception.class)
	public void testCidadeInvalido() throws Exception{
		
		String cidade= "123";
		
		Endereco endereco = new Endereco();
		endereco.setCidade(cidade);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);	
	
	}
	
	@Test
	public void testCidadeValido() {
		
		String cidade = "Picos";
		
		Endereco endereco = new Endereco();
		endereco.setCidade(cidade);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String cidadecadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getCidade();
		assertEquals("Cidade válida!", cidade, cidadecadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testEstadoInvalido() throws Exception{
		
		String estado = "123";
		
		Endereco endereco = new Endereco();
		endereco.setEstado(estado);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);	
	
	}
	
	@Test
	public void testEstadoValido() {
		
		String estado = "Piaui";
		
		Endereco endereco = new Endereco();
		endereco.setEstado(estado);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String estadocadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getEstado();
		assertEquals("Estado válido!", estado, estadocadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testCEPTem8DigitosInvalido() throws Exception{
		//Dado que eu tenho...
		Endereco endereco = new Endereco();
		endereco.setCep("64500000");
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		//Quando tentar criar cadastrar o aluno...
		facade.createAluno(aluno);
		//Então, espera que...
		
	}
	
	@Test
	public void testCEPValido() {
		
		String cep = "64600000";
		
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		
		Filiado filiado = new Filiado();
		filiado.setEndereco(endereco);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		String cepcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEndereco().getCep();
		//Então, espera que...
		assertEquals("Não são iguais", cep, cepcadastrado);

	}
	
	@Test(expected=Exception.class)
	public void testObservaocaoInvalido() throws Exception {
	
		String observacao = "=-.,";
		
		Filiado filiado = new Filiado();
		filiado.setNome(observacao);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
	}

	@Test
	public void testObservacaoValido() {
	
		String observacoes = "abcd";
	
		Filiado filiado = new Filiado();
		filiado.setObservacoes(observacoes);
	
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
	
		facade.createAluno(aluno);
	
		String observacoescadastrado = facade.searchAluno(aluno).get(0).getFiliado().getObservacoes();
		assertEquals("Observção válida!", observacoes, observacoescadastrado);
	
	}
	
	//@Test(expected=Exception.class)
	//public void testCorFaixaInvalido(){
		
		//List<Faixa> faixas = new ArrayList<Faixa>();
		//int i;
		
		//CorFaixa cor = null;
		//cor.descricao = "Rosa";
		
		//Faixa faixa = new Faixa();
		//faixa.setCor(cor);
		
		//for(i=0;i<faixas.size();i++){
			//faixas.add(faixa);
		//}
		
		//Filiado filiado = new Filiado();
		//filiado.setFaixas(faixas);
		
		//Aluno aluno = new Aluno();
		//aluno.setFiliado(filiado);
		
		//facade.createAluno(aluno);
	
	//}
	
	@Test(expected=Exception.class)
	public void testDataEntregaFaixaInvalida(){
		
		Date data = new Date("21/11/2050");
		List<Faixa> faixas = new ArrayList<Faixa>();
		int i;
		
		Faixa faixa = new Faixa();
		faixa.setDataEntrega(data);
		
		for(i=0;i<faixas.size();i++){
			faixas.add(faixa);
		}
		
		Filiado filiado = new Filiado();
		filiado.setFaixas(faixas);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
	}


	@Test
	public void testDataEntregaFaixaValida(){
		
		Date data = new Date("22/12/2017");
		List<Faixa> faixas = new ArrayList<Faixa>();
		List<Faixa> datacadastrada = new ArrayList<Faixa>();
		int i;
		
		Faixa faixa = new Faixa();
		faixa.setDataEntrega(data);
		
		for(i=0;i<faixas.size();i++){
			faixas.add(faixa);
		}
		
		Filiado filiado = new Filiado();
		filiado.setFaixas(faixas);
		
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
		
		datacadastrada = facade.searchAluno(aluno).get(0).getFiliado().getFaixas();
		assertEquals("Data valida", faixas, datacadastrada);
		
	}
	
}
