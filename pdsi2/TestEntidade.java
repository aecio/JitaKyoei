package org.fpij.jitakyoei.pdsi2;

import static org.junit.Assert.*;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.junit.Test;

public class TestEntidade {

	AppView view = new MainAppView();
	AppFacade facade = new AppFacadeImpl(view);
		
	@Test(expected=Exception.class)
	public void testEntidadeInvalido() throws Exception {
	
		String nome = "123";
	
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
	
		facade.createEntidade(entidade);
	
	}

	@Test
	public void testEntidadeValida() {
	
		String nome = "Confederação Brasileira de Judô";
	
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
	
		facade.createEntidade(entidade);
	
		String nomecadastrado = facade.searchEntidade(entidade).get(0).getNome();
		assertEquals("Nome válido", nome, nomecadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testCNPJInvalido() throws Exception{
		
		String cnpj = "123456789101111111";
		
		Entidade entidade = new Entidade();
		entidade.setCnpj(cnpj);
				
		facade.createEntidade(entidade);
		
	}
	
	@Test
	public void testCNPJValido() throws Exception{
		
		String cnpj = "41282658000110";
		
		Entidade entidade = new Entidade();
		entidade.setCnpj(cnpj);
				
		facade.createEntidade(entidade);
		
		String cnpjcadastrado = facade.searchEntidade(entidade).get(0).getCnpj();
		assertEquals("CNPJ válido!", cnpj, cnpjcadastrado);
		
	}
	
	@Test(expected=Exception.class)
	public void testFone1Invalido() throws Exception{
			
			String fone = "abcd";
			
			Entidade entidade = new Entidade();
			entidade.setTelefone1(fone);
			
			facade.createEntidade(entidade);
		
	}
	
	@Test
	public void testFone1Valido() throws Exception{
			
			String fone = "89999426321";
			
			Entidade entidade = new Entidade();
			entidade.setTelefone1(fone);
			
			facade.createEntidade(entidade);
			
			String fonecadastrado = facade.searchEntidade(entidade).get(0).getTelefone1();
			assertEquals("Telefone válido!", fone, fonecadastrado);
		
	}
	
	@Test(expected=Exception.class)
	public void testFone2Invalido() throws Exception{
		
		String fone = "abcd";
		
		Entidade entidade = new Entidade();
		entidade.setTelefone2(fone);
		
		facade.createEntidade(entidade);
			
	}
	
	@Test
	public void testFone2Valido() throws Exception{
			
			String fone = "89999426321";
			
			Entidade entidade = new Entidade();
			entidade.setTelefone2(fone);
			
			facade.createEntidade(entidade);
			
			String fonecadastrado = facade.searchEntidade(entidade).get(0).getTelefone2();
			assertEquals("Telefone válido!", fone, fonecadastrado);
		
	}

	@Test(expected=Exception.class)
	public void testRuaInvalido() {
		
		String rua = "Pedro 2";
		
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);

	}
	
	@Test
	public void testRuaValido() {
		
		String rua = "Pedro II";
		
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String ruacadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getRua();
		assertEquals("Rua válida", rua, ruacadastrado);

	}
	
	@Test(expected=Exception.class)
	public void testNumeroInvalido() throws Exception{
		
		String numero= "abcd";
		
		Endereco endereco = new Endereco();
		endereco.setNumero(numero);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);	
	
	}
	
	@Test
	public void testNumeroValido() {
		
		String numero = "106";
		
		Endereco endereco = new Endereco();
		endereco.setNumero(numero);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String numerocadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getNumero();
		assertEquals("Número válido!", numero, numerocadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testBairroInvalido() throws Exception{
		
		String bairro = "123";
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);	
	
	}
	
	@Test
	public void testBairroValido() {
		
		String bairro = "Junco";
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String bairrocadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getBairro();
		assertEquals("Bairro válido!", bairro, bairrocadastrado);

	}
	
	@Test(expected=Exception.class)
	public void testCidadeInvalido() throws Exception{
		
		String cidade= "123";
		
		Endereco endereco = new Endereco();
		endereco.setCidade(cidade);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);	
	
	}
	
	@Test
	public void testCidadeValido() {
		
		String cidade = "Picos";
		
		Endereco endereco = new Endereco();
		endereco.setCidade(cidade);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String cidadecadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getCidade();
		assertEquals("Cidade válida!", cidade, cidadecadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testEstadoInvalido() throws Exception{
		
		String estado = "123";
		
		Endereco endereco = new Endereco();
		endereco.setEstado(estado);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);	
	
	}
	
	@Test
	public void testEstadoValido() {
		
		String estado = "Piaui";
		
		Endereco endereco = new Endereco();
		endereco.setEstado(estado);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String estadocadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getEstado();
		assertEquals("Estado válido!", estado, estadocadastrado);
	
	}
	
	@Test(expected=Exception.class)
	public void testCEPInvalido() throws Exception{
		
		Endereco endereco = new Endereco();
		endereco.setCep("645000000000");
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
	}
	
	@Test
	public void testCEPValido() {
		
		String cep = "64600000";
		
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		
		facade.createEntidade(entidade);
		
		String cepcadastrado = facade.searchEntidade(entidade).get(0).getEndereco().getCep();
		assertEquals("Cep válido!", cep, cepcadastrado);

	}
	
}
