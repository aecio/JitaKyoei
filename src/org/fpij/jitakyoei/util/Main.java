package org.fpij.jitakyoei.util;

import java.util.List;
import java.util.Scanner;

import javax.swing.UIManager;

import org.fpij.jitakyoei.beans.Aluno;
import org.fpij.jitakyoei.dao.AlunoDAO;
import org.fpij.jitakyoei.dao.DAO;
import org.fpij.jitakyoei.view.FPIJ_App;
import org.fpij.jitakyoei.view.FiliadoPanel;

import com.pagosoft.plaf.PlafOptions;

public class Main {

	private static Scanner in = new Scanner(System.in);
	private static DAO<Aluno> alunoDAO =  new AlunoDAO();
	
	public static void main(String[] args) {
		//PlafOptions.setAsLookAndFeel();
		FPIJ_App app = new FPIJ_App();
		app.setVisible(true);
	}

}
/*
	public static void main(String[] args) {
		String opcao;
		do{
			System.out.println("O que deseja fazer agora?");
			System.out.println(" 1. Adicionar Aluno");
			System.out.println(" 2. Listar Alunos");
			System.out.println(" 3. Atualizar Aluno");
			System.out.println(" 4. Excluir Aluno");
			System.out.println(" 4. Sair");
			
			System.out.println("Sua opção: ");
			opcao = in.nextLine();
			switch (Integer.parseInt(opcao)) {
			case 1:
				adicionar();
				break;
			case 2:
				listar();
				break;
			default:
				break;
			}
			opcao = in.nextLine();	
		}while(!opcao.equals("4"));
		
		DatabaseManager.close();
	}
	
	public static void adicionar(){
		String valor;
		Aluno novo = new Aluno();
		
		System.out.println("Digite os dados do aluno:");
		System.out.print("Nome: ");
		valor = in.nextLine();
		novo.setNome(valor);
		
		System.out.print("E-mail: ");
		valor = in.nextLine();
		novo.setEmail(valor);
		
		System.out.print("Endereco: ");
		valor = in.nextLine();
		novo.setEndereco(valor);
		
		System.out.print("Telefone 1: ");
		valor = in.nextLine();
		novo.setTelefone1(valor);
		
		alunoDAO.save(novo);
	}
	
	public static void listar() {
		for(int i=0;i<50;i++) System.out.println();;
		List<Aluno> list = new AlunoDAO().list();
		for (Aluno aluno : list) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(aluno.getNome());
			System.out.println(aluno.getEmail());
			System.out.println(aluno.getEndereco());
			System.out.println(aluno.getTelefone1());
			
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Pressione qualquer tecla para continuar...");
		in.nextLine();
		for(int i=0;i<50;i++) System.out.println();;
	}
	
	
	public void teste(){	
		
		DAO<Aluno> dao = new AlunoDAO();
		
		Aluno a1 = new Aluno();
		a1.setId(1L);
		a1.setNome("Aécio");
		a1.setEmail("aecio.solando@gmail.com");
		
		Aluno a2 = new Aluno();
		a2.setId(2L);
		a2.setNome("Alcemir");
		a2.setEmail("alcemir.santos@gmail.com");

		Aluno a3 = new Aluno();
		a3.setId(3L);
		a3.setNome("Pablo");
		a3.setEmail("pablo.viadinho@gmail.com");
		
		Aluno a4 = new Aluno();
		a4.setId(4L);
		a4.setNome("Makissuel");
		a4.setEmail("maxdeathlyhallows@gmail.com");
		
		dao.save(a1);
		dao.save(a2);
		dao.save(a3);
		dao.save(a4);
		
		a3.setNome("Pablo Viadinho");
		dao.save(a3);
		
		dao.delete(a2);
		
		List<Aluno> result = dao.list();
		for (Aluno aluno : result) {
			System.out.println(aluno.getId());
			System.out.println(aluno.getNome());
			System.out.println(aluno.getEmail());
			System.out.println("-------------");
		}

	}

}
*/