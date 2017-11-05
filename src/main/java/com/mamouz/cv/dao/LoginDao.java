/**
 * 
 */
package com.mamouz.cv.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.jsp.tagext.TryCatchFinally;

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
				
				try {

					// Si les données sont les même que les saisie
					if (mail.equals(login.getEmail()) && password.equals(login.getPassword())) {

							// On récupère les données du profile.
						 p = session.load(Profile.class, id);
						 
					} else {
						p = null;
					}

				} catch (Exception e) {
					
				}
				finally {
					return p;
				}
//				session.close();
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

			// Début de la transaction.
			Transaction tx = session.beginTransaction();

			session.saveOrUpdate(login);
			tx.commit();

			log.debug("\033[42mProfile créer avec succès : " + login + "\033[0m\n");

			// fermeture de la session.
			session.close();

			log.info("\033[43m----------------- OUT create LoginDao ----------------\033[0m\n");
		} catch (Exception e) {
			createLogin = false;
			log.error("\033[45mProblème dans la création de LoginDao : " + e + "\033[0m\n");
		}

		return createLogin;
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
