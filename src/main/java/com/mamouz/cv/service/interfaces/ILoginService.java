package com.mamouz.cv.service.interfaces;

import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;

public interface ILoginService {
	
	public Boolean create(Login login);
	public void remove(long id); 
	public void update(Login login);
	public Profile validateUser(Login login);
}
