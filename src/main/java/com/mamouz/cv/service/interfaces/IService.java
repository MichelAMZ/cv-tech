/**
 * 
 */
package com.mamouz.cv.service.interfaces;

import java.util.List;

/**
 * @author mikak
 *
 */
public interface IService <T, PK>{
	public Boolean create(T t);
	public void remove(long id); 
	public void update(T t);
	public T findById(long id);
	public List<T> findByCriteria(String criteria);
	public List<T> findAll();
}

