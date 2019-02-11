package net.manager.mvc.controller;

import net.manager.model.Service;
import net.manager.mvc.request.AddRequest;
import net.manager.service.ServiceService;
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
public class AddServiceController {

	@Autowired
	private ServiceService _serviceService;

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "addService",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createAccount(@RequestBody @Valid AddRequest request) {
		Service service = new Service();
		service.setName(request.getTitle());

		_serviceService.save(service);
	}
}
