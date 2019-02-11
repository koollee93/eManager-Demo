package net.manager.dao.impl;

import net.manager.dao.ReservationDao;
import net.manager.model.Reservation;
import net.manager.model.Reservation;
import net.manager.model.Service;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ReservationDaoImpl extends AbstractGenericDao<Reservation> implements ReservationDao {

	public ReservationDaoImpl(){
		super(Reservation.class);
	}

	@Override
	public List<Reservation> getAll() {
		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Reservation> criteriaQuery = criteriaBuilder.createQuery(Reservation.class);
		Root<Reservation> root = criteriaQuery.from(Reservation.class);
		criteriaQuery.select(root);
		Query<Reservation> query = getCurrentSession().createQuery(criteriaQuery);
		return query.getResultList();
	}
}
