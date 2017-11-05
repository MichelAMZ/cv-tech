/**
 * 
 */
package com.mamouz.cv.dao.interfaces;

import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;

/**
 * @author mikak
 *
 */
public interface ILogin {

	public Boolean create(Login login);
	public void remove(long id); 
	public void update(Login login);
	public Profile validateUser(Login login); 
}
