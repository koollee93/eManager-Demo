package net.manager.mvc.controller;

import net.manager.model.Customer;
import net.manager.mvc.request.AddRequest;
import net.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class AddCustomerController {
	@Autowired
	private CustomerService _customerService;

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "addCustomer",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCustomer(@RequestBody @Valid AddRequest request) {
		Customer customer = new Customer();
		customer.setName(request.getTitle());

		_customerService.save(customer);
	}

}
