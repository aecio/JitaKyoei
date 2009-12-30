package org.fpij.jitakyoei.util;

import java.util.Date;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;

public class Main {
	
	public static void main(String[] args) {
//		new StartupHelper().initialize();
//		PlafOptions.setAsLookAndFeel();
//		dbPopulator();
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		AppView view = new MainAppView();
		AppFacade facade = new AppFacadeImpl(view);
		view.registerFacade(facade);
	}
	
	public static void dbPopulator(){
		Endereco endereco = new Endereco();
		endereco.setBairro("Dirceu");
		endereco.setCep("64078-213");
		endereco.setCidade("Teresina");
		endereco.setEstado("PI");
		endereco.setRua("Rua Des. Berilo Mota");
		
		Filiado filiadoProf = new Filiado();
		filiadoProf.setNome("Neto");
		filiadoProf.setCpf("036.464.453-27");
		filiadoProf.setDataNascimento(new Date());
		filiadoProf.setDataCadastro(new Date());
		filiadoProf.setId(3332L);
		filiadoProf.setEndereco(endereco);
		
		Professor professor = new Professor();
		professor.setFiliado(filiadoProf);
		
		Entidade entidade = new Entidade();
		entidade.setEndereco(endereco);
		entidade.setNome("Ricardo Paraguasu");
		entidade.setTelefone1("(086)1234-5432");
		
		DAO<Professor> dao = new DAOImpl<Professor>(Professor.class);
		dao.save(professor);
		
		DAO<Entidade> daoEnt = new DAOImpl<Entidade>(Entidade.class);
		daoEnt.save(entidade);
	}
}