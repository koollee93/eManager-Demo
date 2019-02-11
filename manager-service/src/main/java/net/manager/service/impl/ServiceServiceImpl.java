package net.manager.service.impl;

import net.manager.dao.GenericDao;
import net.manager.dao.ServiceDao;
import net.manager.model.Service;
import net.manager.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class ServiceServiceImpl extends AbstractService<Service> implements ServiceService {
	@Autowired
	private  ServiceDao _serviceDao;

	@Override
	protected GenericDao<Service> getEntityDao() {
		return _serviceDao;
	}
}
