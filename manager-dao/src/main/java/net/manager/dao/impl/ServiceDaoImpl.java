package net.manager.dao.impl;

import net.manager.dao.ServiceDao;
import net.manager.model.Service;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ServiceDaoImpl extends AbstractGenericDao<Service> implements ServiceDao {

	public ServiceDaoImpl(){
		super(Service.class);
	}

	@Override
	public List<Service> getAll() {
		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Service> criteriaQuery = criteriaBuilder.createQuery(Service.class);
		Root<Service> root = criteriaQuery.from(Service.class);
		criteriaQuery.select(root);
		Query<Service> query = getCurrentSession().createQuery(criteriaQuery);
		return query.getResultList();
	}
}
