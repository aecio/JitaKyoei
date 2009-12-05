package org.fpij.jitakyoei.dao;

import java.util.ArrayList;
import java.util.List;

import org.fpij.jitakyoei.util.DatabaseManager;

import com.db4o.ObjectSet;
import com.db4o.ext.ExtObjectContainer;

public abstract class DAO<E> {
	
	protected ExtObjectContainer db = DatabaseManager.getConnection();
	protected Class<E> clazz;
	
	public boolean save(E object) {
		if(validate(object)){
			db.queryByExample(clazz);
			db.store(object);
			return true;
		}
		else{
			return false;
		}
	}
	
	public abstract boolean validate(E object);
	
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
	
	public E get(E object) {
		ObjectSet<E> result = db.queryByExample(clazz);
		return result.next();
	}
}
