package com.mamouz.cv.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mamouz.cv.dao.interfaces.ILogin;
import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.service.interfaces.ILoginService;


@Service("loginService")
public class LoginService implements ILoginService {
	private static final Logger log = Logger.getLogger(ProfileService.class);
	
	@Resource(name="loginDao")
	ILogin loginDao;
	
	@Override
	public Profile validateUser(Login login) {
		Profile p = new Profile();
		
		 p = loginDao.validateUser(login);
		 
		return p;
	}

	@Override
	public Boolean create(Login login) {
		boolean createLoginService = true;
		try {
			log.info("--------------- IN create LoginService ----------------");
			
			loginDao.create(login);

			log.info("--------------- OUT create LoginService ----------------");
		} catch (Exception e) {
			log.error("Problème dans la cration login: " + e);
			createLoginService = false;
		}
				
		return createLoginService;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Login login) {
		// TODO Auto-generated method stub
		
	}

}
