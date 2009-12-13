package org.fpij.jitakyoei.business;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Professor;

public interface ProfessorBO {
	public void createProfessor(Professor professor) throws Exception;
	public void updateProfessor(Professor professor) throws Exception;
	public List<Professor> searchProfessor(Professor professor) throws Exception;
	public List<Professor> listAll() throws Exception;
}
