/**
 * 
 */
package com.mamouz.cv.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mamouz.cv.dao.interfaces.IExperiences;
import com.mamouz.cv.entity.Experiences;
import com.mamouz.cv.entity.Login;

/**
 * @author mikak
 *
 */
@Repository("experiencesDao")
public class ExperiencesDao implements IExperiences {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(ProfileDao.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#create(java.lang.Object)
	 */
	@Override
	public Boolean create(Experiences t) {
		boolean createExperience = true;
		try {
			log.info("\033[42m-----------------IN Create Experiences------------------\033[0m\n");
			
			
			
			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// Début de la transaction.
			Transaction tx = session.beginTransaction();

			// Transaction save
			session.saveOrUpdate(t);
			tx.commit();

			log.debug("\033[42mExperiences créer avec succès : " + t + "\033[0m\n");
			// fermeture de la session.
			session.close();

			log.info("\033[42m-----------------OUT Create Experiences------------------\033[0m\n");

		}catch (Exception e) {
			log.error("Problème dans la création des expériences : " + e);
		} 
		return createExperience;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#remove(long)
	 */
	@Override
	public void remove(long id) {
		log.info("-----------------IN remove Experiences------------------");
		// TODO Auto-generated method stub

		log.info("-----------------OUT remove Experiences------------------");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#update(java.lang.Object)
	 */
	@Override
	public void update(Experiences t) {
		log.info("-----------------IN update Experiences------------------");
		// TODO Auto-generated method stub
		log.info("-----------------OUT update Experiences------------------");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#findById(long)
	 */
	@Override
	public Experiences findById(long id) {
		log.info("-----------------IN finbyId Experiences------------------");
		// TODO Auto-generated method stub
		log.info("-----------------OUT finById Experiences------------------");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.cv.dao.interfaces.IDaoEntity#findByCriteria(java.lang.String)
	 */
	@Override
	public List<Experiences> findByCriteria(String criteria) {
		log.info("-----------------IN findByCriteria Experiences------------------");
		// TODO Auto-generated method stub
		log.info("-----------------OUT findByCriteria Experiences------------------");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#findAll()
	 */
	@Override
	public List<Experiences> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#register(java.lang.Object)
	 */
	@Override
	public void register(Experiences user) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.cv.dao.interfaces.IDaoEntity#validateUser(com.mamouz.cv.entity
	 * .Login)
	 */
	@Override
	public Login validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
