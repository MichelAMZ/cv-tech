/**
 * 
 */
package com.mamouz.cv.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mamouz.cv.dao.interfaces.ITitreCV;
import com.mamouz.cv.entity.TitreCV;
import com.mamouz.cv.service.interfaces.ITitreService;

/**
 * @author mikak
 *
 */
@Service("titreCVService")
public class TitreCVServie implements ITitreService {
	@Resource(name="titreCVDao")
	ITitreCV titreCVDao;

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#create(java.lang.Object)
	 */
	@Override
	public Boolean create(TitreCV t) {
		
		boolean createTitre = true;
		try {
			titreCVDao.create(t);
		} catch (Exception e) {
			createTitre = false;
		}
		return createTitre;
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#remove(int)
	 */
	@Override
	public void remove(long id) {
		titreCVDao.remove(id);

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#update(java.lang.Object)
	 */
	@Override
	public void update(TitreCV t) {
		titreCVDao.update(t);

	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findById(int)
	 */
	@Override
	public TitreCV findById(long id) {
		return titreCVDao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findByCriteria(java.lang.String)
	 */
	@Override
	public List<TitreCV> findByCriteria(String criteria) {
		return titreCVDao.findByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.mamouz.cv.service.interfaces.IService#findAll()
	 */
	@Override
	public List<TitreCV> findAll() {
		return titreCVDao.findAll();
	}

}
