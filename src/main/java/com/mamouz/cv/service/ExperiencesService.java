/**
 * 
 */
package com.mamouz.cv.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mamouz.cv.dao.interfaces.IExperiences;
import com.mamouz.cv.entity.Experiences;
import com.mamouz.cv.service.interfaces.IExperienceService;

/**
 * @author mikak
 *
 */
@Service("experiencesService")
public class ExperiencesService implements IExperienceService {

private static final Logger log = Logger.getLogger(ProfileService.class);
	
	@Resource(name="experiencesDao")
	IExperiences dao;
	
	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#create(java.lang.Object)
	 */
	@Override
	public Boolean create(Experiences t) {
		boolean createExperiencesService = true;
		try {
			log.info("--------------- IN create ExperiencesService ----------------");
			
			dao.create(t);

			log.info("--------------- OUT create ExperiencesService ----------------");
		} catch (Exception e) {
			log.error("Problème dans la cration ExperiencesService : " + e);
			createExperiencesService = false;
		}
				
		return createExperiencesService;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#remove(long)
	 */
	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#update(java.lang.Object)
	 */
	@Override
	public void update(Experiences t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findById(long)
	 */
	@Override
	public Experiences findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findByCriteria(java.lang.String)
	 */
	@Override
	public List<Experiences> findByCriteria(String criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findAll()
	 */
	@Override
	public List<Experiences> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
