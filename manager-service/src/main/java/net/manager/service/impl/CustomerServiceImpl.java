package net.manager.service.impl;

import net.manager.dao.CustomerDao;
import net.manager.dao.GenericDao;
import net.manager.model.Customer;
import net.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractService<Customer> implements CustomerService {

	@Autowired
	private CustomerDao _customerDao;

	@Override
	protected GenericDao<Customer> getEntityDao() {
		return _customerDao;
	}
}
