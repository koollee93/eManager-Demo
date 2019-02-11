package net.manager.service.impl;

import net.manager.dao.GenericDao;
import net.manager.dao.ReservationDao;
import net.manager.model.Reservation;
import net.manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl extends AbstractService<Reservation> implements ReservationService {
	@Autowired
	private ReservationDao _reservationDao;

	@Override
	protected GenericDao<Reservation> getEntityDao() {
		return _reservationDao;
	}
}
