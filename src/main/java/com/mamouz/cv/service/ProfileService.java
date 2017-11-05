/**
 * 
 */
package com.mamouz.cv.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mamouz.cv.dao.interfaces.IProfile;
import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;
import com.mamouz.cv.service.interfaces.IProfileService;

/**
 * @author mikak
 *
 */
@Service("profileService")
public class ProfileService implements IProfileService {

	private static final Logger log = Logger.getLogger(ProfileService.class);
	
	@Resource(name="profileDao")
	IProfile profileDao;
	
	
	@Override
	public Boolean create(Profile p) {
		
		boolean createProfileService = true;
		try {
			log.info("--------------- IN create ProfileService ----------------");
			
			profileDao.create(p);

			log.info("--------------- OUT create ProfileService ----------------");
		} catch (Exception e) {
			log.error("Problème dans la cration : " + e);
			createProfileService = false;
		}
				
		return createProfileService;
	}

	@Override
	public void remove(long id) {
		try {
			log.info("--------------- IN creremoveate ProfileService ----------------");
			
			profileDao.remove(id);

			log.info("---------------OUT remove ProfileService ----------------");
		} catch (Exception e) {
			log.info("suppression inpossible " + e);
		}		
	}

	@Override
	public void update(Profile p) {
		try {
			log.info("\033[43m--------------- IN creremoveate ProfileService ----------------\033[0m");	
			
			profileDao.update(p);

			log.info("\033[43m---------------OUT remove ProfileService ----------------\033[0m");
		} catch (Exception e) {
			log.info("\033[41mProbleme : mise à jour impossible " + e);
		}	
		
	}

	@Override
	public Profile findById(long id) {

		Profile p = new Profile();
		
		try {
			
			log.info("--------------- IN creremoveate ProfileService ----------------");
			
			 p = profileDao.findById(id);

			log.info("---------------OUT remove ProfileService ----------------");
		} catch (Exception e) {
			log.info("Probleme : mise à jour impossible " + e);
		}	
		
		return p;
	}

	@Override
	public List<Profile> findByCriteria(String criteria) {
		
		return profileDao.findByCriteria(criteria);
	}

	@Override
	public List<Profile> findAll() {
		return profileDao.findAll();
	}

	@Override
	public void register(Profile user) {
		profileDao.register(user);
		
	}

	@Override
	public Login validateUser(Login login) {
		profileDao.validateUser(login);
		return null;
	}

}
