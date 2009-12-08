package org.fpij.jitakyoei.model;

import java.util.List;

public interface Model<E> {
	public Long save(E obj) throws Exception;
	public Long update(E obj) throws Exception;
	public void delete(E obj) throws Exception;
	public List<E> find(E obj) throws Exception;
}
