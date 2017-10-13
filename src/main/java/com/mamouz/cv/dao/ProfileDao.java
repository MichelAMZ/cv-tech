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

import com.mamouz.cv.dao.interfaces.IProfile;
import com.mamouz.cv.entity.Profile;

/**
 * @author mikak
 *
 */
@Repository("profileDao")
public class ProfileDao implements IProfile {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(ProfileDao.class);

	@Override
	public Boolean create(Profile p) {

		boolean createProfile = true;
		try {
			log.info("\033[43m----------------- IN create Profile ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// D�but de la transaction.
			Transaction tx = session.beginTransaction();

			// Date de la cr�ation.
						
			session.saveOrUpdate(p);
			tx.commit();

			log.debug("\033[42mProfile cr�er avec succ�s : " + p + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT create Profile ----------------\033[0m\n");
		} catch (Exception e) {
			createProfile = false;
			log.error("\033[45mProbl�me dans la cr�ation de profile : " + e + "\033[0m\n");
		}

		return createProfile;
	}

	@Override
	public void remove(long id) {
		try {
			log.info("\033[43m----------------- IN remove Profile ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// D�but de la transaction.
			Transaction tx = session.beginTransaction();

			// on r�cup�re le profile � supprimer
			Profile p = session.load(Profile.class, id);

			if (p != null) {
				// On supprime le profile.
				session.delete(p);
			}

			tx.commit();

			log.debug("\033[42mProfile supprim� avec succ�s : \n" + p + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT remove Profile ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[41mProbl�me dans la supression  de profile : " + e + "\033[0m\n");
		}
	}

	@Override
	public void update(Profile p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(p);
		tx.commit();
		session.close();
	}

	@Override
	public Profile findById(long id) {
		Session session = this.sessionFactory.openSession();
		Profile p = session.load(Profile.class, id);
		return p;
	}

	@Override
	public List<Profile> findByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Profile> profileList = session.createQuery("select * from Profile where criteria like %:param% ")
				.setParameter("param", criteria).list();
		session.close();
		return profileList;
	}

	@Override
	public List<Profile> findAll() {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Profile> profileList = session.createQuery("from Profile").list();
		session.close();
		if (profileList == null) {
			Object obj = "Rien � afficher dans la liste !";
			return profileList = (List) obj;
		}

		return profileList;
	}

}
