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

import com.mamouz.cv.dao.interfaces.ILogin;
import com.mamouz.cv.entity.Login;
import com.mamouz.cv.entity.Profile;

/**
 * @author mikak
 *
 */
@Repository("loginDao")
public class LoginDao implements ILogin {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(ProfileDao.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.cv.dao.interfaces.ILogin#validateUser(com.mamouz.cv.entity.
	 * Login)
	 */
	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public Profile validateUser(Login login) {

		Session session = this.sessionFactory.openSession();

		// ProfileDao dao = new ProfileDao();
		long id = 0;
		String mail = null;
		String password = null;
		Profile p = new Profile();

		if (login != null) {
			String sql = "from Login where email='" + login.getEmail() + "' and password='" + login.getPassword() + "'";

			if (sql != null) {

				List<Login> logins = session.createQuery(sql).list();

				if (logins != null) {
					for (Login login2 : logins) {
						id = login2.getIdLogin();
						mail = login2.getEmail();
						password = login2.getPassword();
					}
				}

				// session.close(); TODO fermer la session ou non ?
				try {

					// Si les donn�es sont les m�me que les saisie
					if (mail.equals(login.getEmail()) && password.equals(login.getPassword())) {

						// On r�cup�re les donn�es du profile.
						p = session.load(Profile.class, id);

					} else {
						p = null;
					}

				} catch (Exception e) {

				} finally {
					return p;
				}
				// session.close();
			}
		}
		return p;
	}

	@Override
	public Boolean create(Login login) {
		boolean createLogin = true;
		try {
			log.info("\033[43m----------------- IN create LoginDao ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// D�but de la transaction.
			Transaction tx = session.beginTransaction();

			session.saveOrUpdate(login);
			tx.commit();

			log.debug("\033[42mProfile cr�er avec succ�s : " + login + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT create LoginDao ----------------\033[0m\n");
		} catch (Exception e) {
			createLogin = false;
			log.error("\033[45mProbl�me dans la cr�ation de LoginDao : " + e + "\033[0m\n");
		}

		return createLogin;
	}

	@Override
	public void remove(long id) {
		try {
			log.info("\033[43m----------------- IN remove login ----------------\033[0m\n");

			// ouverture de la session.
			Session session = this.sessionFactory.openSession();

			// D�but de la transaction.
			Transaction tx = session.beginTransaction();

			// on r�cup�re le profile � supprimer
			Login login = session.load(Login.class, id);

			if (login != null) {
				// On supprime le profile.
				session.delete(login);
			}

			tx.commit();

			log.debug("\033[42mlogin supprim� avec succ�s : \n" + login + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT remove login ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[41mProbl�me dans la supression  de Login : " + e + "\033[0m\n");
		}

	}

	@Override
	public void update(Login login) {
		// TODO Auto-generated method stub

	}

}
