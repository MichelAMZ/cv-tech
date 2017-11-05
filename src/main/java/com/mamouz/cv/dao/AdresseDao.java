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

import com.mamouz.cv.dao.interfaces.IAdresse;
import com.mamouz.cv.entity.Adresse;
import com.mamouz.cv.entity.Login;

/**
 * @author mikak
 *
 */
@Repository("adresseDao")
public class AdresseDao implements IAdresse {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	private static final Logger log = Logger.getLogger(ProfileDao.class);
	
	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#create(java.lang.Object)
	 */
	@Override
	public Boolean create(Adresse ad) {
		boolean createAdresse = true;
		try {
			log.info("\033[43m----------------- IN create Adresse ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// Début de la transaction.
			Transaction tx = session.beginTransaction();

			// Date de la création.
						
			session.saveOrUpdate(ad);
			tx.commit();

			log.debug("\033[42mAdresse créer avec succès : " + ad + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT create Adresse ----------------\033[0m\n");
		} catch (Exception e) {
			createAdresse = false;
			log.error("\033[45mProblème dans la création de profile : " + e + "\033[0m\n");
		}

		return createAdresse;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#remove(long)
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
			Adresse ad = session.load(Adresse.class, id);

			if (ad != null) {
				// On supprime le profile.
				session.delete(ad);
			}

			tx.commit();

			log.debug("\033[42mProfile supprimé avec succès : \n" + ad + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT remove Adresse ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[41mProblème dans la supression  de Adresse : " + e + "\033[0m\n");
		}

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#update(java.lang.Object)
	 */
	@Override
	public void update(Adresse ad) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(ad);
		tx.commit();
		session.close();

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#findById(long)
	 */
	@Override
	public Adresse findById(long id) {
		Session session = this.sessionFactory.openSession();
		Adresse ad = session.load(Adresse.class, id);
		return ad;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#findByCriteria(java.lang.String)
	 */
	@Override
	public List<Adresse> findByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Adresse> adresseList = session.createQuery("select * from Adresse where criteria like %:param% ")
				.setParameter("param", criteria).list();
		session.close();
		return adresseList;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.dao.interfaces.IDaoEntity#findAll()
	 */
	@Override
	public List<Adresse> findAll() {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Adresse> adresseList = session.createQuery("from Adresse").list();
		session.close();
		if (adresseList == null) {
			Object obj = "Rien à afficher dans la liste !";
			return adresseList = (List) obj;
		}

		return adresseList;
	}

	@Override
	public void register(Adresse user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Login validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


}
