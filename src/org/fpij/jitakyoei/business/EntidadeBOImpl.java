package org.fpij.jitakyoei.business;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.AppView;

public class EntidadeBOImpl implements EntidadeBO {
	
	private AppView view;
	private static DAO<Entidade> dao = new DAOImpl<Entidade>(Entidade.class);

	public EntidadeBOImpl(AppView view) {
		this.view = view;
	}
	
	private void fireModelChangeEvent(Entidade entidade) {
		view.handleModelChange(entidade);
	}

	@Override
	public void createEntidade(Entidade entidade) throws Exception {
		System.out.println("EntidadeBOImpl.createEntidade()");
		try {
			dao.save(entidade);
			fireModelChangeEvent(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar a entidade!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar a entidade.");
		}
	}

	@Override
	public List<Entidade> listAll() throws Exception {
		List<Entidade> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao listar entidades!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao listar entidades.");
		}
		return result;
	}

	@Override
	public List<Entidade> searchEntidade(Entidade entidade) throws Exception {
		List<Entidade> result;
		try {
			result = dao.search(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar entidades!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar entidades.");
		}
		return result;
	}

	@Override
	public void updateEntidade(Entidade entidade) throws Exception {
		try {
			dao.save(entidade);
			fireModelChangeEvent(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao atualizar a entidade!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar a entidade.");
		}
	}
}
