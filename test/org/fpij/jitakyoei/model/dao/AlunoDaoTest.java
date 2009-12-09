package org.fpij.jitakyoei.model.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.util.DatabaseManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlunoDaoTest {
	
	private static DAOImpl<Aluno> alunoDao;
	private static Aluno aluno1;
	private static Entidade entidade1;
	private static Filiado filiado2;
	private static Endereco endereco1;
	private static Filiado filiado1;
	private static Professor professor1;
	
	public void clearDatabase(){
		List<Aluno> todos = alunoDao.list();
		for (Aluno aluno : todos) {
			alunoDao.delete(aluno);
		}
		assertEquals(0, alunoDao.list().size());
	}
	
	@BeforeClass
	public static void createObjects(){
		filiado1 = new Filiado();
		filiado1.setNome("Aécio");
		filiado1.setCpf("036.464.453-27");
		filiado1.setDataNascimento(new Date());
		filiado1.setDataCadastro(new Date());
		filiado1.setId(1332L);
		
		endereco1 = new Endereco();
		endereco1.setBairro("Dirceu");
		endereco1.setCep("64078-213");
		endereco1.setCidade("Teresina");
		endereco1.setEstado("PI");
		endereco1.setRua("Rua Des. Berilo Mota");
		
		
		filiado2 = new Filiado();
		filiado2.setNome("Professor");
		filiado2.setCpf("036.464.453-27");
		filiado2.setDataNascimento(new Date());
		filiado2.setDataCadastro(new Date());
		filiado2.setId(3332L);
		filiado2.setEndereco(endereco1);
		
		professor1 = new Professor();
		professor1.setFiliado(filiado2);
		
		entidade1 = new Entidade();
		entidade1.setEndereco(endereco1);
		entidade1.setNome("Academia 1");
		entidade1.setTelefone1("(086)1234-5432");
		
		aluno1 = new Aluno();
		aluno1.setFiliado(filiado1);
		aluno1.setProfessor(professor1);
		aluno1.setEntidade(entidade1);
		alunoDao = new DAOImpl<Aluno>(Aluno.class);
	}

	
	@Test
	public void  testSalvarAlunoComAssociassoes(){
		clearDatabase();
		
		alunoDao.save(aluno1);
		assertEquals(aluno1.getFiliado().getCpf(), alunoDao.get(aluno1).getFiliado().getCpf());
		assertEquals("Aécio", alunoDao.get(aluno1).getFiliado().getNome());
		assertEquals("Professor", alunoDao.get(aluno1).getProfessor().getFiliado().getNome());
		assertEquals("Dirceu", alunoDao.get(aluno1).getProfessor().getFiliado().getEndereco().getBairro());
	}
	
	@Test
	public void updateAluno(){
		int qtdObjetos = 0;
		
		qtdObjetos = alunoDao.list().size();
		
		Aluno a1 = alunoDao.get(aluno1);
		a1.getFiliado().setNome("NomeDeTeste1");
		alunoDao.save(a1);
		
		a1 = alunoDao.get(aluno1);
		assertEquals("NomeDeTeste1", a1.getFiliado().getNome());
		assertEquals(qtdObjetos, alunoDao.list().size());
		
		a1.getFiliado().setNome("OutroNome");
		assertEquals("OutroNome", a1.getFiliado().getNome());
		assertEquals(qtdObjetos, alunoDao.list().size());
	}
	
	@Test
	public void testListarEAdicionarAlunos(){
		int qtd = alunoDao.list().size();
		
		alunoDao.save(new Aluno());
		assertEquals(qtd+1, alunoDao.list().size());
		
		alunoDao.save(new Aluno());
		assertEquals(qtd+2, alunoDao.list().size());
		
		alunoDao.save(new Aluno());
		assertEquals(qtd+3, alunoDao.list().size());
		
		alunoDao.save(new Aluno());
		assertEquals(qtd+4, alunoDao.list().size());
		
		clearDatabase();
		assertEquals(0, alunoDao.list().size());
		
		alunoDao.save(new Aluno());
		assertEquals(1, alunoDao.list().size());
	}
	
	@Test
	public void testSearchAluno(){
		clearDatabase();
		DatabaseManager.close();
		DatabaseManager.open();
		createObjects();
		
		Filiado f = new Filiado();
		f.setNome("Aécio");
		
		Aluno a = new Aluno();
		a.setFiliado(f);
		
		Aluno result = alunoDao.get(aluno1);
		
		assertEquals("036.464.453-27", result.getFiliado().getCpf());
	}
	
	@AfterClass
	public static void closeDatabase(){
		DatabaseManager.close();
	}
	
}
