package org.fpij.jitakyoei.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.fpij.jitakyoei.model.validator.Validator;
import org.fpij.jitakyoei.util.DatabaseManager;

import com.db4o.ObjectSet;
import com.db4o.ext.ExtObjectContainer;

public class DAOImpl<E> {

	private ExtObjectContainer db = DatabaseManager.getConnection();
	private Class<E> clazz;
	private Validator<E> validator;
	
	public DAOImpl(Class<E> clazz, Validator<E> validator){
		this.validator = validator;
		this.clazz = clazz;
	}
	
	public DAOImpl(Class<E> clazz){
		this.validator = new DefaultValidator<E>();
		this.clazz = clazz;
	}
	
	public boolean save(E object) {
		if(validator.validate(object)){
			db.queryByExample(clazz);
			db.store(object);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void delete(E object) {
		db.delete(object);
	}
	
	public List<E> list() {
		List<E> objects = new ArrayList<E>();
		ObjectSet<E> result = db.queryByExample(clazz);
		while(result.hasNext()){
			objects.add((E)result.next());
		}
		return objects;
	}
	
	public E find(E object) {
		ObjectSet<E> result = db.queryByExample(clazz);
		return result.next();
	}

	/**
	 * Classe utilizada caso o nenhuma classe Validador seja fornecida na instanciação.
	 */
	public class DefaultValidator<T> implements Validator<T> {
		@Override
		public boolean validate(T obj) {
			return true;
		}
	}
}