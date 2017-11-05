/**
 * 
 */
package com.mamouz.cv.dao.interfaces;

import java.util.List;

import com.mamouz.cv.entity.Login;


/**
 * @author mikak
 *
 */
public interface IDaoEntity <T, PK>{
	
	public Boolean create(T t);
	public void remove(long id); 
	public void update(T t);
	public T findById(long id);
	public List<T> findByCriteria(String criteria);
	public List<T> findAll();
	
	public void register(T user);
	public Login validateUser(Login login); 
}
