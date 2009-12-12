package org.fpij.jitakyoei.model.dao;

import java.util.List;

public interface DAO<E> {

	public abstract boolean save(E object)
	throws IllegalArgumentException;

	public abstract void delete(E object)
	throws IllegalArgumentException;

	public abstract List<E> list()
	throws IllegalArgumentException;

	public abstract E get(E object)
	throws IllegalArgumentException;

	public abstract List<E> search(E object)
	throws IllegalArgumentException;

}