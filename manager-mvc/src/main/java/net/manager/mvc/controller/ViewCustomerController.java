package net.manager.mvc.controller;

import net.manager.model.Customer;
import net.manager.mvc.request.IdRequest;
import net.manager.mvc.response.TitleResponse;
import net.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ViewCustomerController {

	@Autowired
	private CustomerService _customerService;

	@RequestMapping(value = "viewCustomer",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public TitleResponse viewCustomer(@RequestBody @Valid IdRequest request) {
		Optional<Customer> customer = _customerService.findById(request.getId());

		TitleResponse titleResponse = new TitleResponse();
		titleResponse.setTitle(customer.get().getName());

		return titleResponse;
	}
}
