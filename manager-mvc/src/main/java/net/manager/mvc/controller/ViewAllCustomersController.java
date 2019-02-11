package net.manager.mvc.controller;

import net.manager.model.Customer;
import net.manager.mvc.response.CustomerResponse;
import net.manager.mvc.response.CustomersResponse;
import net.manager.service.CustomerService;
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
public class ViewAllCustomersController {

	@Autowired
	private CustomerService _customerService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "viewAllCustomers",
			method = RequestMethod.GET)
	@ResponseBody
	public CustomersResponse getAllCustomers() {

		List<Customer> allCustomers = _customerService.getAll();

		List<CustomerResponse> responseList = new ArrayList<>();

		for (Customer customer : allCustomers) {
			responseList.add(new CustomerResponse(customer.getCustomerId(),
					customer.getName()));
		}

		CustomersResponse customersResponse = new CustomersResponse();
		customersResponse.setCustomerResponses(responseList);

		return customersResponse;
	}
}
