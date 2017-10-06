/**
 * 
 */
package com.mamouz.cv.dao.interfaces;

import java.util.List;


/**
 * @author mikak
 *
 */
public interface IDaoEntity <T, PK>{
	
	public Boolean create(T t);
	public void remove(int id); 
	public void update(T t);
	public T findById(int id);
	public List<T> findByCriteria(String criteria);
	public List<T> findAll();
}
