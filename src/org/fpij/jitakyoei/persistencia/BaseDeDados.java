package org.fpij.jitakyoei.persistencia;



import java.util.HashMap;

import org.fpij.jitakyoei.beandeprecated.Entidade;
import org.fpij.jitakyoei.beandeprecated.Filiado;
import org.fpij.jitakyoei.beandeprecated.Funcionario;
import org.fpij.jitakyoei.exceptions.NotFoundAtletaException;
import org.fpij.jitakyoei.exceptions.NotFoundEntidadeException;
import org.fpij.jitakyoei.exceptions.NotFoundFuncionarioException;
import org.fpij.jitakyoei.exceptions.NotFoundProfessorException;


/**
 *
 * @author A.Santos
 * 
 */
@Deprecated
public class BaseDeDados {

	
	private static HashMap<Integer, Filiado> atletas = new HashMap<Integer, Filiado>();
    private static HashMap<Integer, Filiado> professores = new HashMap<Integer, Filiado>();
    private static HashMap<Integer, Funcionario> funcionarios = new HashMap<Integer, Funcionario>();
    private static HashMap<Integer, Entidade> academias = new HashMap<Integer, Entidade>();

//
//    public static Exemplar getExemplarEmprestadoByClienteDVD(Cliente cliente, DVD dvd) {
//	        for (Emprestimo emprestimo : academias.values()) {
//	            if( (emprestimo.getDataDevolucao() == null) && (emprestimo.getCliente().getCodigo() == cliente.getCodigo() ) && (emprestimo.getExemplar().getTitulo().getCodigo() == dvd.getObjTitulo().getCodigo() ) ){
//	                return emprestimo.getExemplar();
//	            }
//	        }
//	        return null;
//	    }
//	    
//	    public static Emprestimo getEmprestimoByClienteDVD(Cliente cliente, DVD dvd) {
//	        for (Emprestimo emprestimo : academias.values()) {
//	            if( (emprestimo.getCliente().getCodigo() == cliente.getCodigo() ) && (emprestimo.getExemplar().getTitulo().getCodigo() == dvd.getObjTitulo().getCodigo() ) ){
//	                return emprestimo;
//	            }
//	        }
//	        return null;
//	    }
//
//	    public static Exemplar getExemplarDisponivel(DVD dvd) {
//	        
//	        List<Exemplar> listaExemplares = dvd.getExemplares();
//	        
//	        for (Exemplar exemplar : listaExemplares) {
//	            
//	            if(exemplar.getStatus() == Status.DISPONIVEL)
//	                return exemplar;
//	            
//	        }
//
//	        return null;
//	    }
	    
	    public static int sizeAtletas() {
	        return atletas.size();
	    }

	    public static int sizeProfesores() {
	        return professores.size();
	    }

	    public static int sizeAcademias() {
	        return academias.size();
	    }

	    public static void putAtleta(Filiado atleta) {
	        atletas.put(atleta.getIdFiliado(), atleta);
	    }

	    public static void putProfessor(Filiado prof) {
	        professores.put(prof.getIdFiliado(), prof);
	    }
	    
	    public static void putFuncionario(Funcionario novoFuncionario) {			
		    funcionarios.put(novoFuncionario.getIdFuncionario(), novoFuncionario);		    	
		}
	    
	    public static void putAcademia( Entidade academia) {
	        academias.put(academia.getIdEntidade(), academia);
	    }

	    public static void removeAtleta(Filiado atleta) throws NotFoundAtletaException {
	        if (atletas.containsKey( atleta.getIdFiliado() ) ) {
	        atletas.remove(atleta.getIdFiliado());
	        } else {
	            throw new NotFoundAtletaException();
	        }
	    }

	    public static void removeProfessor(Filiado prof) throws NotFoundProfessorException {
	        if (professores.containsKey(prof.getIdFiliado())) {
	        professores.remove(prof.getIdFiliado());
	        } else {
	            throw new NotFoundProfessorException();
	        }
	    }
	    	    
		public static void removeFuncionario(Funcionario funcionario) throws NotFoundFuncionarioException {
	        if (funcionarios.containsKey(funcionario.getIdFuncionario())) {
	        funcionarios.remove(funcionario.getIdFuncionario());
	        } else {
	            throw new NotFoundFuncionarioException();
	        }
	    }
	    
		public static void removeAcademia(Entidade academia) throws NotFoundEntidadeException {
	        if (academias.containsKey(academia.getIdEntidade())) {
	        academias.remove(academia.getIdEntidade());
	        } else {
	            throw new NotFoundEntidadeException();
	        }
	    }

	    public static Filiado getAtleta(int idAtleta) throws NotFoundAtletaException {
	        if (atletas.containsKey(idAtleta)) {
	            return atletas.get(idAtleta);
	        } else {
	            throw new NotFoundAtletaException();
	        }
	    }

	    public static Filiado getProfessor(int idProfessor) throws NotFoundProfessorException {
	        if (professores.containsKey(idProfessor)) {
	            return professores.get(idProfessor);
	        } else {
	            throw new NotFoundProfessorException();
	        }
	    }
	    
	    public static Funcionario getFuncionario(int idFuncionario) throws NotFoundFuncionarioException {
	        if (funcionarios.containsKey(idFuncionario)) {
	            return funcionarios.get(idFuncionario);
	        } else {
	            throw new NotFoundFuncionarioException();
	        }
	    }
	    public static Entidade getAcademia(int idAcademia) throws NotFoundEntidadeException {
	        if (academias.containsKey(idAcademia)) {
	            return academias.get(idAcademia);
	        } else {
	            throw new NotFoundEntidadeException();
	        }
	    }
//
//	    public static List<Cliente> getClientes() {
//	        List<Cliente> lClientes = new ArrayList<Cliente>();
//
//	        for (Cliente cliente : atletas.values()) {
//	            lClientes.add(cliente);
//	        }
//
//	        return lClientes;
//	    }
//
//	    public static List<DVD> getDVDs() {
//	        List<DVD> lDVDs = new ArrayList<DVD>();
//
//	        for (DVD dvd : professores.values()) {
//	            lDVDs.add( dvd );
//	        }
//
//	        return lDVDs;
//	    }
//
//	    public static List<Emprestimo> getEmprestimos() {
//	        List<Emprestimo> lEmprestimos = new ArrayList<Emprestimo>();
//
//	        for (Emprestimo emprestimo : academias.values()) {
//	            lEmprestimos.add( emprestimo );
//	        }
//
//	        return lEmprestimos;
//	    }

}
