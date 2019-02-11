package net.manager.service.impl;

import net.manager.dao.EmployeeDao;
import net.manager.dao.GenericDao;
import net.manager.model.Employee;
import net.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends AbstractService<Employee> implements EmployeeService {

    @Autowired
    private EmployeeDao _employeeDao;

    @Override
    protected GenericDao<Employee> getEntityDao() {
        return _employeeDao;
    }
}
