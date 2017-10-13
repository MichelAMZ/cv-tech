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

import com.mamouz.cv.dao.interfaces.ITitreCV;
import com.mamouz.cv.entity.TitreCV;

/**
 * @author mikak
 *
 */
@Repository("titreCVDao")
public class TitreCVDao implements ITitreCV {


	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(TitreCVDao.class);
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#create(java.lang.Object)
	 */
	@Override
	public Boolean create(TitreCV t) {

		boolean createTitre = true;
		try {
			log.info("\033[43m----------------- IN create Adresse ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// Début de la transaction.
			Transaction tx = session.beginTransaction();

			// Sauvegarde ou mise à jour du profile.
			session.saveOrUpdate(t);
			tx.commit();

			log.debug("\033[42mProfile créer avec succès : " + t + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT create Adresse ----------------\033[0m\n");
		} catch (Exception e) {
			createTitre = false;
			log.error("\033[45mProblème dans la création de Adresse : " + e + "\033[0m\n");
		}

		return createTitre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#remove(int)
	 */
	@Override
	public void remove(long id) {

		try {
			log.info("\033[43m----------------- IN remove Adresse ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// Début de la transaction.
			Transaction tx = session.beginTransaction();

			// on récupère le profile à supprimer
			TitreCV t = session.load(TitreCV.class, id);

			if (t != null) {
				// On supprime le profile.
				session.delete(t);
			}

			tx.commit();

			log.debug("\033[42mProfile supprimé avec succès : \n" + t + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT remove Adresse ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[41mProblème dans la supression  de Adresse : " + e + "\033[0m\n");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#update(java.lang.Object)
	 */
	@Override
	public void update(TitreCV t) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		tx.commit();
		session.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findById(int)
	 */
	@Override
	public TitreCV findById(long id) {
		Session session = this.sessionFactory.openSession();
		TitreCV t = session.load(TitreCV.class, id);
		return t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findByCriteria(java.lang.
	 * String)
	 */
	@Override
	public List<TitreCV> findByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<TitreCV> titreCVList = session.createQuery("select * from TitreCV where criteria like %:param% ").setParameter("param", criteria).list();
		session.close();
		return titreCVList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.cv.service.interfaces.IService#findAll()
	 */
	@Override
	public List<TitreCV> findAll() {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<TitreCV> titreCVList = session.createQuery("from TitreCV").list();
		session.close();
		return titreCVList;
	}

}
