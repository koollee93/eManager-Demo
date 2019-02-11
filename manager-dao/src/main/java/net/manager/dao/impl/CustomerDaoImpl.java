package net.manager.dao.impl;

import net.manager.dao.CustomerDao;
import net.manager.model.Customer;
import net.manager.model.Service;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomerDaoImpl extends AbstractGenericDao<Customer> implements CustomerDao {

	public CustomerDaoImpl() {
		super(Customer.class);
	}

	@Override
	public List<Customer> getAll() {
		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
		Root<Customer> root = criteriaQuery.from(Customer.class);
		criteriaQuery.select(root);
		Query<Customer> query = getCurrentSession().createQuery(criteriaQuery);
		return query.getResultList();
	}
}
