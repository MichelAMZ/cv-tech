/**
 * 
 */
package com.mamouz.cv.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mamouz.cv.dao.interfaces.IAdresse;
import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.service.interfaces.IAdresseservice;

/**
 * @author mikak
 *
 */
@Service("adresseService")
public class AdresseService implements IAdresseservice {

	private static final Logger log = Logger.getLogger(ProfileService.class);

	@Resource(name = "adresseDao")
	IAdresse adresseDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#create(java.lang.Object)
	 */
	@Override
	public Boolean create(Adresse ad) {
		boolean createAdresseDaoService = true;
		try {
			log.info("--------------- IN create AdresseService ----------------");

			adresseDAO.create(ad);

			log.info("--------------- OUT create AdresseService ----------------");
		} catch (Exception e) {
			log.error("Problème dans la cration : " + e);
			createAdresseDaoService = false;
		}

		return createAdresseDaoService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#remove(long)
	 */
	@Override
	public void remove(long id) {
		try {
			log.info("--------------- IN creremoveate AdresseService ----------------");

			adresseDAO.remove(id);

			log.info("---------------OUT remove AdresseService ----------------");
		} catch (Exception e) {
			log.info("suppression inpossible " + e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#update(java.lang.Object)
	 */
	@Override
	public void update(Adresse ad) {
		try {
			log.info("\033[43m--------------- IN creremoveate AdresseService ----------------\033[0m");

			adresseDAO.update(ad);

			log.info("\033[43m---------------OUT remove AdresseService ----------------\033[0m");
		} catch (Exception e) {
			log.info("\033[41mProbleme : mise à jour impossible " + e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findById(long)
	 */
	@Override
	public Adresse findById(long id) {
		Adresse ad = new Adresse();

		try {

			log.info("--------------- IN creremoveate ProfileService ----------------");

			ad = adresseDAO.findById(id);

			log.info("---------------OUT remove ProfileService ----------------");
		} catch (Exception e) {
			log.info("Probleme : mise à jour impossible " + e);
		}

		return ad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findByCriteria(java.lang.
	 * String)
	 */
	@Override
	public List<Adresse> findByCriteria(String criteria) {
		return adresseDAO.findByCriteria(criteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findAll()
	 */
	@Override
	public List<Adresse> findAll() {
		return adresseDAO.findAll();
	}

}
