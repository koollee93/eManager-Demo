package net.manager.mvc.controller;

import net.manager.model.Employee;
import net.manager.mvc.response.EmployeeResponse;
import net.manager.mvc.response.EmployeesResponse;
import net.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewAllEmployeesControler {

	@Autowired
	private EmployeeService _employeeService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "viewAllEmployees",
			method = RequestMethod.GET)
	@ResponseBody
	public EmployeesResponse getAllEmployees() {

		List<Employee> allEmployees = _employeeService.getAll();

		List<EmployeeResponse> responseList = new ArrayList<>();

		for (Employee employee : allEmployees) {
			responseList.add(new EmployeeResponse(employee.getEmployeeId(), employee.getName()));
		}

		EmployeesResponse employeesResponse = new EmployeesResponse();
		employeesResponse.setEmployeeResponses(responseList);

		return employeesResponse;
	}
}
